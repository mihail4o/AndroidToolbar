package com.balivo.androidtoolbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        // This method will enable back button
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // This will set the logo before title
//        supportActionBar?.setLogo(R.mipmap.ic_launcher)
//        supportActionBar?.setDisplayUseLogoEnabled(true)
//
//        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}