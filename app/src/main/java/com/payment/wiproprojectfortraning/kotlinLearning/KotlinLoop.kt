package com.payment.wiproprojectfortraning.kotlinLearning

/** Loop - What is Loop?
 * - A loop is used to repeat a block of code multiple times- this called loop.
 * - Types of loop
 * - For loop
 * - ForEach loop
 * - While loop
 * - Do while loop
 *
 */

fun main() {
    forLoopIntro()
    forEachLoopIntro()
    whileLoopIntro()
    doWhileLoopIntro()
}

/** What is For Loop?
 * - For loop used to iterate over a sequence/range of values
 * - We can define range ...
 * - increasing order - until
 * - decreasing order - downTo
 * - step  - step
 * */

fun forLoopIntro() {
    println("For Loop")
    for (i in 2..10) {
        print(" $i ")
    }

    for (i in 1..10) {
        print(" $i ")
    }
    val array = arrayOf("Hello", "World", "Kotlin")
    for (i in 0 ..array.size-1){
        println(array[i])
    }

    for (i in 100 downTo 1){
        println("DownTo $i")
    }

    for (i in 1 until  100 ){

        println("Increasing order $i")
    }

    for (i in 1 until  100 step 10){

        println("Increasing order 2 step $i")

    }
    for (arr in array){
        println("Item $arr")
    }
}
/** What is For Each Loop?
 * - ForEach loop used to iterate over a collection of items
 * - Index or scope
 * */
fun forEachLoopIntro() {
    println("----------------For Each Loop---------------------")
    val array = arrayOf("Hello", "World", "Kotlin")
    array.forEach { item->
        println(item)
    }
    array.forEachIndexed { index, item ->
        println(" index $index --  item : $item")
    }
}

/** While Loop - What is While Loop?
 * - While loop used to repeat a block of code as long as a condition is true
 * - based on condition
 * */
fun whileLoopIntro() {
    println("----------------While Loop---------------------")
    var i = 1
    while (i <= 100) {
        println(" While index $i")
        i += 10
    }
}

/** Do While Loop - What is Do While Loop?
 * - Do While loop used to repeat a block of code as long as a condition is true
 * - Run at least once
 * */

fun doWhileLoopIntro() {
    println("----------------Do While Loop---------------------")
    var i = 1
    do {
        println(" Do While index $i")
        i += 10
    } while (i<100)
}


// Write a small program just print odd value by for loop