function miaFunzione() {
    console.log('hello world');
}

miaFunzione();
miaFunzione();

function scegliFrutto(mele, arance) {
    const succoFrutta = `Succo  con ${mele} mele e ${arance} arance`;
    return succoFrutta;
}

console.log(scegliFrutto(4, 5));

let succoMela = scegliFrutto(6);
console.log(succoMela);
let succoArance = scegliFrutto(4);
console.log(succoArance);

function calcolaAnni(compleanno) {
    return 2022 - compleanno;
}

alert(calcolaAnni(1991));

const anni = calcolaAnni(1997);
console.log(anni);

const calcolaAnni2 = compleanno => 2022 - compleanno;

let anni2 = calcolaAnni2(1980);
console.log(anni2);

const pensionamento = (compleanno, nome) => {
    const eta = 2022 - compleanno;
    const anniPensione = 65 - eta;
    //return anniPensione;
    return `${nome} va in pensione tra ${anniPensione} anni`;
}

console.log(pensionamento(1975, 'Pinco'));
console.log(pensionamento(1980, 'Pallino'));


function tagliaFette(torta) {
    return torta * 3;
}

function scegliTorta(mela, arancia) {
    const fetteMela = tagliaFette(mela);
    const fetteArancia = tagliaFette(arancia);

    const torta = `Torta con ${fetteMela} fette di mela e ${fetteArancia} fette di arancia.`;
    return torta;
}

console.log(scegliTorta(3, 5));

const calcolaSpesa = function (conto) {
    return conto >= 50 && conto <= 300 ? conto * 0.15 : conto * 0.2;
}

console.log(calcolaSpesa(320));

// calcolatore range di anni 
function rangeAnni(anni) {
    if (20 < anni < 30) {
        console.log('a ' + anni + ' anni ' + ' sei ' + ' giovane')
    } else if (0 < anni < 19) {
        console.log('a ' + anni + ' anni ' + ' sei ' + ' molto ' + ' giovane')
    } else {
        console.log('a ' + anni + ' anni ' + ' sei ' + ' molto ' + ' vecchio')
    }
}

rangeAnni(anni)

//funzione freccia

let frecciaRossa = () => ('Reggio Calabria' + ' - ' + 'Reggio Mediopadana');

console.log(frecciaRossa())

// funzione con dentro una funzione + closure

function displayCounter() {
    let count = 0;

    increment = function () {
        return ++count;
    };

    return increment;
}

counter = displayCounter()

console.log(counter());
console.log(counter());
console.log(counter());