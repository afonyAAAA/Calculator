import utils.displayShrek
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
            "\n 5) Показать шрека?..." +
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

        }
        5 ->{
            displayShrek()
        }
    }
    repeatCalculator()
}


