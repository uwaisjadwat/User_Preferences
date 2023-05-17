package com.example.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         lateinit var auth: com.google.firebase.auth.FirebaseAuth
        auth = Firebase.auth

        val register = findViewById<Button>(R.id.btnRegister)


        val username = findViewById<EditText>(R.id.edt_username)
        val password = findViewById<EditText>(R.id.edt_password)

        register.setOnClickListener(){

            auth.createUserWithEmailAndPassword(username.toString(), password.toString()).addOnCompleteListener(this) {
                    task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                       Toast.makeText(this@MainActivity, "logged in", Toast.LENGTH_LONG).show()

                        //Intent nextPage = new Intent(this@MainActivity, FirebaseAuth.class);

                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(this@MainActivity, "failed to login", Toast.LENGTH_LONG).show()

                    }
                }


        }




    }
}