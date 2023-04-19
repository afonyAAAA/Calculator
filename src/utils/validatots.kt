package utils

fun validate(value : String?) : Boolean{
    return if(value?.toIntOrNull() == null){
        println("Вы ввели неккоректное значение. Попробуйте ещё раз")
        false
    }else
        true
}

fun validateForDouble(value: String?) : Boolean{
    return if(value?.toDoubleOrNull() == null){
        println("Вы ввели неккоректное значение. Попробуйте ещё раз")
        false
    }else
        true
}
