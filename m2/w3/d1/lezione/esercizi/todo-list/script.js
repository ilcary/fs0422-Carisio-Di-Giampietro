let bottone = document.querySelector('#salva');

//inizio
bottone.addEventListener('click', function(){

    let testo = document.querySelector('#testo');

    //creazione e compilazione del nuovo todo
    let frase = document.createElement('div');//<div></div>
    frase.innerHTML = testo.value;
    frase.classList.add('alert','alert-success')

    //gestione eleminazione todo
    frase.addEventListener('click', function(){
        frase.remove()
    })

    console.log(frase);
    //inserimento del todo nel dom
    document.querySelector('#lista').append(frase);

    //reset dell'input
    testo.value = ''

})