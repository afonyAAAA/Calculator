import utils.validate
import utils.validateForDouble

fun main(){

    showPresentMessage()

    var num = readLine()

    while(!validate(value = num)){
        num = readLine()
    }

    chooseOperation(num = num!!.toInt())
}

fun showPresentMessage(){
    println("Добро пожаловать! Это калькулятор, где соответсвенно есть четыре операции: " +
            "\n 1) Умножение" +
            "\n 2) Деление" +
            "\n 3) Сложение" +
            "\n 4) Вычитание" +
            "\nПожалуйста выберите операцию: "
    )
}

fun repeatCalculator(){
    println("Чтобы вернуться к выбору операций введите <back>, чтобы завершить работу <turn of>")
    var choice = readLine()
    when(choice){
        "back" -> {
            main()
        }
        "turn off" -> {
            return
        }
        else -> {
            println("Введено неккоректное значение.")
            repeatCalculator()
        }
    }
}


fun chooseOperation(num : Int){

    val operations = MathematicalOperations

    when(num){
        1 -> {

        }
        2 -> {

        }
        3 -> {

        }
        4 ->{
            println("Выбрано вычитание.\nВведите первое число: ")
            var number1 = readLine()

            while(!validate(number1)){
                number1 = readLine()
            }

            println("Введите второе число:")
            var number2 = readLine()

            while(!validate(number2)){
                number2 = readLine()
            }

            if(validateForDouble(number1) || validateForDouble(number2)){
                println("Вывод: ${operations.subtraction(number1!!.toDouble(), number2!!.toDouble()).toInt()}")
            }else{
                chooseOperation(num)
            }
        }
    }
    repeatCalculator()
}


