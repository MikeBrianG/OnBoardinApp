package com.example.myapplication.view.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityFirstScreenBinding
import com.example.myapplication.view.login.LoginScreenActivity

class FirstScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding.run {
            nextButtonFirstScreen.setOnClickListener {
                setScreenNavigation(SecondScreenActivity())
            }

            skipButtonFirstScreen.setOnClickListener {
                setScreenNavigation(LoginScreenActivity())
            }
        }
    }

    private fun setScreenNavigation(screenActivity: AppCompatActivity) {
        val intent = Intent(this, screenActivity::class.java)

        startActivity(intent)
    }
}





