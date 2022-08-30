
class SonAccount {
    protected balanceInit!: number;

    constructor(__balanceInit: number) {
        this.balanceInit = __balanceInit // dichiariamo il bilancio iniziale
    }

    // settiamo il balance iniziale
    set setBalance(amount: number) {
        this.balanceInit = amount;
    }

    // facciamo il deposito sul conto
    public deposit(amount: number): number {
        return this.balanceInit += amount;
    }

    // facciamo un prelievo dal conto
    public withDraw(amount: number): number {
        if ((this.balanceInit - amount) > 0) {
            return this.balanceInit -= amount;
        } else {
            throw new Error("finiti i sorldi bruh!");
        }

    }

    public get showBalance(): number {
        return this.balanceInit
    }

}

class MotherAccount extends SonAccount {
    protected intersts!: number;
    constructor(__balanceInit: number, __intersts: number=0) {
        super(__balanceInit);
        this.intersts = __intersts;
    }
    public set setIntersts(intersts: number){
        this.intersts= intersts;
    }

    public interstsDeposit(amount: number): number {
        return this.balanceInit += amount - ((amount / 100) * this.intersts)
    }
    public interstWithDraw(amount: number): number {
        return this.balanceInit -= amount - ((amount / 100) * this.intersts)
    }
}

// vreo un'istanza per ognuno dei due conti con il saldo iniziale
let sir = new SonAccount(0)
let miss = new MotherAccount(0)

//settiamo il conto iniziale
sir.setBalance = 1000;
miss.setBalance = 1000;

// settiamo un interest
miss.setIntersts = 60;

//MOTHER_ACCOUNT
console.log('%c MOTHER_ACCOUNT','background: #239; color: #EF0FE0');
console.table(miss);
console.log('bilancio dopo deposito con interessi '+miss.interstsDeposit(1000));
console.table(miss);

console.log('%c MOTHER_ACCOUNT','background: #239; color: #EF0FE0');
console.table(miss);
console.log('bilancio dopo prelievo con interessi '+miss.interstWithDraw(1000));
console.table(miss);

console.log('');


//SON_ACCOUNT
console.log('%c SON_ACCOUNT','background: #239; color: #0FE7EF');
console.table(sir);
console.log('bilancio dopo deposito senza interessi '+sir.deposit(1000));
console.table(sir);

console.log('%c SON_ACCOUNT','background: #239; color: #0FE7EF');
console.table(sir);
console.log('bilancio dopo prelievo senza interessi '+sir.withDraw(1000));
console.table(sir);





