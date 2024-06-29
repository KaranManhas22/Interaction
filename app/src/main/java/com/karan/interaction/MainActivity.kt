package com.karan.interaction

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.karan.interaction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var interface2:Interface2?=null
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
      binding.btnclick.setOnClickListener {
          interface2?.colourChange()
      }
        binding.btngreen.setOnClickListener {
            interface2?.colourChange2()
        }
        binding.btnblue.setOnClickListener {
            interface2?.colourChange3()
        }

    }
    fun changevalue(data:String)
    {
        binding.ettextMain.setText(data)

    }
    fun changeCounter(data: String)
    {
        binding.counteret.setText(data)
    }

}