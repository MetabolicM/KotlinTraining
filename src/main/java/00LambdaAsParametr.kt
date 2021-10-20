 fun main() {
        val fun1 = {str: String -> str + " + fun1"}
        val fun2 = {str: String -> "fun2 * " + str}
        val fun3 = {str: String -> "ignore parametr"}
        val string: String = "someText"

        madFunc(string, fun1)
        madFunc(string, fun2)
        madFunc(string, fun3)
        madFunc(string) { str: String -> "direct passing $str"}
        madFunc(string) { "direct passing with ignore"}

    }

    fun madFunc(someString: String, methodObject: (someParam1: String) -> String ){
        println(methodObject.invoke(someString))
    }