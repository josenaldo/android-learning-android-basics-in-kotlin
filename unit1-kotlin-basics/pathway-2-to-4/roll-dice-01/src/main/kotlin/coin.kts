enum class CoinFace{
    HEADS, TAILS
}
class Coin {
    fun flip(): CoinFace {

        val face = (0..1).random()
        return (CoinFace.values()[face])
    }
}

fun main() {
    val coin = Coin()

    println("1 Flip the coin: ${coin.flip()}")
    println("2 Flip the coin: ${coin.flip()}")
    println("3 Flip the coin: ${coin.flip()}")
    println("4 Flip the coin: ${coin.flip()}")
    println("5 Flip the coin: ${coin.flip()}")
}

main()