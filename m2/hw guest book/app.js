const apiMessaggi = 'http://localhost:3000/messaggi'

//seleziono il bottone che mi permetterà di inviare il form 
let btn = document.querySelector('#sendit')
//seleziono il form che userò per creare dei messaggi
let form = document.querySelector('#formMess')

//creo una classe per fare i messaggi e salvarli
class Message {
    constructor(__firstName, __lastName, __message) {
        this.firstName = __firstName;
        this.lastName = __lastName;
        this.message = __message;
        this.takeform();
    }
    //prendo il contenuto di ogni singolo input
    takeform() {

        this.firstName = form.querySelector('#firstName').value
        this.lastName = form.querySelector('#lastName').value
        this.message = form.querySelector('#message').value
    }

}

//classe per creare una carta in html tramite dei parametri
class Card{
    constructor(__firstName, __lastName, __message){
        this.firstName = __firstName;
        this.lastName = __lastName;
        this.message = __message;
        this.createcard();
    }

    // metodo per snellire il codice per scrivere all'interno della carta
    takeClassAndWrite(card, classe, write) {
        let element = card.querySelector(classe);
        element.textContent = write
        return element;
    }

    //creazione dell'html tramite il duplicato in d-none
    createcard() {
        let carta = document.querySelector('#cardTemplate').cloneNode(true);
        this.takeClassAndWrite(carta, 'p',  this.message )
        this.takeClassAndWrite(carta, 'cite', ` ${this.firstName} ${this.lastName} `)
        document.querySelector('#displaycard').append(carta)
    }
}

//al caricamento della pagina lancio una funzione che mi carica tutti i messaggi
window.onload = () => {

    fetch(apiMessaggi)
    .then(res=>res.json())
    .then(mess=>{
        for(let m of mess){
            // nuova istanza di Card per ogni messaggio presente nella rotta
            new Card(m.firstName, m.lastName, m.message)
        }
    })

}


// validazione del form
function validate(form) {
    console.log(form)
    let inputs = form.querySelectorAll('input')
    for (let i of inputs) {
        // validazione easy se è vuoto ti mando un alert dove ti dico qaule input
        if (i.value == "") {
            swal({
                icon: 'error',
                title: 'Oops...',
                text: `Please provide a valid ${i.dataset.inpt}`,
            })
            return false;
        }
    }
    return (true);
}

//creazione del messaggio e salvataggio nel server
btn.addEventListener('click', (e) => {
    e.preventDefault();

    if (!(validate(form)))
    return
  //  nuova istanza di Message da mandare alla nostra apiMessaggi
    let messaggio = new Message(firstName, lastName, message)

    let options = {
        method: 'POST',
        body: JSON.stringify(messaggio),
        headers: {
            "content-type": "application/json"
        }
    }

    fetch(apiMessaggi, options)
    .then(res => res.json())
    .then(res =>{
        swal({// se tutto andra a buon fine avviso l'utente con un alert
            icon: 'success',
            title: 'Good job your message has been created!',
            text: `The user ${res.firstName} ${res.lastName} has sent a new message!`,
            showConfirmButton: false,
            timer: 5000
        }).then(() => location.href = 'index.html')
    })

})

