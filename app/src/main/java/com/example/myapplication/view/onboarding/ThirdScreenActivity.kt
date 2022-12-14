package com.example.myapplication.view.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityThirdScreenBinding
import com.example.myapplication.view.login.LoginScreenActivity

class ThirdScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding.loginInButton.setOnClickListener {
            setScreenNavigation(LoginScreenActivity())
        }
    }

    private fun setScreenNavigation(screenActivity: AppCompatActivity) {
        val intent = Intent(this, screenActivity::class.java)

        startActivity(intent)
    }
}