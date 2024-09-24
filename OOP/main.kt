package OOP


fun main(){
    val favCar = Car("Black","Benz", "2024");
    println(favCar.brand);

    val myDog = Dog("Bingo");

    myDog.eat();
}
//class Car {
////    variable inside class called property
//    val colour:String = "Green";
//    val brand:String = "Benz";
//    val year:String = "2024";
//}

class Car (
    val colour:String ,
    val brand:String ,
    val year:String ,
){
//    function inside cass called method
    fun drive(){
    println("Start Driving a Car")
    }

    fun stop(){
        println("Stopping a Car")
    }
}
open class Animal(val name: String){
    fun eat(){
        println("$name is eating")
    }
}
class Dog(name: String) : Animal(name){
    fun bark(){
        println("$name is barking")
    }
}
