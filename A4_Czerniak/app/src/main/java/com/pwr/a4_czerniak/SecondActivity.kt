package com.pwr.a4_czerniak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        textHello.text = message
        val intent = Intent(this, MainActivity::class.java).apply { putExtra(EXTRA_MESSAGE,"Jakub Czerniak 5.0") }
        if(message.equals("254013"))
            setResult(RESULT_OK,intent)
        else
            setResult(RESULT_CANCELED)
    }
    fun goBack(view: View)
    {
        finish()
    }

}