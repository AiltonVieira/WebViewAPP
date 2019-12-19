package br.com.estacaohackgp1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*

/**
 *
 * Author: Ailton da Silva Vieira
 * Colaboradores: Jeferson Lovatelli, Fernanda Palmiéri, Gustavo.
 * Webpage: https://github.com/AiltonVieira/WebViewAPP
 *
 * **/

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Audio Intro
        var mediaPlayer = MediaPlayer.create(this, R.raw.gameover)
        mediaPlayer?.start()

        // Animação do logo (efeito fade-in)
        imvLogo.animate().alpha(1f).duration = 3000

        //Delay antes de abrir a próxima activity
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))

            //Encerra a activity atual
            finish()
        },3500)
    }
}
