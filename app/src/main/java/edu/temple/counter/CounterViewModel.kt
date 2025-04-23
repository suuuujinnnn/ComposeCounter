package edu.temple.counter

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor() : ViewModel() {
    var count by mutableIntStateOf(0)
        private set

    fun increment() = apply { count++ }
    fun decrement() = apply { count-- }
    fun setCount(value: Int) = apply { count = value }
}