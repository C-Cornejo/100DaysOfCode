


function convertir(){

    var txtDecimal = document.getElementById("txtDecimal");
    var residuo = 1;
    var modulo = 1;
    var numero = txtDecimal.value;
    var binario = "";  
    if(!isNaN(numero)){
        while(residuo > 0 ){
            modulo = numero % 2;
            residuo =  Math.floor(numero / 2);
            binario = modulo.toString() + binario; 
            //se agrega adelante para invertir el orden y mostrarlo
            // correctamente 
            numero = residuo;
 
        } // fin de while
        var lblResultado = document.getElementById("lblResultado");
        lblResultado.textContent = binario;  
    }
}