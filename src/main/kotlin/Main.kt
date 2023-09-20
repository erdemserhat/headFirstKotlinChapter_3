import java.lang.Exception
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

    val myArray = arrayListOf(1,2,3,4,5)
    for (i in myArray.indices){
        println(myArray[i])
    }

    var myExArray= arrayListOf(12,43,0,-1,100,-5,3)
    sortMyArray(myExArray)
    System.err.println("here")
    for (i in myExArray.indices){
        if (i==0) print(myExArray[i])
        else print(",${myExArray[i]}")
    }

    //particularly important
    for(x in 100 downTo 0 step 2){
        println(x)
    }

    val xArray= arrayListOf(2,1,4,5,76,7)
    for (item in xArray){
        System.err.println(item)
    }

    for ( (item,index) in xArray.withIndex()){
        println("$item=$index")
    }



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

 //Creating functions in just one line
fun findMin(a:Int,b:Int):Int=if (a>b) b else a
fun findSqr(number:Int)=number*number

fun sortMyArray(paramArray: ArrayList<Int>){
    var i=0
    while(i<paramArray.size-1){
        var temp1=paramArray[i]
        var temp2=paramArray[i+1]
        if(temp1>temp2){
            paramArray[i]=temp2
            paramArray[i+1]=temp1
            i=0
        }else{
            i++
        }
    }
}

fun optimizedBubbleSort(paramArray: ArrayList<Int>) {
    val n = paramArray.size
    var swapped: Boolean
    var lastIndex = n - 1

    do {
        swapped = false
        for (i in 0 until lastIndex) {
            if (paramArray[i] > paramArray[i + 1]) {
                // Swap elements
                val temp = paramArray[i]
                paramArray[i] = paramArray[i + 1]
                paramArray[i + 1] = temp
                swapped = true
                lastIndex = i // Son yapılan takasın indeksini güncelle
            }
        }
    } while (swapped)
}

