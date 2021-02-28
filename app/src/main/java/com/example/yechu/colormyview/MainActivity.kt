package com.example.yechu.colormyview

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

    private fun setListeners() {
        val clickableViews : List<View> =
            listOf(box_one, box_two, box_three, box_four, box_five,layout,red_btn, yellow_btn, green_btn)

        for(item in clickableViews){
            item.setOnClickListener{ makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            // Boxes using Color class colors for bg
            R.id.box_one -> view.setBackgroundColor(Color.BLACK)
            R.id.box_two -> view.setBackgroundColor(Color.BLUE)
            R.id.box_three -> view.setBackgroundColor(Color.CYAN)
            R.id.box_four -> view.setBackgroundColor(Color.GREEN)

            // box using android color resources for bg
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_blue_light)

            // custom colors for bg
            R.id.red_btn -> box_three.setBackgroundColor(Color.RED)
            R.id.yellow_btn -> box_four.setBackgroundColor(Color.YELLOW)
            R.id.green_btn -> box_five.setBackgroundColor(Color.GREEN)

            else -> view.setBackgroundResource(android.R.color.holo_orange_light)
        }

    }
}