
const URL = "https://restcountries.com/v3.1/all";
 const DATOS = {};
function obtenerPaises(){

 fetch(URL).then(
    respuesta =>{
        if(!respuesta.ok)
        {
            throw new Error("Error de red");
        }

        return Response.json;
    }).then(datos => {
        DATOS = datos;
    }).catch(error =>{
        console.error("Error",error);
    });

}