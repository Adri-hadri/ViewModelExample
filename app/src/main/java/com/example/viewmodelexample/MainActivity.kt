package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.secondsLD.observe(this){
            Log.d("MainActivity", "Message $it")
        }
        }
    }
}