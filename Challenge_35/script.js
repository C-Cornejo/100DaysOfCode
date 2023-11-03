
let mostrarDesplegable = false;

let btnDesplegable = document.getElementById("btnDesplegable");
let menu = document.getElementById("contactoDesplegable");

btnDesplegable.addEventListener('click',(event)=>{

    menu.classList.remove('ocultar-desplegable');
   // evitamos que el evento se propague para que el otro event listener no haga falso positivo
    event.stopPropagation();
});

document.addEventListener('click',(event)=>{
        if(!menu.contains(event.target) && event.target !== btnDesplegable)
        {
            menu.classList.add("ocultar-desplegable");    
        }

});

