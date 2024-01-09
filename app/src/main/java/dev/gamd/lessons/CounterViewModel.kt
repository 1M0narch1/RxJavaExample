package dev.gamd.lessons

import android.database.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.subjects.PublishSubject

class CounterViewModel : ViewModel() {
    private var _counter = MutableLiveData<Int>()
    val counter :LiveData<Int> = _counter

    init {
        _counter.value=0
    }

    fun incrementCounter() {
        _counter.value = (_counter.value ?: 0) +1
    }

    fun decrementCounter() {
        _counter.value = (_counter.value ?: 0) -1
    }

    fun getCounterValue() : Int{
        return (_counter.value ?: 0)
    }
}