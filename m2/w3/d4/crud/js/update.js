const apiUtenti = 'http://localhost:3000/utenti';

let button = document.querySelector('#update button');


let params = new URLSearchParams(location.search);//preparo l'oggetto che mi permettera di lavorare con i quary params
if (!params.has('id')) {//allontano utenti che provano ad entrare se l'id non è tra i parametri
    location.href = 'index.html'
}
let userId = params.get('Id');

fetch(apiUtenti + '/' + userId)//ottengo la risorsa singola
    .then(res => res.json())
    .then(utente => {
        //mi aggancio ai campi che devo leggere
        let nome = document.querySelector('#nome')
        let cognome = document.querySelector('#cognome')
        let eta = document.querySelector('#eta')


        //mi aggancio ai campi che devo riempire
        nome.value = utente.nome
        cognome.value = utente.cognome
        eta.value = utente.eta


    })


button.addEventListener('click', function (e) {
    e.preventDefault();
    //mi aggancio ai campi che devo leggere
    let nome = document.querySelector('#nome')
    let cognome = document.querySelector('#cognome')
    let eta = document.querySelector('#eta')
    //mi preparo l'oggetto
    let user = {
        nome: nome.value,
        cognome: cognome.value,
        eta: eta.value
    }

    let options = {
        method: 'PUT',
        body: JSON.stringify(user),
        headers: {
            "content-type": "application/json"
        }
    }

    fetch(apiUtenti, options)
        .then(res => res.json())
        .then(res => {
            Swal.fire({
                position: 'top-end',
                icon: 'success',
                title: 'Nuovo utente creato',
                text: `L'utente ${res.nome} ${res.cognome} con id ${res.id} è stato creato`,
                showConfirmButton: false,
                timer: 5000
            }).then(res => {
                location.href = 'index.html'
            })
        })
})