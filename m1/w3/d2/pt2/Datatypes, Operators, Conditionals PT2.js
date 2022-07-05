// Additional assignments for Day 3

/*EX 1
 Use a ternary operator to assign to a variable called gender the string values "male" or "female".
 The choice should be made based on the value of another variable called isMale.
*/
/* WRITE YOUR ANSWER HERE */
console.log('EX 1')

let isMale = 'female';
let gender = (isMale == 'male' ? 'male' : 'female');
console.log('person is ' + gender);




/*EX 2
 Write a piece of code for checking if, given two integers, the value of one of them is 8 or if their addition or subtraction is equal to 8.
*/

/* WRITE YOUR ANSWER HERE */

console.log('EX 2')


let a = 85
let b = 16


if (a === 8) {
    console.log('a is egual 8')
} else if (b === 8) {
    console.log('b is egual 8')
} else if ((a + b) === 8) {
    console.log('a+b is egual 8')
} else if ((a - b) === 8) {
    console.log('a-b is egual 8')
} else {
    console.log('none of those numbers given give by their addition or subtraction the number 8 and also neither is 8')
}



/*EX 3
 Create a variable and assign to it the concatenation of two strings.
*/

/* WRITE YOUR ANSWER HERE */

console.log('EX 3')

let stringa = 'Never ' + 'gonna ' + 'give ' + 'u ' + 'up '
console.log(stringa)


/*EX 4
 Create three variables and assign a numerical value to each one of them. 
 Using a conditional statement, write a piece of code for sorting their values from highest to lowest.
 Display the result in the console.
*/

/* WRITE YOUR ANSWER HERE */
console.log('EX 4')

let x = 15
let y = 180
let z = 85
let t = 1

let numbers = [x, y, z, t]

let sortnumber = numbers.sort((a, b) => a - b)

console.log(sortnumber)




/*EX 5
 Write a piece of code for finding the average of two given integers.
*/

/* WRITE YOUR ANSWER HERE */

console.log('EX 5')

let c = 56
let d = 5

console.log('averaggino ' +  ((c + d) /2))


/*EX 6
 Write a piece of code for finding the longest of two given strings.
*/

/* WRITE YOUR ANSWER HERE */
let string = 'by the way'


console.log('string length ' + string.length)



/*EX 7
 Write a piece of code for checking if a given value is a integer or not.
*/

/* WRITE YOUR ANSWER HERE */


console.log(Number.isInteger(-123))
console.log(Number.isInteger(123))
console.log(Number.isInteger('123'))




/*EX 8
 Write a piece of code for calculating a certain percentage of a given number.
 (Ex.: the 20% of 400 is 80)
*/

/* WRITE YOUR ANSWER HERE */

let h =400

console.log((400/10)*2)



/*EX 9
 Write a piece of code for checking if a given number is even or odd.
*/

/* WRITE YOUR ANSWER HERE */

let k =23

if (k % 2 == 0) {
    console.log('the number is even')
}else{
    console.log('the number is odd')
}
