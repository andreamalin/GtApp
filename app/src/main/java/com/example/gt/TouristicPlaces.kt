package com.example.gt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_touristic_places.*

class TouristicPlaces : AppCompatActivity() {
    private var placetoshow: String? = "Hola"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_touristic_places)
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)

        showActualInfo()
    }

    private fun showActualInfo() {
        placetoshow = intent.getStringExtra("ActualInfo")

        if (placetoshow == "Xocomil") {
            touristicName.text = getString(R.string.xocomil_title)
            gttouristicinfo.text = getString(R.string.xocomil_info)
            touristicPhrase.text = getString(R.string.xocomil_phrase)
        } else if (placetoshow == "Semuc Champey") {
            touristicName.text = getString(R.string.semuc_title)
            gttouristicinfo.text = getString(R.string.semuc_champey_info)
            touristicPhrase.text = getString(R.string.secum_champey_phrase)
        } else {
            touristicName.text = getString(R.string.rio_title)
            gttouristicinfo.text = getString(R.string.rio_dulce_info)
            touristicPhrase.text = getString(R.string.rio_phrase)
        }
    }


    fun comment(view: View) {
        val newComment = comment.text
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) //closing recent activity

        Toast.makeText(this@TouristicPlaces, newComment, Toast.LENGTH_SHORT).show()

        finish() //finishing this activity
        startActivity(intent)   //Starting next activity
    }
}
