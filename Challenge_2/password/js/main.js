

var inputElement = document.getElementById("txtContra");
inputElement.addEventListener('input',
    function(){

        var valor = inputElement.value;
        verificar(valor);
    });

function verificar(valor){
    var caracter_esp = 0; // debe tener 2
    var mayus = false; // debe tener al menos una mayuscula
    var num = false;  // debe tener al menos un número
    var longitud = false;
    var especiales_regex = /^[a-zA-Z0-9]+$/;
    var mayusculas_regex = /[A-Z]+$/;
    
   
    if(valor.length >= 3){
        if(valor.length >= 9){
                 longitud = true;
            }
    
        valor =  valor.split(''); //convierte la cadena de caracter en arreglo de caracteres
        
        valor.forEach(caracter => {
        if(mayusculas_regex.test(caracter)){
            mayus=true;
        }
        if(!isNaN(caracter)){
            num=true;
        }
        
        if(!especiales_regex.test(caracter)){
        caracter_esp++;
        }
                       
        });
        console.log("mayus: "+mayus+",nums: "+num+",esp: "+caracter_esp);

    }// fin de if length <= 3

    // Utilizando el accesso al DOM con javascript
    // referenciamos los elementos html y luego obtenemos sus valores
    var txtContra = document.getElementById("txtContra");
    txtContra.classList.remove("border-danger");
    txtContra.classList.remove("border-success");
    
    if(num && (caracter_esp >= 2) && longitud && mayus)
    {
        console.log("Aceptada");
        txtContra.classList.add("border-success");
    }else{
        txtContra.classList.add("border-danger");
    }
   
    var s = "";
    if(num){
         s += "<li>La contraseña contiene números.</li>"
    }
    if(longitud){s += "<li>La contraseña tiene mas de 9 caracteres.</li>"}
    if(caracter_esp >= 2){s += "<li>La contraseña contiene 2 caracteres especiales.</li>"}
    if(mayus){s += "<li>La contraseña contiene tiene 2 mayúsculas.</li>"}

    var resultado =`<ul>
        ${s}
        </ul>`;
    var elemento = document.getElementById("lblResultado");
    elemento.innerHTML = resultado;

}