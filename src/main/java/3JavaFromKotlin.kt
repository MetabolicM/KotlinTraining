import entities.TestJavaEntity

fun main() {
    val testJavaEntity1 = TestJavaEntity()
    val testJavaEntity2 = TestJavaEntity("FromConstrF", "FromConstrS")

    println(testJavaEntity1)
    println(testJavaEntity2)
}