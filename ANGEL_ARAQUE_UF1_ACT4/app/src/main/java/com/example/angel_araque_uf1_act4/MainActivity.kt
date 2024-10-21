package com.example.angel_araque_uf1_act4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLog:Button = findViewById(R.id.botLog)
        val buttonToast:Button = findViewById(R.id.botToast)
        buttonLog.setOnClickListener{
            Log.d("mensaje","Pulsaste el boton Log")
        }
        buttonToast.setOnClickListener{
            Toast.makeText(this,"Has pulsado el boton Toast",Toast.LENGTH_SHORT).show()
        }
    }
}