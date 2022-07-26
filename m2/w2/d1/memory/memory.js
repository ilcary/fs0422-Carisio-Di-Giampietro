let memory = document.querySelector('#memory');
let start = document.querySelector('#start')

function createCard(icona){
    //<div class="icon"><div>🐱</div></div>
    let card = document.createElement('div');//<div></div>
    card.classList.add('icon','show');//<div class="icon"></div>

    let content = document.createElement('div');//<div></div>
    content.innerHTML = icona//<div>🐱</div>

    card.append(content)
    memory.append(card)
}

function shuffle(a){
    let i = 0;
    let newA = []
    while (i < a.length){
        let rand = Math.floor(Math.random() * a.length);
        newA.push(a[rand])
        a.splice(rand,1)
    }
    return newA;
}

function initMemory(){

    let arrayAnimali = ['🐱', '🦉', '🐾', '🦁', '🦋', '🐛', '🐝', '🐬', '🦊', '🐨', '🐰', '🐯', '🐱', '🦉', '🐾', '🦁', '🦋', '🐛', '🐝', '🐬', '🦊', '🐨', '🐯', '🐰'];

    memory.innerHTML = ''

    let shuffleArray = shuffle(arrayAnimali)

    for(let icon of shuffleArray){
        createCard(icon)
    }

}


start.addEventListener('click',initMemory)