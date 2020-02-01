package com.example.gt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_touristic_places.*

class TouristicPlaces : AppCompatActivity() {
    private var placetoshow: String? = "Hola"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_touristic_places)

        showActualInfo()
    }
    private fun showActualInfo(){
        placetoshow = intent.getStringExtra("ActualInfo")

        if (placetoshow == "Xocomil") {
            gttouristicname.text = getString(R.string.xocomil_title)
            gttouristicinfo.text = getString(R.string.xocomil_info)
        } else if (placetoshow == "Semuc Champey") {
            gttouristicname.text = getString(R.string.semuc_title)
            gttouristicinfo.text = getString(R.string.semuc_champey_info)
        } else {
            gttouristicname.text = getString(R.string.rio_title)
            gttouristicinfo.text = getString(R.string.rio_dulce_info)
        }
    }
}
