package vn.quocaan05.udemypractice

fun main (){
    var computerChoice = ""
    var playerChoice =""

    var check = 1

    while(check == 1) {
        println("keo bua bao?")
        playerChoice = readln()
        when (playerChoice){
            "Keo" -> {
                check = 0
            }
            "Bua" ->{
                check = 0
            }
            "Bao" -> {
                check = 0
            }
            else -> {
                check = 1
            }
        }
    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Keo"
        }
        2 -> {
            computerChoice = "Bua"
        }
        3 -> {
            computerChoice = "Bao"
        }
    }
    println("Computer: $computerChoice")

    val winner = when {
        playerChoice == computerChoice -> "Hoa"
        playerChoice == "Keo" && computerChoice == "Bao" -> "Player"
        playerChoice == "Bua" && computerChoice == "Keo" -> "Player"
        playerChoice =="Bao" && computerChoice == "Bua" -> "Player"
        else -> "Computer"
    }

    when (winner) {
        "Hoa" -> {
            println("Hoa")
        } else ->{
            println("Winner is: $winner !!!!!!")
        }
    }


}