package com.payment.wiproprojectfortraning.kotlinLearning

import  com.payment.wiproprojectfortraning.kotlinLearning.Address
import  com.payment.wiproprojectfortraning.kotlinLearning.UserData

/** Kotlin Null Safety - What is null safety?
 * - Null safety is a feature in Kotlin that helps to prevent null pointer exceptions.
 * - Null safety is a way to handle the possibility of a variable being null.
 * - nullable and non-nullable types.
 * - Nullable types are types that can hold null values.
 * - Nullable - can be null  var a = null
 * - Non-nullable - cannot be null var a = 10
 *
 * */

fun main() {
    //nonNullAbleIntro()
    nullableIntro()
    nullSafetyWithNested()
}

/* Non-nullable types
*  - Non-nullable types are types that cannot hold null values.
* - Error throw at compile time or run time
* */

fun nonNullAbleIntro(){ // You can not assing null value to non-nullable type
    var a : String = "hello" // Assign a non-null value to a variable
    //a = null // Error: Null can not be a value of a non-null type String run and compile time error
    println(a) //
}


/** Kotlin Nullable Types?
 * - Nullable types are types that can hold null values.
 * - Nullable types are denoted by a question(?) mark after the type name. ?: - Elvis operator
 * - We can assign null value to nullable types.
 * - Elvis operator ?: - If value is null then assign default value
 * - Safe call operator ?. - If value is null then return null
 * - Not-null assertion operator !! - If value is null then throw null pointer exception
 * */

fun nullableIntro(){
    var a:String? = "hello"
    a = null
    println(a)
    a = null
    a?.length // Safe call operator
    val length = a?.length ?: 0 // Elvis operator
    println( length)

    // Not-null assertion operator
//    val length2 = a!!.length
//    println(length2)

    val length1 = if(a != null) a.length else 0
    println(length1)
}

fun  nullSafetyWithNested(){
    val person = PersonData("John", UserData(25, "Male", Address("New York", "NY", "USA")))
    val personAddressNull = PersonData("John", UserData(25, "Male", null))
   // if address is not null then print city value
    var country = person.user?.address?.country
    println(country)
    // if you writing code with if else condition
     if (person.user != null && person.user!!.address != null) {
            println(person.user!!.address!!.country)
     }


// if person address is null then assign default value city value
    country = personAddressNull.user?.address?.country ?: "Unknown"
    println(country)
}

data class PersonData(var name:String?, var user:UserData?)
data class UserData(var age:Int, var gender:String, var address: Address?)
data class Address(var city:String?, var state:String?, var country:String?)


 // Lunch break

