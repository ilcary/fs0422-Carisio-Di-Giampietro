const apiUtenti = 'http://localhost:3000/utenti';


let params = new URLSearchParams(location.search);//preparo l'oggetto che mi permetterà di lavorare con i query params

if(!params.has('id')){//allontano l'utente se l'id non è tra i query params
    location.href = 'index.html'
}

let userId = params.get('id')//ottengo l'id dell'utente

fetch(apiUtenti+'/'+userId)//uso l'id per fare una chiamata api ed ottenere la risorsa singola
.then(res => res.json())
.then(utente => {
    //mi aggancio ai campi che devo riempire
    let nome = document.querySelector('#nome')
    let cognome = document.querySelector('#cognome')
    let eta = document.querySelector('#eta')

    //uso la risposta per riempire i campi
    nome.value = utente.nome
    cognome.value = utente.cognome
    eta.value = utente.eta
})



let button = document.querySelector('#update button');
//preparo la modifica dell'utente
button.addEventListener('click',function(e){
    e.preventDefault();

    //mi aggancio ai campi che devo leggere
    let nome = document.querySelector('#nome')
    let cognome = document.querySelector('#cognome')
    let eta = document.querySelector('#eta')

    //preparo l'oggetto modificato
    let user = {
        nome: nome.value,
        cognome: cognome.value,
        eta: eta.value
    }

    let options = {
        method: 'PUT',
        body: JSON.stringify(user),
        headers:{
            "content-type":"application/json"
        }
    }
    
    fetch(apiUtenti+'/'+userId,options)
    .then(res => res.json())
    .then(res => {
        Swal.fire({
            position: 'top-end',
            icon: 'success',
            title: 'Utente aggiornato',
            text:`L'utente ${res.nome} ${res.cognome} con id ${res.id} è stato aggiornato`,
            showConfirmButton: false,
            timer: 5000
        }).then(() =>{
            location.href = 'index.html'
        })
    })
})