package eu.tutorials.rockpaperscissor

fun main(){
var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, Scissor... Enter your choice:-")
    playerChoice = readln()
    val randomChoice = (1..3).random();
    when(randomChoice){
        1->{
            computerChoice = "Rock";
        }
        2->{
            computerChoice = "Paper";
        }
        3->{
            computerChoice = "Scissor";
        }
    }
    println(computerChoice);
    val winner = when{
        playerChoice == computerChoice -> "tie"
        playerChoice == "Scissor" && computerChoice== "Rock" -> "computer"
        playerChoice == "Paper" && computerChoice== "Scissor" -> "computer"
        playerChoice == "Rock" && computerChoice== "Paper" -> "computer"
        else -> "Player"
    }
    if(winner=="computer"){
        println("computer won!")
    }
    else if(winner=="Player"){
        println("Player won!")
    }
    else{
        println("Tie ho gaya")
    }
}


