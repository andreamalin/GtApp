package com.example.gt.Models

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gt.Activities.MainActivity
import com.example.gt.R

import kotlinx.android.synthetic.main.activity_touristic_places.*

class TouristicPlaces : AppCompatActivity() {
    private var placetoshow: String? = "Hola"
    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_touristic_places)
        //Binding
        //binding = DataBindingUtil.setContentView(this, R.layout.activity_touristic_places)
        //Keyboard
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        //Changes info
        showActualInfo()
    }

    private fun showActualInfo() {
        //Get button clicked
        placetoshow = intent.getStringExtra("ActualInfo")

        //Changes title, subtitle and text
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
        val newComment = comment.text //Gets comment
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) //closing recent activity

        //Shows comment on a toast
        Toast.makeText(this@TouristicPlaces, newComment, Toast.LENGTH_SHORT).show()

        finish() //finishing this activity
        startActivity(intent)   //Starting next activity
    }
}
