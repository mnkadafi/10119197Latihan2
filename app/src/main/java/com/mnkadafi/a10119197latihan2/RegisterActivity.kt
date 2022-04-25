package com.mnkadafi.a10119197latihan2

//<!--25 April 2022-->
//<!--10119197-->
//<!--Mochamad Nurkhayal Kadafi-->
//<!--IF-5-->

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_register)

        val btnMoveToAlmostThereActivity: TextView = findViewById(R.id.btnRegister)
        btnMoveToAlmostThereActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnRegister -> {
                val moveIntent = Intent(this@RegisterActivity, AlmostThereActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}