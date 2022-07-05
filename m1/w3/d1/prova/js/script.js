let display = document.getElementById('display');

let buttons = (document.querySelectorAll('.button'));

buttons.forEach( button => {
    button.addEventListener('click', (e) => {
        switch(e.target.innerText){
            case 'C':
                display.innerText = '';
                break;

            case '=':
                try{
                    display.innerText = parseint(display.innerText);
                } catch {
                    display.innerText = "Error"
                }
                break;
            case '←':
                if (display.innerText){
                   display.innerText = display.innerText.slice(0, -1);
                }
                break;

            default:
                display.innerText += e.target.innerText;
        }
    });
});