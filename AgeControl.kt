package vn.quocaan05.udemypractice

fun main(){
    print("Enter your age as a whole number: ")
    val enterValue = readln()

    var age = 0;
    age = enterValue.toInt()

    if (age in 18 .. 39){
        println("You can  go into the club")
    }else
    {
        println("Age not verified. Please contact support.")
    }
}