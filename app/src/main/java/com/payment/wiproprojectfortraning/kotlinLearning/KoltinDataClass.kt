package com.payment.wiproprojectfortraning.kotlinLearning

/** Data class - What is data class?
 * - A data class is a special class that is used to hold data. (pojo class)
 * - Data class use keyword as data then you can create data class
 * - Automatically generate hashCode(), equals(), toString(), copy(), componentN() functions
 * - You don't need to implement(write) these functions (hashCode(), equals(), toString(), copy(), componentN() )
 * - Data class has some rule for create data class
 * - Primary constructor must have at least one parameter
 * - All primary constructor parameters must be marked as val or var
 * - Data class cannot be abstract, open, sealed, or inner
 * - Data class can implement interface
 * - Data class can extend other class
 *
 * */
// First Rule - Primary constructor must have at least one parameter
data class PersonDataClass(val name:String)
// Second Rule - All primary constructor parameters must be marked as val or var
data class  PersonDataClass1(var name:String)
// Third Rule - Data class cannot be abstract, open, sealed, or inner
/*abstract data class PersonDataClass3(val name:String)
open data class PersonDataClass4(val name:String)
sealed data class PersonDataClass5(val name:String)
inner data class PersonDataClass6(val name:String)*/
// Fourth Rule - Data class can implement interface
/*interface ClickListener {
    fun onClick()
    fun onLongClick()
}
data class PersonDataClass7(val name:String):ClickListener {
    override fun onClick() {
        TODO("Not yet implemented")
    }

    override fun onLongClick() {
        TODO("Not yet implemented")
    }

}*/

//// Fifth Rule - Data class can extend other normal class

open class NormalClass(open var name: String)
data class PersonDataClass8(override var name: String) : NormalClass(name) {

}

class PersonDataClass2(val name:String) {
    override fun toString(): String {
        return "PersonDataClass2(name='$name')"
    }
} // this not a data class this is normal class {}
fun main() {
    val personDataClass = PersonDataClass("Mukesh")
    val personDataClass1 = PersonDataClass1("Mukesh")
    println(personDataClass.toString())
    println(personDataClass.hashCode())
    println(personDataClass.copy("Rohan"))
    val normalClass = PersonDataClass2("Mukesh")
    println(normalClass.toString())
    println(normalClass.hashCode())

}
