package com.mnkadafi.a10119197latihan2

//<!--25 April 2022-->
//<!--10119197-->
//<!--Mochamad Nurkhayal Kadafi-->
//<!--IF-5-->

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)

        val btnMoveToRegisterActivity: TextView = findViewById(R.id.tvRegister)
        btnMoveToRegisterActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.tvRegister -> {
                val moveIntent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}