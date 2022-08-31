"use strict";
class Negozio {
    constructor(maglia, pantalone, scarpe) {
        this.maglia = maglia;
        this.pantalone = pantalone;
        this.scarpe = scarpe;
    }
}
// let negozio = new Negozio() non posso istanziare una classe astratta
class Veicolo {
    constructor(nRuote, velMax, motor) {
        this.nRuote = 1;
        this.vel = 0;
        this.nRuote = nRuote;
        this.velMax = velMax;
        this.motor = motor;
    }
    fermaveicolo() {
        this.vel = 0;
    }
    limiteVelocità(vel) {
        return vel <= this.velMax;
    }
}
class Automobile extends Veicolo {
    constructor(velMax) {
        super(4, velMax, true);
    }
    accellera(vel) {
        this.vel += vel;
    }
    frena(vel) {
        this.vel -= vel;
    }
}
let auto = new Automobile(280);
class Bicicletta extends Veicolo {
    constructor(velMax) {
        super(2, velMax, false);
    }
    accellera() {
        this.vel++;
    }
    frena() {
        this.vel--;
    }
}
let bici = new Bicicletta(250);
bici.accellera();
console.log(bici);
//# sourceMappingURL=app.js.map