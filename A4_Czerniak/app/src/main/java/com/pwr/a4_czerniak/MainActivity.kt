package com.pwr.a4_czerniak

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

const val EXTRA_MESSAGE = "com.example.A4_Czerniak.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openSite(view: View)
    {
        val intent = Intent(Intent.ACTION_VIEW).apply { data= Uri.parse( "https://pwr.edu.pl/" )}
        startActivity(intent)
    }

    fun openDisplaySettings(view: View)
    {
        val intent = Intent(Settings.ACTION_DISPLAY_SETTINGS)
        startActivity(intent)
    }

    fun takePhoto(view: View) //needs camera permission
    {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent,1)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK)
            imageView.setImageBitmap(data?.extras?.get("data") as Bitmap)
        if(requestCode == 2 && resultCode == Activity.RESULT_OK)
            nameText.text=data?.extras?.get(EXTRA_MESSAGE) as String
    }

    fun openSecondActivity(view:View)
    {
        val message= messageBox.text.toString()
        val intent = Intent(this, SecondActivity::class.java).apply { putExtra(EXTRA_MESSAGE,message) }
        startActivityForResult(intent,2)
    }

    }