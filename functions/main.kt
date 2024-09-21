package functions

fun main() {

    greet();
    getUserName("NURUDEEN");
    calculateSquare(5);

}
    fun greet(){
        println("Hello Function");
    }

// Function with paramiter
    fun getUserName(name: String){
    println("USER NAME is $name")
    }

// Function with Return Type
    fun calculateSquare(number: Int):Int{
       val result = number * number;
       println(result);
       return result;
    }
