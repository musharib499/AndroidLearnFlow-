package com.payment.wiproprojectfortraning.kotlinLearning

/** Access Modifiers - What is access modifiers?
 * - Access modifiers are used to restrict the access to the members of a class.
 * - or We can say define visibility.
 * - Where a class,function,property(elements)
 * - How many types of access modifiers are there?
 * - public - Access from anywhere
 * - private - Access from same class
 * - protected - Access from same class and subclass
 * - internal - Access from same module
 * - Open - Access from anywhere
 * */

/* Open vs public
* - Public  - control visibility (accessbility ) from anywhere
* - Open - Control (inheritability + access) (can extend and override) from anywhere
*  */

/* App
*  - ProfileModule - if you some class mark as internal - you can access inside of module
* - DashBoardModule - profileModule class as internal you can not access in this module.
* */

open class A() {}

class B():A() {
    val a = A()
}