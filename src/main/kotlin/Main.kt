import java.lang.Exception
import kotlin.math.max
import kotlin.math.sqrt

fun main(args: Array<String>) {
    add(10,20)
    val x=multiply(5,10)
    println("x:$x")
    var b=51
    val c = isPrime(b)
    println("$b is ${if(c) "prime" else "not prime"}")
    val myList=findPrimesInRange(100,200)

    for (i in 1..myList.size){
        if(i==1) {print(myList[i-1])
        }else{
            print(", ${myList[i-1]}")

        }
    }

    println()
    val j=returnMaxNumber(1312,2)
    println("max is $j")

}

//The type with only one value: the Unit object. This type corresponds to the void type in Java.
fun add(number1:Int, number2:Int): Unit{
    println(number1+number2)
}
//returns Int
fun multiply(a:Int, b:Int): Int {
    return a*b
}

fun isPrime(candidateNumber:Int):Boolean {
    var flag=true
    for (i in 2..sqrt(candidateNumber.toFloat()).toInt()) {
        if (candidateNumber % i == 0) {
            flag = false
            break

        }
    }
    return flag
}


fun findPrimesInRange(minRange:Int,maxRange:Int):ArrayList<Int>{
   var arrayListPrimes= arrayListOf<Int>()
    for(i in minRange..maxRange){
        if(isPrime(i)) arrayListPrimes.add(i)
    }

    return arrayListPrimes
}


//Write a sorting fun for a taken array parameter
//write a fun which returns a max value in the array.
//Learn readLine function


//Write a fun which returns max value of two numbers
fun returnMaxNumber(a:Int,b:Int):Int{
    if (a>b) return a;
    else if (b>a) return b
    else throw  Exception("They are equal")
}
