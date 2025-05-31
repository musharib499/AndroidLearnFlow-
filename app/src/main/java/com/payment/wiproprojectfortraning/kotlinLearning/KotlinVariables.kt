package com.payment.wiproprojectfortraning.kotlinLearning

/***
 * What is Variables?
 * - A variable is like a container that holds data in memory.
 * - such like text or others values
 * - Variables have a name and type ( String, Int, Double etc)
 * - Variable are mutable or immutable
 * - var | val | const
 * - var - mutable - can be changed (Read and Write)
 * - val - immutable - cannot be changed (Read Only)
 * - const - immutable - cannot be changed (Read Only) - only for top level or Known at compile-time rather then on runtime
 */

/*** What is var?
 * - var - mutable - can be changed (Read and Write)
 */

fun varIntro(){
    var name = "Mukesh" // if you want  to change the value of name then use var
    name = "Mukesh1"
    println(name)

    var num = 10
    num = 20
    println(num)
}

/*** What is val?
 * - val - immutable - cannot be changed (Read Only)
 * - once assigned the value cannot be changed
 * - reference cannot be changed
 * - similar to final in java
 * - --Use Case -
 * - safer & more predictable code
 * - less error prone code
 * - Avoid accidental bugs or reassignments
 * - more readability
 * - Help to compiler to optimize the better code
 * */

fun  valIntro(){
    val name = "Mukesh"
   // name = "Mukesh1" // val cannot be reassigned
    println(name)
}

/*** What is const?
 * - const val - immutable - cannot be changed (Read Only) - only for top level or Known at compile-time rather then on runtime
 * - Use case of it
 * - APP_VERSION - App- wide settings/constant
 * - API_KEY - Using any api keys
 * - API_URL - Using any fixed url at compile rather then runtime.
 * */

const val constName = "Mukesh" // top level variable
fun  constIntro(){

   // name = "Mukesh1" //
    // constName = "Mukesh"
    println(constName)
}


fun main() {
    //varIntro()
    // valIntro()
    // constIntro()
}
