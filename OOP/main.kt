package OOP


fun main(){
    val favCar = Car("Black","Benz", "2024");
    println(favCar.brand);

    val myDog = Dog("Bingo");
    myDog.eat();

    Cars().drive();

}
//class Car {
////    variable inside class called property
//    val colour:String = "Green";
//    val brand:String = "Benz";
//    val year:String = "2024";
//}




// Shape; Triangle, Square

open class Shape (val name: String){
    fun findArea(){
        println("Calculate area...");
    }
}

class Triangle(name: String): Shape(name){
    fun numbSize(): Int{
        return 3;
    }
}


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


interface Drivable{
    fun drive();
}
interface Flyable{
    fun fly();
}


class Cars : Drivable{
    override fun drive() {
        println("Car is driving");
    }

}
class AirPlane : Drivable, Flyable{
    override fun drive() {
        println("Plane is driving");
    }
    override fun fly() {
        println("Plane is flying");
    }

}