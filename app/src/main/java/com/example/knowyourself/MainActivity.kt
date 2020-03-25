package com.example.knowyourself

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alertDialog: AlertDialog? = applicationContext?.let {
            val builder = AlertDialog.Builder(this)

            builder.apply {
                setTitle("How are you feeling?")
                setMessage("Is it good?")
                setPositiveButton("YES"
                ) { dialog, id ->
                    Toast.makeText(applicationContext, "Move to next page", Toast.LENGTH_LONG).show()
                }
                setNegativeButton("NO"
                ) { dialog, id ->
                    Toast.makeText(applicationContext, "cancel", Toast.LENGTH_LONG).show()
                }
            }

            // Create the AlertDialog
            builder.create()
        }

        // Show the dialog
        alertDialog?.show()
    }

}
