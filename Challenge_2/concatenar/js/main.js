


function concatenar(){

    
    // Utilizando el accesso al DOM con javascript
    // referenciamos los elementos html y luego obtenemos sus valores
    var lblResultado = document.getElementById("lblResultado");
    var txtCadena1 = document.getElementById("txtCadena1");
    var txtCadena2 = document.getElementById("txtCadena2");


    var resultado = txtCadena1.value + txtCadena2.value;
    
    lblResultado.textContent = resultado;

}