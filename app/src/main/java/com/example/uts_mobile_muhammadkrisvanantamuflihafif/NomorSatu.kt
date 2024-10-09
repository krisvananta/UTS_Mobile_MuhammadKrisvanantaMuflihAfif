package com.example.uts_mobile_muhammadkrisvanantamuflihafif

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_mobile_muhammadkrisvanantamuflihafif.databinding.SatuNomorBinding

class NomorSatu : AppCompatActivity() {
    private val binding by lazy { SatuNomorBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val name = intent.getStringExtra("name")

        with(binding){
            profileName.text = name
        }

        with(binding){
            logoutButton.setOnClickListener{
                val intentToNomorTiga = Intent(this@NomorSatu, NomorTiga::class.java)
                startActivity(intentToNomorTiga)
            }
        }

    }
}