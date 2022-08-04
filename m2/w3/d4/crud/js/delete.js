function eliminaUtente(id) {
    const apiUtenti = 'http://localhost:3000/utenti';
    fetch(apiUtenti + '/' + id, {

    })
        .then(response => response.json())
        .then(data => {

        })
}