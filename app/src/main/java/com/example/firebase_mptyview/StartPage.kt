package com.example.firebase_mptyview

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Handler(Looper.getMainLooper()).postDelayed({
            val j = Intent(this@StartPage,MainActivity::class.java)
            startActivity(j)

            finish()

        },2000)
    }
}