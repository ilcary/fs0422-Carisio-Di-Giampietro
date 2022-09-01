

import {User} from './Modules/User'

//import{$} from './Modules/functions'


class SuperUser extends User {
    
}

let mario = new SuperUser('Mario')

//let elem = $('.classeX')


//imnporto tutto il file e devo dargli un nome 
//che mi serve da riferimento all'interno del documento dove importo
import * as env from './Modules/const'

console.log(env);
console.log(env.API_USER);


