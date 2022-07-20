let cubo = document.querySelector('.cubo')
let prec = document.querySelector('#precedente')
let succ = document.querySelector('#successivo')

let deg = 0

prec.addEventListener('click', () => {
    cubo.style.transition= '1.5s'
    deg -= 90;
    cubo.style.transform = `rotateY(${deg}deg)`
});

succ.addEventListener('click', () => {
    cubo.style.transition= '1.5s'
    deg += 90;
    cubo.style.transform = `rotateY(${deg}deg)`
});

prec.addEventListener('dblclick', () => {
    cubo.style.transition= '4.5s'
    for (let i = 0; i <2; i++) {
        deg -= 90;
    cubo.style.transform = `rotateY(${deg}deg)`
    }
    
});
succ.addEventListener('dblclick', () => {
    cubo.style.transition= '4.5s'
    for (let i = 0; i <2; i++) {
        deg += 90;
    cubo.style.transform = `rotateY(${deg}deg)`
    }
    
});

