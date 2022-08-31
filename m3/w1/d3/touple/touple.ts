let user:[number, string, any[]] = [1,'Giovanna',[45]]

let [id, nome] = user;

console.log(id, nome);//1 giovanna

//matrici di TUPLE

let userArr:[number, string, any[]][] = [
    user,
    [2,'Mario',['ciao']],
    [3,'Carisio',[]],
    [4,'alessandro',[]]
]