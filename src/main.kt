fun main(){
    println("Welcome to my calculator");
    println("Please enter the first number you want to use: ");
    val number1 = readln() ?: "0";
    val parsedNumber1 = try{
        number1.toInt();
    }catch(e: Exception){
        0
    }
    println("Please enter the second number you want to use: ");
    val number2 = readln() ?: "0";
    val parsedNumber2 = try{
        number2.toInt();
    }catch(e: Exception){
        0
    }

    var operator = "+";
    var checked = false;
    do{
        println("Please enter the operator you want to use:");
        operator = readln() ?: "+";
        checked = checkOperator(operator);
    }while(!checked)
    var result = 0;
    when(operator){
        "+" -> result = parsedNumber1 + parsedNumber2;
        "-" -> result = parsedNumber1 - parsedNumber2;
        "*" -> result = parsedNumber1 * parsedNumber2;
        "/" -> result = parsedNumber1 / parsedNumber2;
        else -> {
            println("Wrong operator");
        }
    }
    println("The result of $parsedNumber1 $operator $parsedNumber2 is $result");
}

fun checkOperator(operator: String): Boolean{
    when(operator){
        "+", "-", "*", "/" -> return true;
        else -> {
            println("Wrong operator");
            return false;
        }
    }
}