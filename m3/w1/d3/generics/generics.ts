

function numero(x:number):number{
return x;
}
numero(5)
function numeroGeneric<T>(x:T):T{
return x;
}

numeroGeneric<number>(5)

function sommaOConcatena<T,U>(x:T,y:U):any{

}

sommaOConcatena<string[],number>(['ciao'],5)

function prova<T>(carattere1:T):string{
    return typeof carattere1
}

prova<string>('a')//ab
prova<number>(67051)//ab


interface keyValue<T,U>{
    prop1:T,
    prop2:U
}

let obj:keyValue<string,number> = {
    prop1:'prova',
    prop2:67051,
};

class CustomerArray<T>{// se t qui è stringa

    private arr:T[] = []//qui diventa un array di T

    addItem(item:T):void{//quindi qui possiamo tranquillamente un item che è di tipo t e quindi pienamente compatibile con l'array
        this.arr.push(item);

    }

    getItems():T[]{
        return this.arr
    }



}
