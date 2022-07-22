classifica = localStorage.getItem('classifica') ? JSON.parse(localStorage.getItem('classifica')) : [];
const nameInput = document.querySelector('#name');


const username = localStorage.getItem('username') || '';

nameInput.value = username;

nameInput.addEventListener('change', (e) => {
    localStorage.setItem('username', e.target.value);
})
console.log(classifica)






let arrayAnimali = ['🐱', '🦉', '🐾', '🦁', '🦋', '🐛', '🐝', '🐬', '🦊', '🐨', '🐰', '🐯', '🐱', '🦉', '🐾', '🦁', '🦋', '🐛', '🐝', '🐬', '🦊', '🐨', '🐯', '🐰'];
//libreria per icone
//https://html-css-js.com/html/character-codes/


let arrayComparison = [];
let count = 0;
document.body.onload = startGame();

// mi serviranno alcune variabili 1. interval 2. una agganciata alla classe find 
// 3. una agganciata al'id modal 4. una agganciata alla classe timer
var interval;
var iconsFind = document.getElementsByClassName("find");
var modal = document.getElementById('modal');
var timer = document.querySelector(".timer");
let conTabella = document.querySelector("#containerTable")
/* function tabella() {
    
    let table = document.createElement('table');
    let thead = document.createElement('thead');
    var tbody = document.createElement('tbody');

    conTabella.appendChild(table);
    table.appendChild(thead);
    table.appendChild(tbody);

    let trIntestazione = document.createElement('tr');
    trIntestazione.setAttribute('id', 'intestazione')
    let th = document.createElement('th');

    thead.append(trIntestazione)

    for (let i = 0; i < 3; i++) {
        let th = document.createElement('th');
        th.setAttribute('id', 'int' + i)
        thead.append(th)
    }

    document.querySelector('#int0').innerHTML = 'NOME'
    document.querySelector('#int1').innerHTML = 'TEMPO'
    document.querySelector('#int2').innerHTML = 'CLICK'

} */

//una funzione che serve a mescolare in modo random gli elementi dell'array che viene passato 
// (l'array contiene le icone degli animali)

/* arrayAnimali.sort(() => 0.5 - Math.random())
la mescola dell'array in questo modo è molto più abbreviata ma certamente non della stessa qualità del fisher chiaramente, 
il funzionamento però è molto carino dato che con il metodo .sort andiamo a riordinare l'array secondo 2 parametri, in questo caso 0.5 e il numero generato da math.random() e quindi? semplice quest'ultimo ci genererà un numero decimale compreso tra 0 e 1, da comparare con il .sort a che cosa? a 0.5! e qundi abbiamo un 50 e 50 che un valore sia maggiore o minore di 5 ed andremo a 'ordinare' il nostro array in modo casuale!
.sort(() => 0.5 - Math.random())
*/

function shuffle(a) {
    var currentIndex = a.length;
    var temporaryValue, randomIndex;

    while (currentIndex !== 0) {
        randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex -= 1;
        temporaryValue = a[currentIndex];
        a[currentIndex] = a[randomIndex];
        a[randomIndex] = temporaryValue;
    }
    return a;
}
// una funzione che rimuove la classe active e chiama la funzione startGame()
function playAgain() {
    modal.classList.remove("active");
    startGame();
}
// la funzione startGame che pulisce il timer, dichiara un array vuoto, mescola casualmente l'array degli animali
// (var arrayShuffle = shuffle(arrayAnimali);), aggancia il contenitore con id griglia, 
// pulisce tutti gli elementi che eventualmente contiene
// poi fa ciclo per creare i 24 div child -> aggiunge la class e l'elemento dell'array in base all'indice progressivo
// chiama la funzione timer e associa a tutti gli elementi (div) di classe icon l'evento click e le due funzioni definit sotto

