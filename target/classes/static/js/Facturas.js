function getHeaders() {
    return {
        Accept: "application/json",
        "Content-Type": "application/json",
        Authorization: localStorage.token,
    };
}

async function cargarFacturas() {
    const request = await fetch("/factura", {
        method: "GET",
        headers: getHeaders(),
    });
    const facturas = await request.json();

    let listadoHtml = "";

    for (let factura of facturas) {
        let facturaHtml = ` <div class="facturasGuardadas">
                                <h5>Fecha: ${factura.fecha} </h5>
                                <h5>Concepto: ${factura.concepto}</h5>
                                <h5>IVA: ${factura.iva}</h5>
                                <h5>Cuota IVA: ${factura.cuotaIva}</h5>
                                <h5>Total: ${factura.total}</h5>
                            </div>`;

        listadoHtml += facturaHtml;
    }
    console.log(listadoHtml);
    document.querySelector(".reload").outerHTML = listadoHtml;

}

cargarFacturas();
