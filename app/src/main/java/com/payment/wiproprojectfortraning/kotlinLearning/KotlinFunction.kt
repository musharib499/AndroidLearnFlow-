package com.payment.wiproprojectfortraning.kotlinLearning

/** Function - What is function?
 * - A function is reusable block of code that performs a specific task.
 * - It help to reduce repetition, organize code, and increase readability.
 * - function keyword - fun
 * - function name should be use in camelCase - functionName
 * - parameter - input to the function (optional)
 * - return type - output of the function (optional)
 * - return keyword - return the value from the function
 * **/

fun main() {
//    functionWithoutParameterAndWithoutReturnType()
//    println(functionWithoutParameterAndWithReturnType())
//    functionWithParameterAndWithoutReturnType("Function with parameter and without return type")
//    val result = functionWithParameterAndWithReturnType("Function with parameter and with return type")
//    println(result)
    val result1 = functionWithDefaultValue()
    println(result1) // Default value

    functionWithNamedParameter("One", "two") // One Two
    functionWithVariableNumberOfArguments("One", "two", "three", "four", "five")
    val sum = getSumLong(3,4,6,7,8,9)
    val sum1 = getSumLong(4,6,7,8,9)
    val sum2 = getSumLong(6,7,8,9)
    val sum3 = getSumLong(1,2,3,4,6,7)
    val sum4 = getSumLong(1,2,3,4,6)
    println("Total sum: ${sum+sum1+sum2+sum3+sum4}")


}


// Basic function structure of function
// fun baseFunctionStructure(parameter): ReturnType  {
//     return result
// }

// Function without parameter and without return type
 fun functionWithoutParameterAndWithoutReturnType() {
     println("Function without parameter and without return type")
 }



// Function without parameter and with return type
 fun functionWithoutParameterAndWithReturnType(): String {
     return "Function without parameter and with return type"
 }
// Function with parameter and without return type
fun functionWithParameterAndWithoutReturnType(parameter: String) {
    println(parameter)
}

// Function with parameter and with return type
fun functionWithParameterAndWithReturnType(parameter: String): String {
    return parameter
}

// Function with default value
fun functionWithDefaultValue(parameter: String = "Default value") {
    println(parameter)
}
// Function with named parameter
fun functionWithNamedParameter(parameter: String, parameter1: String) {
    println(parameter)
    println(parameter1)
}
// Function with variable number of arguments
fun functionWithVariableNumberOfArguments(vararg parameters: String) {
    for (parameter in parameters) {
        print(parameter+" ")
    }
}


/* Write a Program - passing multiple arguments and return sum.
 argument take as number and return result in long
*/

fun getSumLong(vararg parameters: Long): Long {
    var result: Long = 0
    for (parameter in parameters) {
        result += parameter
    }
    return result
}