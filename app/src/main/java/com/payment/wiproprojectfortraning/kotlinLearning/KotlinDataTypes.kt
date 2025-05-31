package com.payment.wiproprojectfortraning.kotlinLearning


/*** Kotlin Data Type - What is Data Types?
 * - Data types define the kind of data a variable can hold.
 * - Core kotlin Data types
 * - Numbers - Int - 8-bit, Double - 64-bit, Float - 32-bit, Long - 64-bit, Byte - 8-bit, Short - 16-bit
 * - Characters - Char - 16-bit Unicode character
 * - Booleans - Boolean - true - 1 or false - 0
 * - Strings - String - sequence of characters - Immutable squences of characters
 * - Arrays - Array - sequence of elements of the same type
 * - Any - Any - Any value
 * - Unit - Unit - Unit value - No return value
 * - Nothing - Nothing - Nothing value - never returns
 * - Enum - Enum - Enumerated values
 * - Map - Map - Key-value pairs of objects
 * - List - List - Ordered sequence of objects
 * */

fun main() {
    intIntro()
    doubleIntro()
    floatIntro()
    longIntro()
    byteIntro()
    shortIntro()
    charIntro()
    booleanIntro()
    stringIntro()
    arrayIntro()
}
/*** Numbers - Int - 8-bit, Double - 64-bit, Float - 32-bit, Long - 64-bit, Byte - 8-bit, Short - 16-bit
 *- Int - 32-bit signed two's complement integer - -2,147,483,648 to 2,147,483,647
 *  */
fun intIntro(){ // Int - 32-bit signed two's complement integer - -2,147,483,648 to 2,147,483,647
    println("Int")
    var num:Int = 10
    num = 20
    println(num)
}
fun  doubleIntro(){ // Double - 64-bit signed two's complement floating point number - -1.7976931348623157E308 to 1.7976931348623157E308
    println("Double")
    var num:Double = 10.0
    num = 20.0
    println(num)
}
fun  floatIntro(){ // Float - 32-bit signed two's complement floating point number - -3.4028235E38 to 3.4028235E38
    println("Float")
    var num:Float = 10.0f
    num = 20.0f
    println(num)
}
fun  longIntro(){ // Long - 64-bit signed two's complement integer - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    println("Long")
    var num:Long = 10L
    num = 20L
    println(num)
}
fun  byteIntro(){
    // Byte - 8-bit signed two's complement integer - -128 to 127
    // very small numbers range
    println("Byte")
    var num:Byte = 10
    num = 20
    println(num)
}
fun  shortIntro(){
    // Short - 16-bit signed two's complement integer - -32,768 to 32,767
    // medium sized numbers range
    println("Short")
    var num:Short = 10
    num = 20
    println(num)
}
fun  charIntro() {
    // Char - 16-bit Unicode character
    println("Char")
    var char: Char = 'a'
    char = 'b'
    println(char)
}
fun  booleanIntro() {
    // Boolean - true - 1 or false - 0
    // 1 bit of storage - true or false
    println("Boolean")
    var bool: Boolean = true
    bool = false
}

fun  stringIntro() {
    // String - sequence of characters - Immutable squences of characters
    println("String") // ['S', 't', 'r', 'i', 'n', 'g'] => String
    var str: String = "Hello"
    str = "World"
    println("Hello $str or length: ${str.length}")
    val name = "Mukesh"
    val second = "Kumar"
    val str1 = "My name is"+name +""+ second
    // Optimize way to define string like this is
    val str2 = "My name is $name $second"
    println(str1)
    println(str2)

    println(str)
}
fun  arrayIntro() {
    // Array - sequence of elements of the same type
    val array:Array<Int> = arrayOf(1,10,3,4,5,6,7,8)
    val arrayString = arrayOf("Hello", "Word", "Kotlin")
    println(arrayString.joinToString())
    println(array)
}







//
//val numArray = arrayOf(1, 2, 3, 4, 5)
//val charArray = arrayOf('a', 'b', 'c')
//val stringArray = arrayOf("Hello", "World")
