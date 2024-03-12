package vn.quocaan05.udemypractice.day3


data class MakeCoffe(val sugarCount: Int, val name: String){
    fun add(){
        println("call add func")
    }
}
fun main() {
    val coffee = MakeCoffe(20, "AN")
    makeCoffe(coffee)
}


fun add (a:Int, b: Int): Int{
    val res = a + b
    return res
}

//fun askDetail() {
//    println("Who is this coffee for ? ")
//    var name = readln()
//    println("How many spoon of sugar do you want? ")
//    var sugarCount = readln().toInt()
//    makeCoffe(sugarCount, name)
//}

fun makeCoffe(coffee: MakeCoffe) {



    when (coffee.sugarCount) {
        0 -> {
            println("Coffee with no sugar for ${coffee.name}")
        }

        1 -> {
            println("Coffee with 1 spoon of sugar for ${coffee.name}");
        }

        else -> {
            println("Coffee with ${coffee.sugarCount} spoons of sugar for ${coffee.name}")
        }
    }

//    if (sugarCount == 1){
//        println("Coffee with 1 spoon of sugar");
//    } else {
//        println("Coffee with $sugarCount spoons of sugar")
//    }

}