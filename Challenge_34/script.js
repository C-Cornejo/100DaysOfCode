

const N_PAREJAS = 8;
const TIMING = 1100;
let simbolos = [];
let cartas = document.querySelectorAll(".carta");
let cuenta_volteados = 0;
let volteados = new Array();
let disponibles = N_PAREJAS;
let tablero = document.getElementById("tablero");

for (let index = 0; index < cartas.length; index++) {
    const actual = cartas[index];
    actual.id = index;
    actual.addEventListener('click',()=>{
        tablero.classList.add('bloquear');
        console.log("bloqueado");
       clickhandler(actual);
        
    });
  
};
function clickhandler(actual)
{
   
        let delantera = actual.getElementsByClassName("cara-delantera")[0];

        let cartaId = delantera.getAttribute("data-id");
        console.log(`Control: item delantera:  ${cartaId}`);
        
       if(cuenta_volteados <= 1)
       {
           volteados[cuenta_volteados] = {id:cartaId,divId:actual.id};

           cuenta_volteados++;
           
            voltear(actual);
       }
         if(cuenta_volteados == 2)
       {
        if(comparar())
        {
                // aumentar puntaje 
                //disminur parejas disponibles
                disponibles--;
                if(disponibles == 0)
                {
                    setTimeout(()=>{alert("Ganaste!");},TIMING);
                }
        }
        else
        {
            setTimeout(falloPareja,TIMING);
        }
         cuenta_volteados = 0;

        }
      setTimeout(() => {
        tablero.classList.remove("bloquear");
        console.log("desbloqueado");
      }, TIMING);
}
function falloPareja()
{
    voltear(document.getElementById(volteados[0].divId));
    voltear(document.getElementById(volteados[1].divId));
    volteados  = new Array();
   
}

function voltear(actual)
{
    let delantera = actual.getElementsByClassName("cara-delantera")[0];
    let trasera   = actual.getElementsByClassName("cara-trasera")[0];
    alternarClase(delantera,'ocultar');
    alternarClase(trasera  ,'ocultar');
    alternarClase(actual   ,'flipped');
}

function comparar()
{   
    let carta1 = volteados[0].id;
    let carta2 = volteados[1].id;

    if(carta1 == carta2)
    {
        return true;
    }
    return false;
}

function alternarClase(obj,clase)
{
  obj.classList.toggle(clase);
    
}