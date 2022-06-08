function getHeaders() {
  return {
    Accept: "application/json",
    "Content-Type": "application/json",
    Authorization: localStorage.token,
  };
}

async function cargarPersonas() {
  const request = await fetch("/persona", {
    method: "GET",
    headers: getHeaders(),
  });
  const personas = await request.json();

  let listadoHtml = "";
  console.log(personas);

  for (let persona of personas) {
    let personaHtml = `<div class="table">
                              <div class="cont-entry">
                                <div class="entry">${persona.id}  </div>
                                <div class="entry">${persona.nombre}  </div>
                                <div class="entry">${persona.apellidoPaterno}  </div>
                                <div class="entry">${persona.apellidoMaterno}  </div>                              
                              </div>
                              <div class="cont-edit">
                                <div class="entry eliminar">  Eliminar  </div>
                                <div class="entry editar">  Editar  </div>
                              </div>
                              
                         </div><br>`;

    listadoHtml += personaHtml;
  }

  document.querySelector(".content").outerHTML = listadoHtml;
}

cargarPersonas();
console.log("wenas");
