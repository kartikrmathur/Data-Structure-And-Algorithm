package datastructures.HashMap

fun main() {
    // create a new HashMap
    val myMap = hashMapOf<String, Int>()

    // add elements to the HashMap
    myMap.put("apple", 1)
    myMap.put("banana", 2)
    myMap.put("orange", 3)

    // print the HashMap
    println("Before Remove:- "+myMap)

    // remove an element from the HashMap
    myMap.remove("banana")

    // print the updated HashMap
    println("After Remove:- "+myMap)

    // check if a key is present in the HashMap
    val containsKey = myMap.containsKey("apple")
    println("Contains key 'apple': $containsKey")

    // check if a value is present in the HashMap
    val containsValue = myMap.containsValue(3)
    println("Contains value 3 - : $containsValue")
}
