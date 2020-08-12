package com.android.hackernewslite.play.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.app.NavUtils
import com.android.hackernewslite.play.R

class LicenseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0,0)
        setContentView(R.layout.activity_license)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this)
        }

        return super.onOptionsItemSelected(item)
    }
}