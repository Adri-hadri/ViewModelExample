package com.example.viewmodelexample

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private val timer: CountDownTimer
    private val secondsMLD = MutableLiveData<Long>()
    val secondsLD = LiveData<Long>()
        get()=secondsLD
    val finished = MutableLiveData<Boolean>()

    init {
        timer = object : CountDownTimer(10000, 1000){
            override fun onTick(millisUntilFinished: Long) {
                TODO("Not yet implemented")
            }
        }
    }
}