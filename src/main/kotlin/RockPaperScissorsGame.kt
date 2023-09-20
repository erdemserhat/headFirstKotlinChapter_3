/* The start point of Game (main function) */
fun main(args: Array<String>) {
    //Welcome text
    println("Welcome to Game!")
    //Options are assigned for setting up game
    val options = arrayOf("Rock", "Paper", "Scissors")
    //A random index is selected in 0..2
    val randomIx = (Math.random() * 3).toInt() //[0,3)-->[0,2]->0,1,2
    //Computer's selection is assigned for corresponding value in randomIx
    val computerSelection = options[randomIx]
    println("You must answer by writing; Scissors, Rock and Paper")
    println("(Sensitive for upper and lower letters)")
    print("Type your answer:")
    val userSelection= readln()
    defineWinner(userSelection,computerSelection)

}


    //Optimized Algorithm
fun defineWinner(userSelection: String, computerSelection: String) :String {
    var result:String
    if (userSelection == computerSelection) {
        result="Draw!"
        println(result)
    } else if (
        userSelection == "Paper" && computerSelection == "Rock" ||
        userSelection == "Rock" && computerSelection == "Scissors" ||
        userSelection == "Scissors" && computerSelection == "Paper"
    ) {
        result="You won!"
        println(result)
    } else {
        result="You lost!"
        println(result)
    }
    println("Computer's selection was $computerSelection ")
        return result;

}

    //BruteForce Algorithm
fun defineWinner2(userSelection: String, computerSelection: String) {
    if (userSelection == "Paper") {
        if (computerSelection == "Paper") println("Draw!")
        else if (computerSelection == "Rock") println("You won!")
        else if (computerSelection == "Scissors") println("You lost!")
        print("Computer's selection is $computerSelection")

    } else if (userSelection == "Rock") {
        if (computerSelection == "Rock") println("Draw!")
        else if (computerSelection == "Paper") println("You lost!")
        else if (computerSelection == "Scissors") println("You won!")
        print("Computer's selection is $computerSelection")

    } else if (userSelection == "Scissors") {
        if (computerSelection == "Scissors") println("Draw!")
        else if (computerSelection == "Paper") println("You won!")
        else if (computerSelection == "Rock") println("You lost!")
        print("Computer's selection is $computerSelection")
    }


}
