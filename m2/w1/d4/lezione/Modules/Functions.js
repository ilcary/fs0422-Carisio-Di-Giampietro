export function $(elemento){
    return document.querySelector(elemento)
}

export function click(elemento,callback){
    return elemento.addEventListener('click',callback);
}
