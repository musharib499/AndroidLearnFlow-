package com.payment.wiproprojectfortraning.kotlinLearning

/** Lambda - What is lambda
 * - A Lambda expression is a short block of code {}
 * - has no name
 * - can passed as a value
 * - can be assign to a variable
 * - can be passed as an argument to another function
 * - can be use as function as return function
 * */

fun main() {
    val sum = lambdaHasNoNameSum(10,30)
    println(" lambda has no name - sum $sum")
    val square = lambdaHasNoNameSingleParameterSquare(10)
    println("Square value $square")

   // Higher Order Function

   val hofValue  = higherOrderFunction(10,20,{a,b -> a+b})
   val hofValue1  = higherOrderFunction(10,20, hofSum)
   println("Higher Order Function - hofSum $hofValue")
   println("Higher Order Function - hofSum1 $hofValue1")

    val hofReturnFunction = higherOrderFunctionReturnFunction(10,20)
    println(hofReturnFunction)
    val hofReturnFunction1 = hofReturnFunction(100,200)
    hofCollectionIntro()
}

/** Basic syntax of lambda
 * */

//val lambdaName: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

/** Has no name - Every lambda in kotlin is an instance of a function interface
 * (Int) -> Int
 * (String,Int) -> Boolean
 * */
val lambdaHasNoNameSum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }


 /** Single parameter with lambda
  * */
 val lambdaHasNoNameSingleParameterSquare:
             (Int) -> Int = { a: Int -> a * a}
// Also you can write in this format -
val lambdaHasNoNameSingleParameterSquare1 =
    { a: Int -> a * a}

/** HOF - Higher Order Function
 * - A function that takes another function as an argument or returns a function
* */

fun higherOrderFunction(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
val hofSum: (Int, Int) -> Int = {a,b->a+b}

/** HOF Return as function */
fun higherOrderFunctionReturnFunction(a: Int, b: Int): (Int, Int) -> Int {
   return {x,y -> a*x+b*y}
}

// Collection - HOF - Higher Order Function
fun hofCollectionIntro() {
    println(" ------------------ hof collection ---------------------")
    val list = listOf(1, 2, 3, 4, 5)
    // filter, map, reduce
    // Filter - it is used to filter the collection or keep matching item
    // find even value from a list
    val even = list.filter { a -> a%2 == 0 }
    val odd = list.filter { a -> a%2 != 0 }
    println("Even number $even")
    println("Odd number $odd")

    // Map - it is used to transform each element in the collection
    val mapList = list.map { a -> a*2 }
    println("Map List $mapList")

    // Reduce - combine all item in single result - example - Sum of all element give result

    val reduceList = list.reduce { a, b -> a+b } // it will return single value
    println("Reduce calculate sum of all element in List $reduceList")

}