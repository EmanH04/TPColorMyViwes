package com.example.tpcolormyviwes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        val clickableView: List<View> = listOf(box_one_text, box_two_text,
                box_trois,box_quatre,box_cinq,constraint_layout, red_button, yellow_button,green_button)

        for (item in clickableView){
            item.setOnClickListener{makeColored(it)}
        }

    }
    private
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_trois -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_quatre -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_cinq -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_trois.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_quatre.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_cinq.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}