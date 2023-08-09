package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val key :String="keys ->"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(key, "onCreate: ")


    }

    override fun onStart()
    {
      super.onStart()
        Log.d("key"," onStart: ")



    }

    override fun onResume()
    {
        super.onResume()

        Log.d(key," onResume: ")



    }


    override fun onPause()
    {
        super.onPause()

        Log.d(key," onPause: ")



    }
    override fun onStop()
    {
        super.onStop()

        Log.d(key," onStop: ")

    }



}
