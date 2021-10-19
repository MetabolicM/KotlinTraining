package entities

data class TestKotlinEntity(val first : String = "defFirst", val second: String = "defSecond", val numb: Int = 777) {
    constructor(_first: String) : this(_first, "secCons", 888)

    override fun toString(): String {
        return "this is TestKotlinEntity! first: $first, second: $second, numb: $numb"
    }
}