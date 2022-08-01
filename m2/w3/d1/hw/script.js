listaUtenti = localStorage.getItem('listaUtenti') ? JSON.parse(localStorage.getItem('listaUtenti')) : [];

console.log(listaUtenti);


class Utenti {



    constructor() {
        this.nome = '';
        this.cognome = '';
        this.nascita = '';

        //bottone per input
        this.eventBottone();



    }

    eventBottone() {
        let bottone = document.querySelector('#btnInvio');
        bottone.addEventListener('click', () => this.createUser());
    }



    createUser() {
        let nome = document.querySelector('#firstName').value;
        let cognome = document.querySelector('#lastName').value;
        let nascita = document.querySelector('#nascita').value;

        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;

        this.createTableHTML()
        
    }



    createTableHTML() {
        let arrutenti = [this.nome, this.cognome, this.nascita];
        let tabella = document.querySelector('#tabella');
        let tr = document.createElement('tr');
        tabella.appendChild(tr);

        for (let utente of arrutenti) {
            let td = document.createElement('td')
            td.innerText = utente;
            tr.appendChild(td)
        }
        this.aggiornaListaUtenti()
    }

    aggiornaListaUtenti() {
        function Utente(nome, cognome, nascita) {
            this.nome = nome;
            this.cognome = cognome;
            this.nascita = nascita;
        }
        let user = new Utente(this.nome, this.cognome, this.nascita);
        listaUtenti.push(user);
        let strlistaUtenti = JSON.stringify(listaUtenti)
        localStorage.setItem('listaUtenti', strlistaUtenti)
    }
}

let utente1 = new Utenti();













/* 
        

         */