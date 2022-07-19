let budget = document.querySelector('#budgetStart'); //input budget
const budgetButton = document.querySelector('#budgetSet');
const lista = document.querySelector('#listaSpese');//lista UL

let manuBdg = document.querySelector('#spesaManuale');//spesa manuale
const manuBgt = document.querySelector('#manualBudget');//budget manuale
const manuBtn = document.querySelector('#spendiManuale');//bottone spesa manuale
let soldiRimasti = document.querySelector('#soldiRimasti');//soldi rimasti



// AUTOMATIC CASH BURNER
budgetButton.addEventListener('click', getBudget);

function getBudget() {

    let schei = budget.value;
    wasteBudget(schei);
}


function wasteBudget(schei) {
    let scheiRimasti = schei;
    while(scheiRimasti >= 0){

        let listItem = document.createElement('li')
        listItem.classList.add('listItemStyle')
        let spesaRandom = Math.floor(Math.random() * schei/10);

        if(scheiRimasti - spesaRandom > 0){
            scheiRimasti = scheiRimasti - spesaRandom;
            if (scheiRimasti <= schei / 2 && scheiRimasti > schei / 4) {
                listItem.innerHTML =`Hai speso piu' di meta' budget! Ti rimangono ${scheiRimasti} soldi`;
                lista.append(listItem);
                listItem.classList.add('listItemWarning')
            } else if (scheiRimasti <= schei / 4) {
                listItem.innerHTML =`Hai speso quasi tutto il budget! Ti rimangono ${scheiRimasti} soldi`;
                lista.append(listItem);
                listItem.classList.add('listItemAlert')
            } else {
                listItem.innerHTML =`Spendi spendiii! Ti rimangono ${scheiRimasti} soldi`;
                lista.append(listItem);    
            } 
        }else{
            listItem.innerHTML =`Stai inguaiato, hai ${scheiRimasti} soldi e volevi spendere ${spesaRandom} soldi`;
            lista.append(listItem);
            listItem.classList.add('listItemAuguri')
            break;
        }
    }
}


//MANUAL CASH BURNER

manuBgt.addEventListener('click', getBudgetManu);
manuBtn.addEventListener('click', spendiConsapevolmente);

function getBudgetManu() {

    soldiRimasti.innerHTML = budget.value;

}

function spendiConsapevolmente(){
    let sordi = soldiRimasti.innerHTML;
    let spesa = manuBdg.value;
    
    //logica 
    
}

