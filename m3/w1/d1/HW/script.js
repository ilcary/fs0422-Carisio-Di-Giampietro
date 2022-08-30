var form = document.querySelector('#form-container');
var g1 = document.querySelector('#g1');
var g2 = document.querySelector('#g2');
var button = document.querySelector('#btn');
var reset = document.querySelector('#rst');
button === null || button === void 0 ? void 0 : button.addEventListener('click', function (e) {
    e.preventDefault();
    var resultDisplay = document.querySelector('#result');
    var resultContent = document.createElement('p');
    var randomDisplay = document.getElementById('randomSpan');
    var g1I = Number(g1.value);
    var g2I = Number(g2.value);
    var random = Math.floor(Math.random() * (100 - 1) + 1);
    // let random: number = 12
    randomDisplay.innerText = "".concat(random);
    if (g1I && g2I) {
        // g1 e g2 vincono
        if (g1I == random && g2I == random) {
            resultContent.textContent = "Incredibile! Tutti e due avete indovinato! #(".concat(random, ")");
            resultDisplay === null || resultDisplay === void 0 ? void 0 : resultDisplay.append(resultContent);
        }
        else {
            // g1 vince
            if (g1I == random) {
                resultContent.textContent = "Giocatore 1 ha indovinato il numero! #(".concat(random, ")");
                resultDisplay === null || resultDisplay === void 0 ? void 0 : resultDisplay.append(resultContent);
                // g2 vince
            }
            else if (g2I == random) {
                resultContent.textContent = "Giocatore 2 ha indovinato il numero! #(".concat(random, ")");
                resultDisplay === null || resultDisplay === void 0 ? void 0 : resultDisplay.append(resultContent);
            }
            else {
                // i due moduli sono uguali
                if (Math.abs(g1I - random) == Math.abs(g2I - random)) {
                    resultContent.textContent = "Nessuno ha indovinato MA tutti e due ci siete andati vicini! #(".concat(random, ")");
                    resultDisplay === null || resultDisplay === void 0 ? void 0 : resultDisplay.append(resultContent);
                }
                else {
                    // g2 ci e' andato piu vicino
                    if (Math.abs(g1I - random) > Math.abs(g2I - random)) {
                        resultContent.textContent = "Nessuno ha indovinato MA Giocatore 2 ci e' avvicinato di piu' #(".concat(random, ")");
                        resultDisplay === null || resultDisplay === void 0 ? void 0 : resultDisplay.append(resultContent);
                        // g1 ci e' andato piu vicino
                    }
                    else {
                        resultContent.textContent = "Nessuno ha indovinato MA Giocatore 1 ci e' avvicinato di piu' #(".concat(random, ")");
                        resultDisplay === null || resultDisplay === void 0 ? void 0 : resultDisplay.append(resultContent);
                    }
                }
            }
        }
    }
    else {
        resultContent.textContent = "Si e' pregati gentilmente di inserire un numero nei campi di input forniti";
        resultDisplay === null || resultDisplay === void 0 ? void 0 : resultDisplay.append(resultContent);
    }
});
reset === null || reset === void 0 ? void 0 : reset.addEventListener("click", function (e) {
    e.preventDefault();
    var resultDisplay = document.querySelector('#result');
    var childToKill = document.querySelectorAll('#result p');
    while (resultDisplay.firstChild) {
        resultDisplay.removeChild(resultDisplay.firstChild);
    }
    g1.value = '';
    g2.value = '';
});
