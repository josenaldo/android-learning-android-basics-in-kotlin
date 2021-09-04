package br.com.vudureverso.diceroller

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
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

        rollButton.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.dice_rolling);
            animation.setAnimationListener (object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {}

                override fun onAnimationEnd(p0: Animation?) {
                    rollDice()
                }

                override fun onAnimationRepeat(p0: Animation?) {}
            })
            val diceImage: ImageView = findViewById(R.id.imageView)
            diceImage.startAnimation(animation)

        }

        // rolar um dado no início do programa
        rollDice()
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

        val drawableResource = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()

    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}