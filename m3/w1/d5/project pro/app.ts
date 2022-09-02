

interface ISmartphone {
    carica: number;
    numeroChiamate: number;
    costoPerMinuto: number;

    ricarica(unaRicarica: number): void;
    chiamata(minutiDurata: number): void;
    numero404(): number;
    getNumeroChiamate(): number;
    azzeraChiamate(): void;

}


class User implements ISmartphone {

    carica: number;
    numeroChiamate: number;
    costoPerMinuto: number;

    constructor(__carica: number) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }



    ricarica(unaRicarica: number): void {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata: number): void {
        let credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2)
        this.carica = +credito // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++
    }
    numero404(): number {
        return this.carica
    }
    getNumeroChiamate(): number {
        return this.numeroChiamate
    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0
    }

}

let Carisio = new User(0)

class Chiamata {
    durata: number
    costo!: number
    tariffa: number
    constructor(__durata: number, __tariffa: number) {
        this.durata = __durata
        this.tariffa = __tariffa
        this.calcolacosto()
    }
    calcolacosto(): void {
        this.costo = (this.durata * this.tariffa)
    }
}

new class telefono extends User {
    callicon: HTMLImageElement | null = document.querySelector('#call')
    vodafone: HTMLImageElement | null = document.querySelector('#vodafone')
    phone: HTMLElement | null = document.querySelector('#iphonecover')
    icone: NodeListOf<HTMLElement> = document.querySelectorAll('.icon')
    vodafoneMode: NodeListOf<HTMLElement> = document.querySelectorAll('.vodafoneMode')
    callapp: NodeListOf<HTMLElement> = document.querySelectorAll('.callapp')
    home: HTMLElement | null = document.querySelector('#home')
    chiama: HTMLElement | null = document.querySelector('#chiama')
    ricaricaV: HTMLElement | null = document.querySelector('#ricarica')
    creditoV: HTMLElement | null = document.querySelector('#credito')
    registroChiamatebtnV: HTMLElement | null = document.querySelector('#registroChiamatebtn')
    inputNumero: HTMLInputElement | null = document.querySelector('#displayCall')
    registroChiamate: Chiamata[] = []

    constructor() {
        super(10)
        this.iconCellEvent()
        this.iconVodafoneEvent()
        this.homeEvent()
        this.chiamaEvent()
        this.ricaricaEvent()
        this.registroEvent()
    }

    getRandomInt(): number {
        return Math.floor(Math.random() * 20);
    }

    iconCellEvent(): void {
        this.callicon?.addEventListener('click', (): void => {
            this.phone!.style.backgroundImage = "url('./images/iphone-keypad.png')"
            this.icone.forEach(i => i.classList.add('d-none'));
            this.callapp.forEach(i => i.classList.remove('d-none'));
        })
    }

    iconVodafoneEvent(): void {
        this.vodafone?.addEventListener('click', (): void => {
            let creditoDisplay = this.creditoV?.textContent
            creditoDisplay = this.carica.toString()
            console.log(creditoDisplay);
            console.log(this.creditoV);

            this.phone!.style.backgroundImage = "url('./images/iphone-vodafone.png')"
            this.icone.forEach(i => i.classList.add('d-none'));
            this.vodafoneMode.forEach(i => i.classList.remove('d-none'));
            this.home?.classList.remove('d-none')
            this.home?.classList.add('appvodafone')
        })
    }

    homeEvent(): void {
        this.home?.addEventListener('drag', (): void => {
            this.phone!.style.backgroundImage = "url('./images/iphone-home-screen.png')"
            this.icone.forEach(i => i.classList.remove('d-none'));
            this.callapp.forEach(i => i.classList.add('d-none'));
            this.vodafoneMode.forEach(i => i.classList.add('d-none'));
            this.home?.classList.remove('appvodafone')
        });
    }

    chiamaEvent(): void {

        this.chiama?.addEventListener('click', (): void => {
            let numeroTel: string | undefined = this.inputNumero?.value;
            console.log(numeroTel);
            if (numeroTel == '404') {
                alert(`IL TUO CREDITO E' ${this.numero404()}`)
            } else {
                let durata: number = this.getRandomInt()
                this.chiamata(durata)
                this.registroChiamate.push(new Chiamata(durata, this.costoPerMinuto))
                console.log(this.registroChiamate);

            }
        })
    }

    ricaricaEvent(): void {
        this.ricaricaV?.addEventListener('click', (): void => {
            let inputRicarica: HTMLInputElement = document.createElement('input');
            inputRicarica.classList.add('icarica');
            inputRicarica.placeholder = "Importo €"
            this.phone?.append(inputRicarica);
            inputRicarica.addEventListener("keyup", (e)=> {
                if (e.key === "Enter") { 
                    this.ricarica(+inputRicarica.value)
                    console.log(inputRicarica.value);
                    inputRicarica.remove()
                }
            })
        })
    }

    registroEvent(): void {
        this.registroChiamatebtnV?.addEventListener("click", (): void => {
            window.location.replace("./registrochiamate.html")
        })
    }

}

