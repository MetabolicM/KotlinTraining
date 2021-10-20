class First(num: Int, str: String)

data class Second(val num: Int,val str: String)

data class Third(var num: Int,var str: String)

data class Fourth(var num: Int,var str: String?)

data class Fith(var num: Int = 5,var str: String = "default")

fun main() {
    val firstClass = First(1, "some")
    println(firstClass)//NullAndElvis@19dfb72a

    val secondClass = Second(2, "some more")
    println(secondClass)//Second(num=2, str=some more)

    //secondClass.num = 5 - dont work

    val thirdClass = Third(3, "another")
    println(thirdClass)//Third(num=3, str=another)
    thirdClass.num = 5
    thirdClass.str = "changed string"
    println(thirdClass)//Third(num=5, str=changed string)

    val fourthClass = Fourth(4, null)// passing null is normal, or:
    fourthClass.str = null
    println(fourthClass)//Fourth(num=4, str=null)

    //thirdClass.str = null - don't work

    val fithClass = Fith() // when exists default values, we can hide parameters, or:
    val fithClass1 = Fith(4)
    val fithClass2 = Fith(34, "test")
    //val fithClass3 = Fith("sdf") - don't work, cause default parameters must hide from end
}