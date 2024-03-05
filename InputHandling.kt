package vn.quocaan05.udemypractice

fun main() {
    println("Please enter a number")
    var inputString = readln().toInt()

    var inputNumber = inputString
    val multiplier = 5

    val res = multiplier / inputNumber

    println("Result of operation is: $res")
}