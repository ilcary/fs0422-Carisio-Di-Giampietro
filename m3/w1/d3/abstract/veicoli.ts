abstract class Veicolo{
    nRuote:number =1;
    vel:number=0;
    velMax:number;
    motor:boolean;

    constructor(nRuote:number,velMax:number,motor:boolean){
        this.nRuote = nRuote;
        this.velMax = velMax;
        this.motor = motor;
    }

    fermaveicolo(){
        this.vel=0
    }

    limiteVelocità(vel:number):boolean{
        return vel <= this.velMax
    }

   abstract accellera(vel:number):void;
   abstract frena(vel:number):void;

}

class Automobile extends Veicolo{

    constructor(velMax:number){
        super(4,velMax,true)
    }

    accellera(vel:number) {
        this.vel += vel
    }
    frena(vel:number) {
        this.vel -= vel
    }

}

let auto = new Automobile(280);

class Bicicletta extends Veicolo{
    constructor(velMax:number){
        super(2, velMax,false)
    }

    accellera() {
        this.vel ++
    }
    frena() {
        this.vel --
    }

}

let bici = new Bicicletta(250);

bici.accellera()
console.log(bici);
