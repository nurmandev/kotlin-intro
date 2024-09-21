package forLoops

fun main() {
//    Range
    for (i in 1..10){
        println("hello $i");
    }

//    Collection
    val fruits = arrayOf("Banana", "Apple", "Mango");
    for (fruit in fruits){
        println("fruits are : $fruit")
    }
}