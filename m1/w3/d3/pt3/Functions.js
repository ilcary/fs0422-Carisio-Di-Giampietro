/*
ASSIGNMENT RULES
- All the answers must be written in JavaScript
- You can ask for help, reach the Teaching Assistants if needed
- You can Google / use StackOverflow BUT only when you think you need something we didn't cover during lessons yet
- You can test your code in a separate file or de-commenting the single exercises in this one.
- You can use the bash terminal, the VSCode terminal or the one embedded in your Operating System if you're using macOS or Linux.
- The solution must be pushed to the repository and be available for the tutors by the end of the day (5PM CET)
*/

/* EXERCISE 1
 Write a function called "area" which receives 2 parameters (l1, l2) and calculates the area of the associated rectangle.
*/

/* WRITE YOUR ANSWER HERE */
console.log("ex 1")


let unitMeasure = 'square meters'

function calculateArea(l1, l2) {
    return ('the area of ur rectangle is : ' + (l1 * l2) + ' ' + unitMeasure)
}
console.log(calculateArea(56, 16))


/* EXERCISE 2
 Write a function called "crazySum" which receives two integers as parameters.
 It should return the sum of those two values, but if the two values are the same then it should return their sum multiplied by 3.
*/

/* WRITE YOUR ANSWER HERE */
console.log("ex 2")

let a = 10
let b = 10

function crazySum(a, b) {
    if (a === b) {
        console.log((a + b) * 3)
    } else {
        console.log(a + b)
    }
}
crazySum(a, b)


/* EXERCISE 3
 Write a function called "crazyDiff" that computes the absolute difference between a given number and 19.
 It should return triple their absolute difference if the given number is greater than 19.
*/

/* WRITE YOUR ANSWER HERE */
console.log("ex 3")


function crazyDiff(n, m) {
    if (m > n) {
        let absDiff = Math.abs((n - m) * 3)
        console.log(absDiff)
    } else {
        console.log("the given number is lower or equal to 19")
    }
}
crazyDiff(19, 19)


/* EXERCISE 4
 Write a function called "boundary" which accept an integer parameter n and returns true if n is within 20 and 100 (included) or if n it's equal to 400.
*/

/* WRITE YOUR ANSWER HERE */

console.log("ex 4")



function boundary(p) {
    if (p >= 20 && p <= 100 || p === 400) {
        console.log("true")
    } else {
        console.log("false")
    }
}
boundary(400)


/* EXERCISE 5
 Write a function called "strivify" which accepts a string as a parameter.
 It should add the word "Strive" in front of the given string, but if the given string already begins with "Strive", then it should just return the original string.
*/

/* WRITE YOUR ANSWER HERE */
console.log("ex 5")



function strivify(v,k) {
    if (v !== 'Strive') {
        console.log(v + ' ' + k)
    } else {
        console.log(k)
    }
}
strivify('Potato','Strive')


/* EXERCISE 6
 Write a function called "check3and7" which accepts a positive number as a parameter and checks if it is a multiple of 3 or a multiple of 7.
 HINT: Modulus Operator
*/

/* WRITE YOUR ANSWER HERE */
console.log("ex 6")


function check3and7(f) {
    if (f > 0) {
        if (f % 3 == 0) {
            console.log("the number is a multiple of 3")
        } else if (f % 7 == 0) {
            console.log("the number is a multiple of 7")
        } else {
            console.log("the number is not a multiple of 3 and 7")
        }
    } else {
        console.log('Must insert positive number!')
    }
}
check3and7(56)
check3and7(475)
check3and7(-95)

/* EXERCISE 7
 Write a function called "reverseString" which programmatically reverses a given string (es.: Strive => evirtS).
*/

/* WRITE YOUR ANSWER HERE */

console.log('ex 7')

function reverseString(str) {
    return (str === '') ? '' : reverseString(str.substr(1)) + str.charAt(0);
  }
  console.log(reverseString("Epicode"));

/* EXERCISE 8
 Write a function called "upperFirst" which capitalizes the first letter of each word of a given string passed as a parameter.
*/

/* WRITE YOUR ANSWER HERE */
console.log('ex 8')

const str = 'gimme the loo';

//split the above string into an array of strings 

const arr = str.split(" ");//whenever a blank space is encountered

//loop through each element of the array and capitalize the first letter.

// for ([initialization]; [condition]; [final-expression])
//The .length property of an object which is an instance of type Array sets or returns the number of elements in that array.
for (var i = 0; i < arr.length; i++) {
    arr[i] = arr[i].charAt(0).toUpperCase() + arr[i].slice(1);//A statement that is executed as long as the condition evaluates to true. To execute multiple statements within the loop, use a block statement ({ /* ... */ }) to group those statements. To execute no statement within the loop, use an empty statement (;).

}

//Join all the elements of the array back into a string 
//using a blankspace as a separator 
const str2 = arr.join(" ");//The join() method creates and returns a new string by concatenating all of the elements in an array (or an array-like object), separated by commas or a specified separator string. If the array has only one item, then that item will be returned without using the separator.
console.log(str2); // Ta-Da!


/* EXERCISE 9
 Write a function called "cutString" which creates a new string without the first and last character of a given string passed as a parameter.
*/

/* WRITE YOUR ANSWER HERE */



/* EXERCISE 10
 Write a function called "giveMeRandom" which accepts a number n and returns an array containing n random numbers between 0 and 10.
*/

/* WRITE YOUR ANSWER HERE */

/* WHEN YOU ARE FINISHED
 Commit and push the code to your personal GitHub repository; then post the link of your commit on the Homework section of today's Eduflow.
*/
