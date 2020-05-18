package com.emedinaa.viewdinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_symptoms.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardViewCough.setOnClickListener {
            showMessage("Symptom item - Cough")
        }

        cardViewFever.setOnClickListener {
            showMessage("Symptom item - Fever")
        }

        cardViewHeadache.setOnClickListener {
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
