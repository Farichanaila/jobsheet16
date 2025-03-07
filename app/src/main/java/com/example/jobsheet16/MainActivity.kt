package com.example.jobsheet16

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnnama)
        val btn1 = findViewById<Button>(R.id.btnisi)

        btn.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Biodata Saya")
                .setMessage("Nama : Faricha Naila Rochmania" + "Nis : 2233254" + "Kelas : XI PPLG 1")
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Yes", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "No", Toast.LENGTH_LONG).show()
                })
                .show()
        }

        btn1.setOnClickListener {
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.activity_main2, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.edit)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Kamu")
                .setView(dialogLayout)
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this, "Nama kamu adalah " + editText.getText().toString(), Toast.LENGTH_LONG)
                            .show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener{ dialogInterface, i ->
                    }) .show()
        }
    }
}