const api_url = 'json/users.json'
const display = document.querySelector('#display')

class Carta {
    constructor(__username, __firstName, __lastName, __gender, __email) {
        this.username = __username;
        this.firstName = __firstName;
        this.lastName = __lastName;
        this.gender = __gender;
        this.email = __email;

        this.cardHTML()
    }

    takeClassAndWrite(card, classe, write) {//here we only eat spaghetti  we don't write them
        let element = card.querySelector(classe);//so whe make a method to search and write into HTML
        element.textContent = write
        return element;
    }

    cardHTML() {
        let card = document.querySelector('#cardTemplate .card').cloneNode(true) //here we make the sauce, a card template and with the first method whe write the data collected from the fetch
        console.log(this.username)
        this.takeClassAndWrite(card, '.card .card-title', `Nickname:  ${this.username}`)
        this.takeClassAndWrite(card, '.card ul > li', `FirstName:  ${this.firstName}`)
        this.takeClassAndWrite(card, '.card li:nth-child(2)', `LastName:  ${this.lastName}`)
        this.takeClassAndWrite(card, '.card li:nth-child(3)', `Gender:  ${this.gender}`)
        this.takeClassAndWrite(card, '.card li:nth-child(4)', `@email:  ${this.email}`)
        display.append(card)
    }
}

fetch(api_url)//make the call
    .then(res => res.json())//get an answer an convert in to json the content
    .then(utenti => {//now i've the data i can do what i want
        console.log(utenti);
        for (let utente of utenti) {
            let card = new Carta(utente.username, utente.firstName, utente.lastName, utente.gender, utente.email)
        }
    })

//SPAGHETTI MODE TO CREATE A CARD================
/* let userNameBox = card.querySelector('.card .card-title')//gli scrivo il nome utente
                    userNameBox.innerText = `Nickname:  ${this.username}`

                    let firstNameBox = card.querySelector('.card ul > li')
                    firstNameBox.innerText ='Nome: ' + this.firstName

                    let lastNameBox = card.querySelector('.card li:nth-child(2)')
                    lastNameBox.innerText ='Cognome: ' + this.lastName

                    let genderBox = card.querySelector('.card li:nth-child(3)')
                    genderBox.innerText ='Gender: ' + this.gender

                    let emailBox = card.querySelector('.card li:nth-child(4)')
                    emailBox.innerText ='@email: ' + this.email

                    console.log(card)
                    display.append(card) */