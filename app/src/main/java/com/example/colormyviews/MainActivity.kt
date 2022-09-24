package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import android.graphics.Color
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
}
private fun setListeners() {
    val clickableViews: List<View> =
        listOf()

    for (item in clickableViews) {
        item.setOnClickListener { makeColored(it) }
    }
}
fun makeColored(view: View) {
    when (view.id) {


        R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
        R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

        // Boxes using Android color resources for background
        R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
        R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
        R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

        else -> view.setBackgroundColor(Color.LTGRAY)
    }
}

