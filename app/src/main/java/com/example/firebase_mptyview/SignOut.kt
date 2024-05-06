package com.example.firebase_mptyview

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firebase_mptyview.databinding.ActivitySignOutBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class SignOut : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySignOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignOutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

       // binding.signOut.setOnClickListener {
            auth.signOut()
            val jay = Intent(this, MainActivity2::class.java)
            startActivity(jay)
            finish()
        }
    }
//}