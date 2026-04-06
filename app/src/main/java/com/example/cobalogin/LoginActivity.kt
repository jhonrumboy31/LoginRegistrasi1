package com.example.cobalogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnMasuk = findViewById<Button>(R.id.btnMasuk)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val tvKeRegister = findViewById<TextView>(R.id.tvKeRegister)

        // Tombol Login
        btnMasuk.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Email dan password wajib diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login berhasil! Halo $email", Toast.LENGTH_SHORT).show()
            }
        }

        // Explicit Intent ke ForgotPasswordActivity
        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        // Explicit Intent ke RegisterActivity
        tvKeRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}