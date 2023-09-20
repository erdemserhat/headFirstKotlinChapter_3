import java.util.Scanner
import kotlin.math.abs

fun main(){
    val user1:String
    val user2:String
    val user1guess:Int
    val user2guess:Int
    //[0,9]+1 =[1..10]
    val selectedNumber:Int=((Math.random()*10)+1).toInt()

    val scanner: Scanner= Scanner(System.`in`)

    println("Hello, this is a bet game and this game is played with 2 people..")
    println("you two  will guess a number between 1 and 10, and a number with the same range randomly selected.")
    println("Winner is the person who guess a number which is nearest the selected number")
    print("First username:")
    user1=scanner.next()
    print("Enter first user's guess :")
    user1guess=scanner.nextInt()
    print("Second username:")
    user2=scanner.next()
    print("Enter second user's guess :")
    user2guess=scanner.nextInt()
    scanner.close()

    val user1Degree= abs(selectedNumber-user1guess)
    val user2Degree= abs(selectedNumber-user2guess)
    if(user1Degree>user2Degree){
        println("Winner is $user2")
    }else if(user2Degree>user1Degree){
        println("Winner is $user1")
    }else{
        println("Draw >")
    }
    System.err.println("(selected number is $selectedNumber)")








}