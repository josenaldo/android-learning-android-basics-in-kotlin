fun main(){
    val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled $diceRoll")
}

class Dice {
    var sides = 6

    fun roll(): Int {
        return (1..6).random()
    }
}


main()