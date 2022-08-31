abstract class Negozio{
    maglia:string;
    pantalone:string;
    scarpe:string;
    constructor(maglia:string, pantalone:string,scarpe:string) {
        this.maglia = maglia;
        this.pantalone = pantalone;
        this.scarpe =scarpe;
    }

    abstract abbigliamento():any
}

// let negozio = new Negozio() non posso istanziare una classe astratta