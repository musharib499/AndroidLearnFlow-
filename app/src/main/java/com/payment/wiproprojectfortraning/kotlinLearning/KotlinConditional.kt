package com.payment.wiproprojectfortraning.kotlinLearning

/** Conditional - What is conditional?
 * - A conditional is used to perform different actions based on different conditions. (Make decision)
 * - true or false if(condition){ if your condition is true this block code will execute} else if(condition) { if your condition is true this block code will execute} else { if your condition is false this block code will execute}
 * - conditional - if, else, else if, when
 * - if - only one condition  - if (x>0) { println("x is positive") }
 * - if else - two condition - if (x>0) { println("x is positive") } else { println("x is negative") }
 * - if else if - three condition - if (x>0) { println("x is positive") } else if (x<0) { println("x is negative") } else { println("x is zero") }
 * - when - multiple condition - when (x) { 1 -> println("x is one") 2 -> println("x is two") else -> println("x is not one or two") }
 *
 * */


fun main() {
    ifIntro(10)
    ifElseIntro(2)
    ifElseIfIntro(16)  // Not allow play game - 16
    ifElseIfIntro(18) // Allow play the game - 18
    ifElseIfIntro(17) // Not allow play the game  but can register- 17
    ifElseIfIntro(70) // Allow play the game - 20
    println("------------------------------When condition statement ------------------------------")
    whenIntro(90)
    whenIntro(2)
    whenIntro(16)

}

/** if - only one condition  - if (x>0) { println("x is positive") }
 * */

fun ifIntro(a:Int) {
    println("ifIntro")
    if (a>10){
        println("if condition is true - $a")
    }

}
/** if else - two condition - if (x>0) { println("x is positive") } else { println("x is negative") }
 * */
fun ifElseIntro(a:Int) {
    println("ifElseIntro")
    if (a > 10) {
        println("if condition is true - $a")
    } else {
        println("if condition is false - $a")
    }
}


/** if else if - three condition - if (x>0) { println("x is positive") } else if (x<0) { println("x is negative") } else { println("x is zero") }
 * */

fun ifElseIfIntro(age:Int) {
    println("ifElseIfIntro")
    if (age >= 18) {
        println("Allow play the game - $age") // one condition
    } else if ( age in 16..17) { // second condition
        println("Not allow play the game  but can register- $age")
    } else { // third condition
           println("Not allow play game - $age")
    }
}
/** When
 *
 * */

fun whenIntro(age: Int) { // when without argument
    println("whenIntro")
    when  {
        age >=18 -> println("When - Allow play the game - $age")
        //age >=16 && age < 18 -> println("When - Not allow play the game  but can register- $age")
        age in 16..17 -> println("When - Not allow play the game  but can register- $age")
        else -> println("When - Not allow play game - $age")
    }
}
/** Passing argument in when*/
fun whenIntroWithArgument(age: Int) { // with argument
    println("whenIntro with argument")
    when (age) {
         in 18..100 -> println("When - Allow play the game - $age")
         in 16..17 -> println("When - Not allow play the game  but can register- $age")
        else -> println("When - Not allow play game - $age")
    }
}


// User Enter any string - First word contain one length - Then  print message it allow
// FIRST word contain 2 length -  He is Admin only allow
// First word contain 3 length, - super Admin

// A house
// AB house
// A
