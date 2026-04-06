package com.example.cobalogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btnKirim = findViewById<Button>(R.id.btnKirim)
        val tvKembali = findViewById<TextView>(R.id.tvKembali)

        // Tombol Kirim
        btnKirim.setOnClickListener {
            val email = etEmail.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Email wajib diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Link reset telah dikirim ke $email", Toast.LENGTH_SHORT).show()
            }
        }

        // Explicit Intent kembali ke LoginActivity
        tvKembali.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}