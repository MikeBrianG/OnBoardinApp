package com.example.myapplication.view.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySecondScreenBinding
import com.example.myapplication.view.login.LoginScreenActivity

class SecondScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setClickListeners()
    }

    private fun setClickListeners() {

        binding.run {
            nextButtonSecondScreen.setOnClickListener {
                setScreenNavigation(ThirdScreenActivity())
            }
            skipButtonSecondScreen.setOnClickListener {
                setScreenNavigation(LoginScreenActivity())
            }
        }
    }

    fun setScreenNavigation(screenActivity: AppCompatActivity) {
        val intent = Intent(this, screenActivity::class.java)

        startActivity(intent)
    }
}