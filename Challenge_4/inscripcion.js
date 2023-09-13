


class Estudiante {
    id;
    nombre;
    puntaje;
    materias_inscritas;

    constructor(id,nombre, puntaje){
        this.id = id;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.materias_inscritas = new Array();
    }
};

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

}

const lista_materias = [
new Materia(10,"Historia",17,["Lunes y Martes 3:00pm","Lunes y Martes 9:00am","Lunes y Martes 5:00pm"]),
new Materia(11,"Humanistica",10,["Lunes y Martes 3:00pm","Lunes y Martes 9:00am","Lunes y Martes 5:00pm"]),
new Materia(12,"Valores",22,["Lunes y Martes 3:00pm","Lunes y Martes 9:00am","Lunes y Martes 5:00pm"])];


   let lista_estudiantes= [ new Estudiante(34,"Luna",30),new Estudiante(44,"Chris",25), new Estudiante(45,"Alexander",15)];

   var btnBuscar = document.getElementById("btnBuscar");
   btnBuscar.addEventListener("click",buscarEstudiante);
  
   /*  
        Codigo
   */
    console.log(lista_materias);
    console.log(lista_estudiantes);
    //llenarMaterias(15);
   
    function buscarEstudiante()
    {

        var txtBusqueda = document.getElementById("txtBusqueda");

        var id = isNaN(txtBusqueda.value) ? 0:txtBusqueda.value;
        var actual;
        lista_estudiantes.forEach(e => {
            
            if(e.id == id){
                actual = e;
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
                                        <input class="form-check-input me-1" name="${m.id}" type="radio" value="" aria-label="...">
                                        ${h}
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

    function cargarMateria(id){

        seleccionar
    }