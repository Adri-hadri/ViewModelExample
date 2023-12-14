package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.secondsLD.observe(this) {
            Log.d("MainActivity", "Message $it")
            binding.tvRwsult.text = it.toString()
        }

        mainViewModel.finished.observe(this) {
            Toast.makeText(this, "Finished!", Toast.LENGTH_SHORT).show()
        }

    }
}