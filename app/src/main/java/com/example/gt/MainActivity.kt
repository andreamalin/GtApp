package com.example.gt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.example.gt.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var changeEditText:Boolean?=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)


    }

    fun changeEditText(view: View) {
        if (changeEditText == true){
            val newName = name_value.text
            binding.GuatemalaName.text = newName
            binding.nombre.setVisibility(View.GONE)
            name_value.setVisibility(View.GONE)

            changeEditText = false
        } else {
            binding.GuatemalaName.text = "Guatemala"
            binding.nombre.setVisibility(View.VISIBLE)
            name_value.setVisibility(View.VISIBLE)

            changeEditText = true
        }
    }

    fun xocomilInfo(view: View) {
        val intent = Intent(this, TouristicPlaces::class.java)
        intent.putExtra("ActualInfo", "Xocomil") //Sending what info actually show
        startActivity(intent)   //Starting next activity
    }
    fun secumChampeyInfo(view: View) {
        val intent = Intent(this, TouristicPlaces::class.java)
        intent.putExtra("ActualInfo", "Semuc Champey") //Sending what info actually show
        startActivity(intent)   //Starting next activity
    }
    fun rioDulceInfo(view: View) {
        val intent = Intent(this, TouristicPlaces::class.java)
        intent.putExtra("ActualInfo", "Rio Dulce") //Sending what info actually show
        startActivity(intent)   //Starting next activity
    }
}
