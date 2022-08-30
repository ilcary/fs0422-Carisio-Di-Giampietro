let form = document.querySelector('#form-container')
let g1:HTMLInputElement | null = document.querySelector('#g1')
let g2:HTMLInputElement | null = document.querySelector('#g2')
let button:HTMLElement | null = document.querySelector('#btn')
let reset:HTMLElement | null  = document.querySelector('#rst')



button?.addEventListener('click', (e) => {
    e.preventDefault();
    let resultDisplay = document.querySelector('#result')
    let resultContent = document.createElement('p');
    let randomDisplay = document.getElementById('randomSpan') as HTMLElement

    let g1I: number = Number(g1?.value);
    let g2I: number = Number(g2?.value);
    let random: number = Math.floor(Math.random() * (100 - 1) + 1)
    // let random: number = 12

    randomDisplay.innerText = `${random}`;

    if (g1I && g2I) {

        // g1 e g2 vincono
        if (g1I == random && g2I == random) {
            resultContent.textContent = `Incredibile! Tutti e due avete indovinato! #(${random})`
            resultDisplay?.append(resultContent);
        } else {
            // g1 vince
            if (g1I == random) {
                resultContent.textContent = `Giocatore 1 ha indovinato il numero! #(${random})`
                resultDisplay?.append(resultContent);
                // g2 vince
            } else if (g2I == random) {
                resultContent.textContent = `Giocatore 2 ha indovinato il numero! #(${random})`
                resultDisplay?.append(resultContent);
            } else {
                // i due moduli sono uguali
                if (Math.abs(g1I - random) == Math.abs(g2I - random)) {
                    resultContent.textContent = `Nessuno ha indovinato MA tutti e due ci siete andati vicini! #(${random})`
                    resultDisplay?.append(resultContent);
                } else {
                    // g2 ci e' andato piu vicino
                    if (Math.abs(g1I - random) > Math.abs(g2I - random)) {
                        resultContent.textContent = `Nessuno ha indovinato MA Giocatore 2 ci e' avvicinato di piu' #(${random})`
                        resultDisplay?.append(resultContent);
                        // g1 ci e' andato piu vicino
                    } else {
                        resultContent.textContent = `Nessuno ha indovinato MA Giocatore 1 ci e' avvicinato di piu' #(${random})`
                        resultDisplay?.append(resultContent);
                    }

                }
            }
        }
    } else {
        resultContent.textContent = "Si e' pregati gentilmente di inserire un numero nei campi di input forniti"
        resultDisplay?.append(resultContent);
    }

})

reset?.addEventListener("click", (e) => {
    e.preventDefault();
    let resultDisplay = document.querySelector('#result') as HTMLElement;
    let childToKill = document.querySelectorAll('#result p')

    while (resultDisplay.firstChild) {
        resultDisplay.removeChild(resultDisplay.firstChild);
    }

    if(g1 && g2){
    g1.value = ''
    g2.value = ''
}
})

