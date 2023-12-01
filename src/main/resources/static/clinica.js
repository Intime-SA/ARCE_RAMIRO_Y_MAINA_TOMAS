document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("contactForm");

    if (form) {
        form.addEventListener("submit", function (event) {
            event.preventDefault();

            const matricula = document.getElementById("matricula").value;
            const nombre = document.getElementById("name").value;
            const apellido = document.getElementById("apellido").value;

            // Crear un objeto con los datos del formulario
            const formData = {
                matricula: matricula,
                nombre: nombre,
                apellido: apellido,
            };

            // Realizar la solicitud POST a la API utilizando fetch
            fetch("http://localhost:8081/odontologos/registrar", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify(formData),
            })
            .then((response) => response.json())
            .then((data) => {
                // Manejar la respuesta de la API aquí
                console.log("Respuesta de la API:", data);

                // Mostrar datos en el div "MostrarDatos"
                MostrarDatos(matricula, nombre, apellido);
            })
            .catch((error) => {
                // Manejar errores de la solicitud
                console.error("Error en la solicitud:", error);
            });
        });
    }
});

function MostrarDatos(matricula, nombre, apellido) {
    let EnPantalla = "Matricula: " + matricula + "<br>Nombre: " + nombre + "<br>Apellido: " + apellido;

    document.getElementById("MostrarDatos").innerHTML = EnPantalla;
}






