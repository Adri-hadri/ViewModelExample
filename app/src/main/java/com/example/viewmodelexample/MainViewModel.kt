package com.example.viewmodelexample

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData

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
            }
        }