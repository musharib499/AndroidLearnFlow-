package com.payment.wiproprojectfortraning.kotlinLearning

/* Inline Function - What is inline function?
* - Inline function tell the kotlin compiler to copy paste the code of the function at the call site
* - Inline function is used to reduce the overhead of function call
* - Inline function is used to improve the performance of the application
* - Inline function is used to reduce the memory usage of the application
* - Inline function is not initialize in memory
* - Syntax of Inline function
* - inline fun functionName(parameters) : returnType {}
* */
inline fun operator(a:Int, b:Int, operation:(Int,Int) -> Int):Int {
    return operation(a,b)
}

/* infix function - What is infix function?
* - An infix function is a function that has only one parameter and is marked with the infix keyword.
* - Syntax of infix function - infix fun functionName(parameter) : returnType {}
* - Infix function is used to reduce the code of the function
* - Infix function is used to improve the performance of the application
* - Infix function is used to reduce the memory usage of the application
* - Infix function improve readability
* */

infix fun Int.square(num:Int):Int {
    return this*num
}
infix  fun Int.power(exp:Int):Int {
    var result = 1
    for (i in 1..exp) {
        result *= this
    }
    return result
}

fun power1(num:Int,exp:Int):Int {
    var result = 1
    for (i in 1..exp) {
        result *= num
    }
    return result
}
fun main() {
    val resultSum = operator(10,20,{a,b -> a+b}) // Inline function
    println(resultSum)
    println("---------------------- infix function ----------------------")
    val sq = 10 square 2
    println(sq)

    val tenPower2 = 10 power 2
    println(tenPower2)
    val tenPower3 = 10 square 3
    println(tenPower3)
    // You want use this as normal function
    val tenPower4 = power1(10,4)
    println(tenPower4)
}