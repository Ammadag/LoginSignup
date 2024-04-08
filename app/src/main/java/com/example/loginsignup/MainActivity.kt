package com.example.loginsignup

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginsignup.activities.SignUpForm
import com.example.loginsignup.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonAnimation = AnimationUtils.loadAnimation(this, R.anim.btn_clk_anim)

        binding.btnLesgo.setOnClickListener {
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.btm_to_top, R.anim.btm_to_top_exit)
            binding.btnLesgo.startAnimation(buttonAnimation)
            Handler().also {
                it.postDelayed({
                    val intent = Intent(this, SignUpForm::class.java)
                    startActivity(intent, options.toBundle())
                }, 600)
            }
        }
        }

    }


