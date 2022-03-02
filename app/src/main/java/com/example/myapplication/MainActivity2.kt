package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent()
            intent.putExtra("key1", findViewById<EditText>(R.id.etInputResult).text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }

}