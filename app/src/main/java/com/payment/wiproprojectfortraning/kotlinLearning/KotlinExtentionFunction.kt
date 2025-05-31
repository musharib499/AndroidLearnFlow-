package com.payment.wiproprojectfortraning.kotlinLearning

/*** Extension Function - What is extension function? =
 * - extension + function  = extension function = ClassName.functionName():ReturnType { 'this' is class reference }
 *
 * - An extension function allow extend new functionality.
 * - Without - modifying in the original class we can achieve this functionality.
 * - Without - Inheriting the class - we can achieve this functionality.
 * - Without - Adding new functionality into a class - we can achieve this functionality.
 * - Extension function are declared outside a the class
 * - Extension function are not static
 * - Extension properties have no backing field
 * - They are resolved at compile-time, not runtime.
 *
 * */
// ClassName.functionName():ReturnType { 'this' is class reference }
fun main() {
    val stringValue ="hello kotlin".capitalizeFirstWord()
    println(stringValue) // Hello Kotlin

    val squareValue = 10.square()
    println(squareValue)
    val person = Person("Mukesh", 30)
    person.setAddress("My Address : Delhi")
    println(person.getAddress())
    println(person.getMessage())
    println(10.0.square())
    println(100000000.getString())
    println(9999.covertIntoDouble())
}

/** How can use extension function?
 * - Extension function are declared outside the class
 * -
 * */


fun String.capitalizeFirstWord():String {
    return this.replaceFirstChar { it.uppercase() }
}
fun Int.square() :Int {
    return  this*this
}
fun Int.getString():String {
    return  "$this"
}
fun Double.square() :Double {
    return  this*this
}

fun Int.covertIntoDouble():Double {
    return  this.toDouble()
}

// Extension function with class
 final  class  Person(val name: String, val age: Int) // inside of class we not modifying


fun  Person.introduce():String {
    return "Hi, I am $name and I am $age years old."
}
fun Person.getMessage():String {
    return  "Name ${this.name} + Age ${this.age} + Address${this.getAddress()}"
}

/**I want to add new parameters in extension function
 * - Not modify inside of class
 * - Not inheriting the class
  */
val addressMap = mutableMapOf<Person,String>()
fun Person.setAddress(address:String) {
    addressMap[this] = address
}
fun Person.getAddress() : String {
    return  addressMap[this] ?: ""
}
