package com.sammy.koin.ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sammy.koin.R
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    /*
    * by viewModel() creates the instance for the ViewModel
    * */
    private val mainViewModel:MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}