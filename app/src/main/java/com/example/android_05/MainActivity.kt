package com.example.android_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.android_05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val firstfragmint = FirstFragment()
        val secenttfragmint = SecFragment()
        val profileFragment = ProfileFragment()
        setUpFragmint(firstfragmint)

        binding.bottomAppBar.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> setUpFragmint(firstfragmint)
                R.id.fav -> setUpFragmint(secenttfragmint)
                R.id.profile -> setUpFragmint(profileFragment)
            }
            true
            }



    }
    private fun setUpFragmint(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.freamelaiout,fragment).commit()
        }



    }
}