


class Estudiante {
    id;
    nombre;
    puntaje;
    materias_inscritas;

    constructor(id,nombre, puntaje){
        this.id = id;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.materias_inscritas = new Array(); // este objeto no es un obj materia es un objeto que tiene materia y horario
    }
};

class Horario{
    id;
    horario;
    constructor(id,horario)
    {
        this.id = id;
        this.horario = horario;
    }
}

class Materia{

    id;
    puntaje_req;
    titulo;
    horarios;

    constructor(id,titulo, puntaje_req,horarios){
        this.id = id;
        this.titulo = titulo;
        this.puntaje_req = puntaje_req;
        this.horarios = horarios;
    }

     getHorario(id)
    {
        for (let i = 0; i < this.horarios.length; i++) {
            let actual = this.horarios[i];
            if(actual.id == id){
                return actual.horario;
            }
        }   
    }

}

const lista_materias = [
new Materia(10,"Historia",1,[{id:7,horario:"Lunes y Martes 3:00pm"},{ id:9,horario:"Lunes y Martes 9:00am"},{ id:11,horario:"Lunes y Martes 5:00pm"}]),
new Materia(11,"Humanistica",10,[{id:7,horario:"Lunes y Martes 3:00pm"},{ id:9,horario:"Lunes y Martes 9:00am"},{ id:11,horario:"Lunes y Martes 5:00pm"}]),
new Materia(12,"Valores",22,[{id:7,horario:"Lunes y Martes 3:00pm"},{ id:9,horario:"Lunes y Martes 9:00am"},{ id:11,horario:"Lunes y Martes 5:00pm"}])];


   let lista_estudiantes= [ new Estudiante(34,"Luna",30),new Estudiante(44,"Chris",25), new Estudiante(45,"Alexander",15)];

   var estudiante_actual;
   var btnBuscar = document.getElementById("btnBuscar");
   var btnAgregar = document.getElementById("btnAgregar");
   var btnInscribir = document.getElementById("btnInscribir");

   btnBuscar.addEventListener("click",buscarEstudiante);
   btnAgregar.addEventListener("click",agregar);
   btnInscribir.addEventListener("click",inscribir)
  
   /*  
        Codigo
   */
    console.log(lista_materias);
    console.log(lista_estudiantes);
    //llenarMaterias(15);
   
    // Funcion que maneja el evento 
    function buscarEstudiante()
    {

        var txtBusqueda = document.getElementById("txtBusqueda");

        var id = isNaN(txtBusqueda.value) ? 0:txtBusqueda.value;
        var actual;
        lista_estudiantes.forEach(e => {
            
            if(e.id == id){
                actual = e;
                estudiante_actual = e;
                console.log(actual);
            }
        });   
        
        console.log(`Buscando a ${actual.id}`);
        console.log(`con puntaje ${actual.puntaje}`);
        llenarMaterias(actual.puntaje);
    }

    function llenarMaterias(puntaje){
        var acordion = document.getElementById("accordionExample");

        acordion.innerHTML = "";
        let nueva_materia;
        lista_materias.forEach(m => {
           nueva_materia= "";
            if (m.puntaje_req <= puntaje){

                
                 nueva_materia =`
            <div class="accordion-item">
                            <h2 class="accordion-header">
                              <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#${m.titulo}" aria-expanded="false" aria-controls="${m.titulo}">
                              ${m.titulo}
                              </button>
                            </h2>
                            <div id="${m.titulo}" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                              <div class="accordion-body">
                                  <ul class="list-group">`;

                        m.horarios.forEach(h=>{
                            nueva_materia += `<li class="list-group-item">
                                        <input class="form-check-input me-1" name="${m.id}" type="radio" value="${h.id}" aria-label="...">
                                        ${h.horario}
                                      </li>`;
                        });

                         nueva_materia += `</ul>
                              </div>
                            </div>
                          </div>`;
            }
           
            acordion.innerHTML += nueva_materia;    
        });
    }

    function agregar(){

        let acordion = document.getElementById("accordionExample");
        let ls_inscritos = document.getElementById("lsInscritos");
        let elementos = acordion.getElementsByTagName("input");
        let h_incsritos = "";
        estudiante_actual.materias_inscritas = new Array();
        
        for (let i = 0; i < elementos.length; i++) {
            const actual = elementos[i];
            if(actual.type == "radio"){
                if(actual.checked){
                    console.log(`Id materia: ${actual.name }, id horario: ${actual.value}`);
                    h_incsritos += generarItem(actual.name,actual.value);
                    let materia = obtenerMateria(actual.name);
                    let inscripcion = {"materia":materia,"id_horario":actual.value};
                    estudiante_actual.materias_inscritas.push(inscripcion);
                    console.log("Se agrego materia al arreglo...");
                }
            }
        }
        
        ls_inscritos.innerHTML = "";
        ls_inscritos.innerHTML = h_incsritos;
        console.log("h_inscritos: "+h_incsritos);
        
    }

    function generarItem(m_id,h_id){
        let item = "";
        for(let i = 0;i < lista_materias.length;i++)
        {   
            let actual = lista_materias[i];
            if(actual.id == m_id){
                item = `<li class="list-group-item" id=${actual.id}_${h_id}>${actual.titulo} - ${actual.getHorario(h_id)}</li>`;   
                return item;
            }
        }
    }

    function inscribir()
    {
        let boleta = document.getElementById("boleta");


        let lblFecha = document.getElementById("lblFecha");
        let lbldetalle = document.getElementById("lblDetalle");
        let lblNombre = document.getElementById("lblNombre");;
        lbldetalle.innerHTML="";       
        if(estudiante_actual.materias_inscritas.length > 0){

            lblNombre.innerHTML = estudiante_actual.nombre;
                lblFecha.innerHTML = obtenerFecha();
                console.log(`Leyendo materias inscritas: ${estudiante_actual.materias_inscritas.length}`);
                for (let j = 0; j < estudiante_actual.materias_inscritas.length; j++) {

                    let e = estudiante_actual.materias_inscritas[j];
                    let materia = e.materia;
                    let horario = materia.getHorario(e.id_horario);
                  
                    
                    lbldetalle.innerHTML += `<li> ${materia.titulo} : ${horario} </li>`;
                    
                }      
            boleta.classList.remove("d-none");
            
        }
        else{
            alert("Debe agregar al menos 1 materia para inscribir...")
        }
    }

    function obtenerFecha()
    {
        let fecha;
        let obj = new Date();

        fecha = `${obj.getDate()} / ${ obj.getMonth() + 1 } / ${obj.getFullYear()}. ${obj.getHours()}:${obj.getMinutes()}`;
        return fecha;
    }

    function obtenerMateria(id){
        for (let i = 0; i < lista_materias.length; i++) {
            const m = lista_materias[i];
            if(m.id == id)
            {
                return m;
            }
        }
        return null;
    }