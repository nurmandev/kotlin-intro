package collectionsKotlin


fun main(){
    val fruits = arrayOf<String>("Nman", "Jamiu", "Ade", "Ayinla");
    println(fruits[1]);

    val ages = arrayOf<Int>(24,40,26,30,10,15,28);

// For loop in Array
    for (age in ages){
        println(age);
    }
// For each loop in Array
    ages.forEach {age ->
        println("Each user Age is : $age")
    }

    val isAvailable = ages.contains(30);
    println(isAvailable);

    if (isAvailable){
        println("This is nurudeen");
    }else{
        println("I think it's someone else Age");
    }

}
fun arrayInKotlin() {

}