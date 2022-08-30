let obj:{} = {}

let states:{
    italy:string,
    england:string,
    id:any
} ={
    italy:'Rome',
    england:'London',
    id:function(){
        return this.italy + ' ' + this.england
    }
};

console.log(states.italy);
console.log(states.id());