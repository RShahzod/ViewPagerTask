package uz.shox.viewpagertask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstBtn = findViewById<Button>(R.id.firstBtn)
        val secondBtn = findViewById<Button>(R.id.secondBtn)

        firstBtn.setOnClickListener {
            startActivity(Intent(this,FirstActivity::class.java))
        }
        secondBtn.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}