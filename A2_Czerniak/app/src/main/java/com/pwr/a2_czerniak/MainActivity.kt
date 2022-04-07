package com.pwr.a2_czerniak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ratingBar.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
                Toast.makeText(this@MainActivity, "Ocena usługi to: $p1", Toast.LENGTH_SHORT).show()
                if(editCost.text.isNotEmpty())
                {
                    val cost=editCost.text.toString().toFloat()
                   // val tip=editTip.text.toString().toFloat()
                    val tipValue=cost*p1*2.5f/100

                    textView.text=tipValue.toString()
                }
                else
                {
                    textView.text=getString(R.string.no_value_string)
                }
            }
        })//liczenie napiwku z oceny po zmianie
    }

    fun calculateTip(view: View)//liczenie napiwku z wpisanej wartości w pole tekstowe
    {
        if(editCost.text.isNotEmpty() && editTip.text.isNotEmpty())
        {
            val cost=editCost.text.toString().toFloat()
            val tip=editTip.text.toString().toFloat()
            val tipValue=cost*tip/100

            textView.text=tipValue.toString()
        }
        else if(editCost.text.isNotEmpty() && ratingBar.getRating()!=0f) //dodana funkcjonalność
        {
            val cost=editCost.text.toString().toFloat()
            val tipValue=ratingBar.getRating()*cost*2.5f/100
            textView.text=tipValue.toString()
        }
        else
        {
            textView.text=getString(R.string.no_value_string)
        }
    }

}