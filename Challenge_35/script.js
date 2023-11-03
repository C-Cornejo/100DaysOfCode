
let mostrarDesplegable = false;

let btnDesplegable = document.getElementById("btnDesplegable");
let menu = document.getElementById("contactoDesplegable");

btnDesplegable.addEventListener('click',(event)=>{

    menu.classList.remove('ocultar-desplegable');
    console.log("event1");
    event.stopPropagation();
});

document.addEventListener('click',(event)=>{
        if(!menu.contains(event.target) && event.target !== btnDesplegable)
        {
            menu.classList.add("ocultar-desplegable");
            console.log("event3");
        }
        console.log("event2");
});

