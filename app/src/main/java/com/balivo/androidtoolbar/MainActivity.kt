package com.balivo.androidtoolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set-up toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar) // Replace toolbar as the ActionBar

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

         //This will set the logo before title
        supportActionBar?.setLogo(R.mipmap.ic_launcher)
        supportActionBar?.setDisplayUseLogoEnabled(true)

        supportActionBar?.setDisplayShowTitleEnabled(false)

        /*
        Make sure you are importing the support version of Toolbar
        (i.e android.support.v7.widget.Toolbar) and not the android.widget.Toolbar.
        The Support toolbar has backward compatibility up to API 7 (Android 2.1).

        The method for setting the Toolbar varies according to the import of toolbar, if you import

        android.support.v7.widget.Toolbar – use setSupportActionBar() method (Recommended)
        android.widget.Toolbar – use setActionBar() method. */
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }
}