function startGame() {
    count = 0
    console.log('reset click ' + count);
    clearInterval(interval);
    arrayConfronto = [];

    var arrayShuffle = shuffle(arrayAnimali);

    var lista = document.getElementById('griglia');
    while (lista.hasChildNodes()) {
        lista.removeChild(lista.firstChild);
    }

    for (var i = 0; i < 24; i++) {
        // var id = 'icon-' + i;
        var box = document.createElement('div');
        var element = document.createElement('div');
        element.className = 'icon';
        document.getElementById('griglia').appendChild(box).appendChild(element);
        element.innerHTML = arrayShuffle[i];
    }


    startTimer();

    var icon = document.getElementsByClassName("icon");
    var icons = [...icon];

    for (var i = 0; i < icons.length; i++) {
        icons[i].addEventListener("click", displayIcon);
        icons[i].addEventListener("click", openModal);
    }
}



function displayIcon() {
    var icon = document.getElementsByClassName("icon");
    var icons = [...icon];

    /*
    var icon = document.getElementsByClassName("icon");
    var icons = [...icon];
    è uguale a 
    var icons = document.getElementsByClassName("icon");
    //var icons = [...icon];
    è un operatore che serve per passare un array come argomento:
    https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_syntax 
    https://www.tutorialspoint.com/es6/es6_operators.htm (cerca spread nella pagina)
    */

    //mette/toglie la classe show
    this.classList.toggle("show");
    //aggiunge l'oggetto su cui ha cliccato all'array del confronto
    arrayComparison.push(this);

    var len = arrayComparison.length;
    //se nel confronto ci sono due elementi
    if (len === 2) {
        //se sono uguali aggiunge la classe find
        if (arrayComparison[0].innerHTML === arrayComparison[1].innerHTML) {
            arrayComparison[0].classList.add("find", "disabled");
            arrayComparison[1].classList.add("find", "disabled");
            arrayComparison = [];
        } else {
            //altrimenti (ha sbagliato) aggiunge solo la classe disabled
            icons.forEach(function (item) {
                item.classList.add('disabled');
            });
            // con il timeout rimuove  la classe show per nasconderli
            setTimeout(function () {
                arrayComparison[0].classList.remove("show");
                arrayComparison[1].classList.remove("show");
                icons.forEach(function (item) {
                    item.classList.remove('disabled');
                    for (var i = 0; i < iconsFind.length; i++) {
                        iconsFind[i].classList.add("disabled");
                    }
                });
                arrayComparison = [];
            }, 700);
        }
    }
}
let resultDisplay = document.querySelector('#count')
//una funzione che viene mostrata alla fine quando sono tutte le risposte esatte
function openModal() {
    if (iconsFind.length == 24) {
        clearInterval(interval);
        modal.classList.add("active");
        let tempo = document.getElementById("tempoTrascorso").innerHTML
        tempo = timer.innerHTML;
        resultDisplay.textContent = count + 'click'
        let risultato = new Risultato(username, tempo, count)
        classifica.push(risultato);
        let strClassifica = JSON.stringify(classifica)
        localStorage.setItem('classifica', strClassifica)

        let headers = ['NOME', 'TEMPO', 'CLICK'];

        let table = document.createElement('table');
        let headerRow = document.createElement('tr');
        headers.forEach(headerText => {
            let header = document.createElement('th');
            let textNode = document.createTextNode(headerText);
            header.appendChild(textNode);
            headerRow.appendChild(header);
        });
        table.appendChild(headerRow);
        classifica.forEach(rec => {
            let row = document.createElement('tr');
            Object.values(rec).forEach(text => {
                let cell = document.createElement('td');
                let textNode = document.createTextNode(text);
                cell.appendChild(textNode);
                row.appendChild(cell);
            })
            table.appendChild(row);
        });
        conTabella.appendChild(table);



    }
}

// una funzione che nasconde la modale alla fine e riavvia il gioco
function closeModal() {
    modal.classList.remove("active");
    startGame();

}
// una funzione che calcola il tempo e aggiorna il contenitore sotto
function startTimer() {

    var s = 0; var m = 0; var h = 0;

    interval = setInterval(function () {
        timer.innerHTML = 'Tempo: ' + m + " min " + s + " sec";
        s++;
        if (s == 60) {
            m++;
            s = 0;
        }
        if (m == 60) {
            h++;
            m = 0;
        }
    }, 1000);
}






var icone = document.querySelector("#griglia")
icone.onclick = function () {
    count += 1;
    console.log(count);
};

function Risultato(username, tempo, count) {
    this.nome = username;
    this.record = tempo;
    this.click = count;
}

