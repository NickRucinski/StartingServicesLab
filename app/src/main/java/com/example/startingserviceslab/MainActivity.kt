package com.example.startingserviceslab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

/*
Create an application that contains one Activity and one Service. The service will be Started, not Bound.
On the Activity's layout, add an EditText and a Button
In the service class, implement countdown timer logic using Coroutines that is able to count down from a user provided value.
The user should enter an integer value in the activity's EditText. When the user then clicks the button, the service should be Started with startService(Intent)
The service should be given the value that was entered by the user in the EditText and once received a countdown should being (you can print this to the Log since we don't have a Binder or Handler)
Investigate and implement this capability. Remember that Intents are messaging objects.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editTextText)
        findViewById<Button>(R.id.button).setOnClickListener{
            startService()
        }
    }
}

