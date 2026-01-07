function sendStatus(message) {
    alert("Button clicked: " + message);
}


function sendStatus(status) {
    
    fetch("http://localhost:8081/walk/status", {

        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            walkStatus: status
        })
    })
    .then(response => response.text())
    .then(data => alert(data))
    .catch(error => console.error("Error:", error));
}
