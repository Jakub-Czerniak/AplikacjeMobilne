package com.pwr.a3_czerniak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalTime




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClock.setOnClickListener()
        {
            resultView.text= LocalTime.now().toString()
        }
        buttonAlarm.setOnClickListener()
        {
            resultView.text="7:30"
        }
        buttonTimer.setOnClickListener()
        {
            resultView.text="00:15:35"
        }
        buttonStoper.setOnClickListener()
        {
            resultView.text="00:10:45:23"
        }


        var result:Int = 0
        var numberAmount=0
        button1.setOnClickListener(){
            result *= 10
            result += 1
            numberAmount+=1
            /*if (numberAmount % 2 == 0)
            {
                resultView.te
            }*/
            resultView.text = result.toString()
        }
        button2.setOnClickListener(){
            result *= 10
            result += 2
            numberAmount+=1
            resultView.text = result.toString()
        }
        button3.setOnClickListener(){
            result *= 10
            result += 3
            numberAmount+=1
            resultView.text = result.toString()
        }
        button4.setOnClickListener(){
            result *= 10
            result += 4
            numberAmount+=1
            resultView.text = result.toString()
        }
        button5.setOnClickListener(){
            result *= 10
            result += 5
            numberAmount+=1
            resultView.text = result.toString()
        }
        button6.setOnClickListener(){
            result *= 10
            result += 6
            numberAmount+=1
            resultView.text = result.toString()
        }
        button7.setOnClickListener(){
            result *= 10
            result += 7
            numberAmount+=1
            resultView.text = result.toString()
        }
        button8.setOnClickListener(){
            result *= 10
            result += 8
            numberAmount+=1
            resultView.text = result.toString()
        }
        button9.setOnClickListener(){
            result *= 10
            result += 9
            numberAmount+=1
            resultView.text = result.toString()
        }
        button0.setOnClickListener(){
            result *= 10
            numberAmount+=1
            resultView.text = result.toString()
        }




    }




}