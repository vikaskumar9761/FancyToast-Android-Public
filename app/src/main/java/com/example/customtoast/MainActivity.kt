package com.example.customtoast

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shashank.sony.fancytoastlib.FancyToast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1=findViewById<Button>(R.id.button)
        val btn2=findViewById<Button>(R.id.button2)
        val btn3=findViewById<Button>(R.id.button3)
        val btn4=findViewById<Button>(R.id.button4)
        val btn5=findViewById<Button>(R.id.button5)
        val btn6=findViewById<Button>(R.id.button6)


        btn1.setOnClickListener {
            FancyToast.makeText(this,"Default",FancyToast.LENGTH_LONG,FancyToast.DEFAULT,true).show()
        }

        btn2.setOnClickListener {
            FancyToast.makeText(this,"Success",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
        }

        btn3.setOnClickListener {
            FancyToast.makeText(this,"Information",FancyToast.LENGTH_LONG,FancyToast.INFO,true).show();
        }

        btn4.setOnClickListener {
            FancyToast.makeText(this,"Warning",FancyToast.LENGTH_LONG,FancyToast.WARNING,true).show();
        }

        btn5.setOnClickListener {
            FancyToast.makeText(this,"Error",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
        }
        btn6.setOnClickListener {
            FancyToast.makeText(this,"Confusing",FancyToast.LENGTH_LONG,FancyToast.CONFUSING,true).show();
        }
    }
}