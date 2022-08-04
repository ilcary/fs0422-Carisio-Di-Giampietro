let fs = require('fs');

let file = fs.readFileSync('test.txt','utf-8');
console.log(file)

fs.writeFileSync('test.txt','heilà');