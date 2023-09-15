
const paises = [
    { nombre: 'Estados Unidos', poblacion: 331002651 },
    { nombre: 'Canadá', poblacion: 37742154 },
    { nombre: 'México', poblacion: 126190788 },
    { nombre: 'Brasil', poblacion: 211049527 },
    { nombre: 'Argentina', poblacion: 45195777 },
    { nombre: 'Colombia', poblacion: 50882891 },
    { nombre: 'Perú', poblacion: 32971846 },
    { nombre: 'Chile', poblacion: 19116201 },
    { nombre: 'Ecuador', poblacion: 17643054 },
    { nombre: 'Venezuela', poblacion: 28435943 },
    { nombre: 'Uruguay', poblacion: 3473727 },
    { nombre: 'Paraguay', poblacion: 7132530 },
    { nombre: 'Bolivia', poblacion: 11673021 },
    { nombre: 'Guatemala', poblacion: 17915568 },
    { nombre: 'Honduras', poblacion: 9904607 },
    { nombre: 'El Salvador', poblacion: 6486205 },
    { nombre: 'Nicaragua', poblacion: 6624554 },
    { nombre: 'Costa Rica', poblacion: 5094118 },
    { nombre: 'Panamá', poblacion: 4314767 },
    { nombre: 'España', poblacion: 46754778 },
    { nombre: 'Francia', poblacion: 65273511 },
    { nombre: 'Alemania', poblacion: 83783942 },
    { nombre: 'Italia', poblacion: 60461826 },
    { nombre: 'Reino Unido', poblacion: 67886011 },
    { nombre: 'Portugal', poblacion: 10196709 },
    { nombre: 'Marruecos', poblacion: 36910560 },
    { nombre: 'Egipto', poblacion: 102334404 },
    { nombre: 'Nigeria', poblacion: 206139587 },
    { nombre: 'Kenia', poblacion: 53771296 },
    { nombre: 'Sudáfrica', poblacion: 59308690 },
    { nombre: 'Nigeria', poblacion: 206139587 },
  ];
  



  const elemento_input = document.getElementById("txtBusqueda");
  
  elemento_input.addEventListener("input",filtrar);
  document.addEventListener("DOMContentLoaded",filtrar);

function filtrar(){
    console.log("Estamos a punto de filtrar...");
    let txtBusqueda = document.getElementById("txtBusqueda");
    let s = txtBusqueda.value.trim();
    let filtrados = [];
    if(s.length == 0)
    {
        mostrar(paises);
    }
    if(s.length > 0)
    {
        filtrados = paises.filter(pais => pais.nombre.includes(s));
        mostrar(filtrados);
        console.log(`El valor a buscar es: ${s}`);
        console.log(filtrados);
    }
}

function mostrar(lista){
    let lista_paises = document.getElementById("lista_paises");

    lista_paises.innerHTML = "";
    let str = "";
    lista.forEach(actual => {
        str += `<li class="list-group-item">${actual.nombre}</li>`;
    });
    lista_paises.innerHTML = str;
    
}
