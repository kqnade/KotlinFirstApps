package me.k4nade.clickbuttonapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1) id取得
        val outputTv: TextView = findViewById(R.id.output)
        val btn1: Button = findViewById(R.id.mainButton1)
        val btn2: Button = findViewById(R.id.mainButton2)
        val btnReset: Button = findViewById(R.id.mainButtonReset)

        // 2) クリック処理
        btn1.setOnClickListener { outputTv.text = getString(R.string.output1) }
        btn2.setOnClickListener { outputTv.text = getString(R.string.output2) }
        btnReset.setOnClickListener { outputTv.text = getString(R.string.noOutput) }
    }
}