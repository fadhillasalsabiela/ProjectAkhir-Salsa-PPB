package com.example.info_perndakian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val cardView = findViewById<androidx.cardview.widget.CardView>(R.id.sumatera)

        cardView.setOnClickListener {
            val intent = Intent(this, SumateraActivity::class.java)
            startActivity(intent)
        }
        val cardView1 = findViewById<androidx.cardview.widget.CardView>(R.id.luarsumatera)

        cardView1.setOnClickListener {
            val intent = Intent(this, LuarSumateraActivity::class.java)
            startActivity(intent)
        }

    }

}