export class Form{
    static generaInput(type,placeholder){
        let input = document.createElement("input");
        input.type = type;
        input.placeholder = placeholder;
        return input
    }
}