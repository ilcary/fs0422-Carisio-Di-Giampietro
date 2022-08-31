import { Address } from './Address';
import {User} from './user'

class Invoice{
    id:number|undefined;
    expiration!:DataTransfer;
    date!:DataTransfer;
    userId!:number;
    user!:User|undefined;
    billingAddress!:Address;
    rows:any[] = [];

    constructor(billingAddress:Address){
        this.billingAddress = billingAddress || this.user?.billingAddress
    }
}