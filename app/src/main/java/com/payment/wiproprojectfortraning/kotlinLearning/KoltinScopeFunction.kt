package com.payment.wiproprojectfortraning.kotlinLearning

/** Kotlin Scope Function - What is scope function?
*  - Scope Function - Purpose is to execute a block of code within the context of an object.
 *  - Why use scope function?
 *  - Initialize or configure objects
 *  - Perform actions with side effect (logging, validation)
 *  - Transform data safely (null handling)
 *  - chain operations on objects
 *  - How many type of scope function are there?
 *  - Scope is 5 types
 *  - Let - used to check null value and transformation of data - return lambda result and last line of code | Object reference - it
 *  - run - use to check null execute operation - return lambda result and last line of code | Object reference - this
 *  - with - use to work with an object without creating an extra variable - return lambda result and last line of code | Object reference - this
 *  - apply - use to initialize or configure an object - return object | Object reference - this
 *  - also - use to logging or validation or debugging - return object | Object reference - it
* */


/* Let {it} - used to check null value and transformation of data
*  - Reference - it
*  -  return - lambda result and last line of code
*  - Use case - check null value and transformation of data
* */

data class UserInfo(var name:String?, var age:Int?, var gender:String?)
fun letIntro() {
    var name :String? = "Koltin"
    name?.let { println(it) }
    name = null
    name?.let { println("name is null $it")
    }
    name = null
   val n1 = name?.let {
       println("name is not null $it")
        "Weclome"
    }
    println(n1)
    var userInfo:UserInfo? = null
    userInfo = UserInfo("John", 25, null)
   val userInfo1 = userInfo?.let {
        println("${it.name} - ${it.age} - ${it.gender}")
        it.name = "John Doe"
        it.age = 30
        it.gender = "Male"
        println("${it.name} - ${it.age} - ${it.gender}")
        it
    }
    println(userInfo1)

    val list = mutableListOf(1, 2, 3, 4, 5)
    val sum = list?.let {
        it.map { item ->  item*2 }.reduce{a,acc -> a+acc} }
    println(sum)

}

/* Run {this} - use to check null or execute operation - return lambda result and last line of code | Object reference - this
* ?.run{this}
* - return - lambda result and last line of code
* - Object reference - this
* - Use Case - check null or execute operation
* */

fun runIntro() {
    val message:String? =  "Hello"
    val updateMessage = message?.run {
        println(this)
        this + "kotlin"
    }
    println(updateMessage)
    val numbers = mutableListOf("one", "two", "three")
    val count = numbers.let {
        it.add("four")
        it.add("five")
        println(it)
        it.size
    }

    val contEndedNumber = numbers?.run {
        add("six")
        add("seven")
        println(this)
        count { it.endsWith("x")}
    }
    println("Number of elements: $count")
    println("Number of elements ended value: $contEndedNumber")

}

/* With {this} - use to work with an object without creating an extra variable - return lambda result and last line of code | Object reference - this
* - return - lambda result and last line of code
* - Object reference - this
* - With is not an extension function
* - Context object is pass as an argument but inside the lambda expression it is available as a receiver (this).
* - it not checked null value
* - Use Case - work with an object without creating an extra variable
* */

fun withIntro() {
    val numbers = mutableListOf("one", "two", "three")
    println("List item $numbers")
    println("List size ${numbers.size}")
    println("Print with list item ${numbers.first()} + last item ${numbers.last()}")

    with(numbers) {
        println("Print with list item $this")
        println("List size ${this.size}")
    }
    val firstAndLast = with(numbers) {
        println("Print with list item $this")
        println("List size ${this.size}")
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)
}

/* Apply {this} - use to initialize or configure an object - return object | Object reference - this
*  - Return Object
*  - Object reference - this
*  - Apply is an extension function
*  -  Also check Nullability
*  -  Use case - Initialize or configure an object
* */

fun applyIntro() {
    val userInfo:UserInfo? = UserInfo("Heena", 25, "female")
    val userInfo1 = userInfo?.apply {
        name = "John Doe"
        age = 30
        gender = "Male"
    }
    println(userInfo1)


}

/* Also - use to logging or validation or debugging - return object | Object reference - it
*  -  Return Object
*  -  Object reference - it
*  -  Use case - Logging or validation or debugging
* */

fun alsoIntro() {
    val numbers = mutableListOf("one", "two", "three")
    val result = numbers.also {
        println("The list elements before adding new one: $it") // [one, two, three]
        it.add("four")
    }
    println("The list elements after adding new one: $result") // [one, two, three, four]
}


fun main() {
//    letIntro()
//    runIntro()
//    withIntro()
//    applyIntro()
      alsoIntro()
}