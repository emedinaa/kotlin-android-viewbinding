package com.emedinaa.viewdinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.emedinaa.viewdinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.layout.cardViewCough.setOnClickListener {
            showMessage("Symptom item")
        }
    }

    private fun showMessage(message:String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
