package com.example.loginsignup.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginsignup.R
import com.example.loginsignup.databinding.SignUpFormBinding

class SignUpForm : AppCompatActivity() {
    private lateinit var binding : SignUpFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignUpFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SignInTxt.setOnClickListener{
            Intent(this, LoginForm::class.java).apply { startActivity(this) }
        }
    }
}