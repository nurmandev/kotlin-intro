package Operators

        /*
            * Operators & Expressions
        * */
fun main() {

    //OPERATORS
    val total = 100 + 50 //literal value
    val result = 20 + total;

            println(result);

            /*
            * TYPE OF OPERATORS
            * -------------------
            *   1. Arithmetic Operator
            *   2. Assignment Operator
            *   3. Comparison Operator
            *   4. Logical Operator
            * */



            val applePrice = 20;
            val orangePrice = 4;

            val fruitPrice = applePrice + orangePrice;
            println(fruitPrice);

            println("Can we go outside ${fruitPrice}");



//            CONDITIONAL OPERATOR
            val age = 16;
            if(age >= 18){
                println("You're eligible to vote");
            }else{
                println("You're not eligible to vote");
            }


            val voterAge = 70;
            if (voterAge >= 60){
                println("You can vote you're eligible for senior citizen discount");
            }else if (voterAge >= 18){
                println("You can vote but you're not eligible for senior citizen discount");
            }else{
                println("You can not vote and you're eligible for senior citizen discount");
            }


            val firstNum = 20;
            val secondNum = 130;

            val max = if (firstNum > secondNum) firstNum else secondNum;
            println("User maximum is : $max");


//            USE WHEN Conditionals: WHEN Statements

            val trafficLightColour = "Red";
            when(trafficLightColour){
                "Red" -> println("Stop")
                "Yellow" -> println("Get Ready")
                "Green" -> println("Go")

                else -> println("Invalid colour")
            }
}
