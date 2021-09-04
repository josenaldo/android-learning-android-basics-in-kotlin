package br.com.vudureverso.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Essa atividade permite que o usuário jogue um dado e veja o resultado dessa jogada exibido
 * na tela.
 * */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Joga o dado e atualiza a tela com o resultado
     * */
    private fun rollDice() {
        // Cria um novo objeto Dice, de 6 faces, e joga ele.
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Atualiza a tela com o resultado da jogada
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}