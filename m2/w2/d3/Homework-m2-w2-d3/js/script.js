const btn1 = document.querySelector('#btn1');
const btn2 = document.querySelector('#btn2');
const immagine = document.querySelector('#img');

function spin(){
    immagine.classList.toggle('spin');
}

btn1.addEventListener('click', spin);

function spin360(){
    immagine.classList.toggle('spin360');
}
btn2.addEventListener('click', spin360);