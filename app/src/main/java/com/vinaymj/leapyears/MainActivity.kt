package com.vinaymj.leapyears

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.vinaymj.leapyears.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        with(binding) {
            button.setOnClickListener {
                val year = yrEditText.text.toString()
                val message = getString(
                    if(viewModel.isLeapYear(year.toInt()))
                        R.string.leap_year
                    else R.string.not_leap_year
                )
                resultText.text = "$year $message"
                yrEditText.selectAll()
            }
        }
    }
}