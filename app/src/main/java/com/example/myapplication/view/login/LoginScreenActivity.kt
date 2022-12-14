package com.example.myapplication.view.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLoginScreenBinding
import com.example.myapplication.view.onboarding.ThirdScreenActivity

class LoginScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.run {
            loginButton.setOnClickListener {
                if (usernameEditText.text.isNullOrBlank() or passwordEditText.text.isNullOrBlank()) { Toast.makeText(this@LoginScreenActivity, "Por favor, preencha as informações necessários.", Toast.LENGTH_SHORT
                    ).show()

                } else {
                    Toast.makeText(this@LoginScreenActivity, "Usuário ${usernameEditText.text} logado com sucesso!", Toast.LENGTH_SHORT).show()
                }

            }
            backButtonLoginScreen.setOnClickListener {
                val intent = Intent(this@LoginScreenActivity, ThirdScreenActivity::class.java)

                startActivity(intent)
            }
        }
    }
}