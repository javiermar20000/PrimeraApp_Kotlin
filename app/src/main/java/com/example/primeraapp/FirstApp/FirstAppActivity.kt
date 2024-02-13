package com.example.primeraapp.FirstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.primeraapp.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnPulsame = findViewById<AppCompatButton>(R.id.btnPulsame)
        val etName = findViewById<AppCompatEditText>(R.id.etName)


        /**
         * Primera forma:
         *
         * btnPulsame.setOnClickListener {
         *             Log.i("Javier", "Boton Pulsado ${etName.text.toString()}")
         *         }
         */

        btnPulsame.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                //Log.i("Javier", "Boton Pulsado $name")
                if (name.isNotEmpty()) {
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra("EXTRA_NAME", name)
                    startActivity(intent)
                }
            }
        }



        //Al arrancar la pantalla
    }
}