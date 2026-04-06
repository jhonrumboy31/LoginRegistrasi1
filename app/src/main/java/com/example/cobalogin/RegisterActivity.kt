package com.example.cobalogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val tvKeLogin = findViewById<TextView>(R.id.tvKeLogin)

        // Tombol Daftar
        btnDaftar.setOnClickListener {
            val nama = etNama.text.toString()
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua kolom wajib diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registrasi berhasil! Halo $nama", Toast.LENGTH_SHORT).show()
            }
        }

        // Explicit Intent ke LoginActivity
        tvKeLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}