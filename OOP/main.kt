package OOP


fun main(){
    val favCar = Car("Black","Benz", "2024");
    println(favCar.brand);
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