package com.android.hackernewslite.play.ui

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.animation.DecelerateInterpolator
import androidx.core.app.NavUtils
import com.android.hackernewslite.play.R
import com.android.hackernewslite.play.ui.fragments.SettingsFragment

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0,  0)

//        setAnimation()
        setContentView(R.layout.activity_settings)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings_container, SettingsFragment())
            .commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this)
            overridePendingTransition(0, R.anim.slide_out_left)
        }


        return super.onOptionsItemSelected(item)
    }
}