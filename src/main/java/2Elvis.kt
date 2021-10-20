class `2Elvis` {
}

data class Some(var str: String? = null)

fun main() {
    val some1 = Some()
    val some2 = Some("test str")

    //println(some1.str.length) - don't work, cause str can be null< and executing of lenght method may throws exception
    println(some1.str?.length)// when str is null, length not executed<? and returns null
    println(some2.str?.length)
}