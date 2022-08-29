let day:number = new Date().getDay()
console.log()

    if(day == 0){
        console.log('Domenica')
    }else if(day == 1){
        console.log('Lunedì')
    }

    switch(day){
        case 0:
            console.log('Domenica');
            break;
        case 1:
            console.log('Lunedì');
            break;
    }