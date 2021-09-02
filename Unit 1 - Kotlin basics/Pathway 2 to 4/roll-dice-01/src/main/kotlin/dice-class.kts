class Dice(val numSides: Int, val color: String) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

fun main(){
    val myFirstDice = Dice(6, "blue")
    println("Your ${myFirstDice.numSides} sided ${myFirstDice.color} dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20, "yellow")
    println("Your ${mySecondDice.numSides} sided ${mySecondDice.color} dice rolled ${mySecondDice.roll()}!")
}

main()