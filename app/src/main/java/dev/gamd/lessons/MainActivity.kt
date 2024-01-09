package dev.gamd.lessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.gamd.lessons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var counterVM : CounterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        counterVM = ViewModelProvider(this).get(CounterViewModel::class.java)

        counterVM.counter.observe(this) {
            binding.count.text = it.toString()
        }

        binding.incrementButton.setOnClickListener {
            counterVM.incrementCounter()
        }

        binding.decrementButton.setOnClickListener {
            counterVM.decrementCounter()
        }
    }
}