package com.example.tugaskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tes)

            val fragmentManager = supportFragmentManager
            val tugas = tugas()
            val fragment = fragmentManager.findFragmentByTag(tugas::class.java.simpleName)

        if (fragment !is tugas){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, tugas, tugas::class.java.simpleName)
                .commit()
        }
    }
}