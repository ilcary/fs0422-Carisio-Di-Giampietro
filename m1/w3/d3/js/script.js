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
    return 2050 - compleanno;
}

alert(calcolaAnni(1991));

const anni = calcolaAnni(1997);
console.log(anni);

const calcolaAnni2 = compleanno => 2040 - compleanno;

let anni2 = calcolaAnni2(1980);
console.log(anni2);

const pensionamento = (compleanno, nome) => {
    const eta = 2037 - compleanno;
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

const calcolaSpesa = function(conto) {
    return conto >= 50 && conto <= 300 ? conto * 0.15 : conto * 0.2;
}

console.log(calcolaSpesa(320));