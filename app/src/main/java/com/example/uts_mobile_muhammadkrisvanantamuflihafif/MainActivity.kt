package com.example.uts_mobile_muhammadkrisvanantamuflihafif

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_mobile_muhammadkrisvanantamuflihafif.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(binding){
            submitButton.setOnClickListener{
                val name = nameField.text.toString()
                
                if (name.isNotEmpty()){
                    val intentToNomorSatu = Intent(this@MainActivity, NomorSatu::class.java)
                    intentToNomorSatu.putExtra("name", name)
                    startActivity(intentToNomorSatu)
                } else {
                    Toast.makeText(this@MainActivity, "Please Fill Your Name First", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}