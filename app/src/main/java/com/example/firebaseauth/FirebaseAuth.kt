package com.example.firebaseauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

class FirebaseAuth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firebase_auth)

        val saveButton = findViewById<Button>(R.id.saveBtn)

        saveButton.setOnClickListener(){
            val darkmode = findViewById<Switch>(R.id.switch_darkmode)
            val timezone = findViewById<EditText>(R.id.edt_timezone)
            val nationality = findViewById<EditText>(R.id.edt_nationality)
            val language = findViewById<EditText>(R.id.edt_language)

            val darkmodeSwitch = darkmode.isChecked;


        }




    }
}