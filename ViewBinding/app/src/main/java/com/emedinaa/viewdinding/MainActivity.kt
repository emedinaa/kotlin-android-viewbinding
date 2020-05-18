package com.emedinaa.viewdinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.emedinaa.viewdinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.layout.cardViewCough.setOnClickListener {
            showMessage("Symptom item - Cough")
        }

        binding.layout.cardViewFever.setOnClickListener {
            showMessage("Symptom item - Fever")
        }

        binding.layout.cardViewHeadache.setOnClickListener {
            showMessage("Symptom item - Headache")
        }

        fetchPreventions()
    }

    private fun fetchPreventions(){
        recyclerView.adapter = PreventionAdapter(Data.getPreventions())
    }

    private fun showMessage(message:String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
