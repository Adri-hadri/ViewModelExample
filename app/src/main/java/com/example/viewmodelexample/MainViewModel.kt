package com.example.viewmodelexample

import android.os.CountDownTimer
<<<<<<< HEAD
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
=======
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val timer: CountDownTimer
    private val secondsMLD = MutableLiveData<Long>()
    val secondsLD: LiveData<Long>
        get() = secondsMLD
    val finished = MutableLiveData<Boolean>()

    init {
        timer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                secondsMLD.value = millisUntilFinished / 1000

            }

            override fun onFinish() {
                finished.value = true
            }
        }.start()
>>>>>>> 07dcc52 (Timer - gotovo i radi.)
    }
}