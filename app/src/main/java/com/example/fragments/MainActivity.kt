package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()


        supportFragmentManager.beginTransaction().apply {

            replace(R.id.flFragment, firstFragment)
            commit()

        }


        val btnFragmnent1 = findViewById<Button>(R.id.btnFragment1)
        btnFragmnent1.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()

            }


            val btnFragmnent2 = findViewById<Button>(R.id.btnFragment2)
            btnFragmnent2.setOnClickListener {

                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, secondFragment)
                    addToBackStack(null)
                    commit()
                }


            }

        }
    }

}