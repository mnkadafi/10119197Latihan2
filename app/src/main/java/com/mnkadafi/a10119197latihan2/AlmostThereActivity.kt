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

class AlmostThereActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_almost_there)

        val btnMoveToVerifityAccountActivity: TextView = findViewById(R.id.btnVerify)
        btnMoveToVerifityAccountActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnVerify -> {
                val moveIntent = Intent(this@AlmostThereActivity, VerifyAccountActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}