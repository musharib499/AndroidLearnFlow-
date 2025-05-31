package com.payment.wiproprojectfortraning.kotlinLearning

import androidx.compose.runtime.Immutable

/** Collection - What is collection?
 * - Collection is a group of objects.
 * - Collection is a container that can hold multiple objects (elements).
 * - Object are usually of the same type.
 * - Used to store, organize, manipulate data and operate on group of data (item)
 * - Type of collection on kotlin - List, Set Map
 * */

/** Collection Interface
 * - Iterable<T> Base interface for iterating over a collection of elements.                  // T - Any Data type which you need to pass
 * - Collection<T> (immutable)Read - only access to object or elements in the collection.               // T - Any Data type which you need to pass
 * - MutableCollection<T> (Read + Write)(add, remove, modify) Mutable access to object or elements in the collection.            // T - Any Data type which you need to pass
 * */

/* List - List is an ordered collection of elements.
* - List is a collection that can hold duplicate elements.
* - List<T> Read - immutable read only access to object or elements in the list.
* - MutableList<T> Read + Write Mutable access to object or elements in the list.
 */

fun listIntro() {
    // Immutable list - where you need to show only then you can use this for privacy.
    var immutableList = listOf(1, 2, 3, 4, 5)
     immutableList.plus(10) // we can not add the value in immutable list
    immutableList = immutableList.plus(10) // we can add the value in immutable list
    // [1,2,3,4,5,10] = [1,2,3,4,5] + [10]
    println(immutableList) // [1, 2, 3, 4, 5]
    // Mutable list
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)
    mutableList.remove(3)
    mutableList.set(0, 10)
    println(mutableList)


}

/* Set - Set is an unordered collection of unique elements.
* - Set is a collection that cannot hold duplicate elements.
* - Set<T> Read - immutable read only access to object or elements in the set.
* - MutableSet<T> Read + Write Mutable access to object or elements in the set. - Allow add and remove operations
* - LinkedHashSet - It maintains the insertion order of elements.
* - HashSet - It does not maintain any order of elements. No guarantee that the elements will be in a specific order.
* */

fun setIntro() {
   // Immutable set -  only read operation allowed

    val immutableSet = setOf(1, 2, 3, 4, 5)
    println(immutableSet)
    println(immutableSet.contains(10))
    println(immutableSet.size)


    // Mutable set - Read + Write operation allowed
    val mutableSet = mutableSetOf(1, 2, 3, 4, 5)
    mutableSet.add(6)
    mutableSet.remove(3)
    println(mutableSet)
    println(mutableSet.contains(10))

}

/* Map - Map is a collection of key-value pairs.
* - Map<Key, Value> Collection of key and value pairs.
* - Map - Key is unique and value is not unique. value should be duplicate - key never duplicate
* - Map<Key, Value> Read - immutable read only access to object or elements in the map.
* - MutableMap<Key, Value> Read + Write Mutable access to object or elements in the map.
* - LinkedHashMap - It maintains the insertion order of elements. -
* - HashMap - It does not maintain any order of elements. No guarantee that the elements will be in a specific order.
* */

fun mapIntro() {
    println("--------------MAP ------------------------")
    // Immutable map -  only read operation allowed
    val immutableMap = mapOf(1 to "One", 2 to "Two", 3 to "Three") // mapOf<Int,String> {1:"One",2:"Two",3:"Three"}
    println(immutableMap)
    println("Key : ${immutableMap.keys}")
    println("Value : ${immutableMap.values}")
    println("Access value : ${immutableMap.getValue(1)}")
    println("Access value : ${immutableMap.getOrDefault(4, "Nothing found")}")
    println("Contains value : ${immutableMap.contains(2)}")
    println("Not Contains value : ${immutableMap.contains(10)}")
        if (immutableMap.contains(10)) {
           //  as per according you can write logic
        } else {
            // if value not found then - as per according you can write logic
        }

    // Mutable map - Read + Write operation
    println("----------------------Mutable Map---------------------------------")
    val mutableMap = mutableMapOf<Int,String>()
    mutableMap.put(4, "Four")
    mutableMap[5] = "Five"
    mutableMap.put(1, "One")
    mutableMap.put(2, "Two")
    mutableMap.put(3, "Three")
    mutableMap.put(4, "---")
    println(mutableMap)
    println(mutableMap.keys)
    println(mutableMap.values)
    println(mutableMap.getValue(1))
    println(mutableMap.getOrDefault(4, "Nothing found"))
    println(mutableMap.contains(2))
    println(mutableMap.contains(10))
    println(mutableMap.remove(4))
    println("Remove value from $mutableMap")
   // mutableMap.remove(3)
}




fun main() {
  //  listIntro()
   // setIntro()
    mapIntro()

}