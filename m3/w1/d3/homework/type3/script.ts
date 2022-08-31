abstract class Lavoratore {
    protected codredd: number[] = [];
    public redditoannuolordo: number
    protected tasseinps!: number
    protected tasseirpef!: number
    protected redditoAnnuoNetto!: number
    protected tasseAnnue!: number

    constructor(redditoannuolordo: number) {
        this.redditoannuolordo = redditoannuolordo
    }
    calcolaCodredd(): void {
        this.codredd.push(9)
        switch (true) {
            case (this.redditoannuolordo < 15000): this.codredd.push(23);
                break;
            case (this.redditoannuolordo < 28000): this.codredd.push(25);
                break
            case (this.redditoannuolordo < 50000): this.codredd.push(35)
                break
            case (this.redditoannuolordo > 50000): this.codredd.push(43);
                break

        }
    }
    getTasseInps(): number {
        this.tasseinps = ((this.redditoannuolordo / 100) * this.codredd[0])
        return this.tasseinps
    }
    getTasseIrpef(): number {
        this.tasseirpef = ((this.redditoannuolordo / 100) * this.codredd[1])
        return this.tasseirpef
    }
    getUtileTasse(): number {
        this.tasseAnnue = this.getTasseInps() + this.getTasseIrpef()
        return this.tasseAnnue
    }
    getRedditoAnuoNetto(): number {
        this.redditoAnnuoNetto = this.redditoannuolordo - this.getUtileTasse()
        return this.redditoAnnuoNetto
    }


}

class Professionista extends Lavoratore {
    constructor(redditoannuolordo: number) {
        super(redditoannuolordo)
        this.calcolaCodredd()
        this.getTasseInps()
        this.getTasseIrpef()
        this.getUtileTasse()
        this.getRedditoAnuoNetto()
    }
    
}

let lavo = new Professionista(45000);
lavo.getTasseInps()
console.table(lavo)