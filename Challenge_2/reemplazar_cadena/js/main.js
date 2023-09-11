
function reemplazar()
{
    var txtBusqueda = document.getElementById("txtBusqueda");
    var txtReemplazo = document.getElementById("txtReemplazo");

    var lblTexto = document.getElementById("lblTexto");
    var texto = lblTexto.textContent;
   
        var resultado = texto.replace(new RegExp(txtBusqueda.value, 'g'), txtReemplazo.value);
          //El parametro g le dice que debe reemplazar todas las incidencias
        lblTexto.textContent = resultado; // Usar textContent para establecer el nuevo texto

    
   
    lblTexto.value = resultado;
}