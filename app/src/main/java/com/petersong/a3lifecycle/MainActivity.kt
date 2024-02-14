package com.petersong.a3lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.petersong.a3lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "OnCreate(..)")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.editTextText.text.clear()
            binding.editTextText.text.append("Hello")
            binding.textView.text = "Hello"
        }
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "OnStop(..)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "OnRestart(..)")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","OnResume(..)" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy(..)")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "OnPause(..)")
    }

    override fun onStart(){
        super.onStart()
        Log.d("TAG", "OnStart(..)")
    }

}