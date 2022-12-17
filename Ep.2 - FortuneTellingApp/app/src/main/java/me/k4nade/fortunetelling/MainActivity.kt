package me.k4nade.fortunetelling

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //１）idを取得
        val resultView: TextView = findViewById(R.id.resultText)
        val btn: Button = findViewById(R.id.mainActivityBtn)

        //２）クリック処理
        btn.setOnClickListener {
            // 3) resからArrayを呼び出し
            val results = resources.getStringArray(R.array.results)
            // 4) Arrayの中からランダムで1つ取り出す処理
            val result = Random().nextInt(results.count())
            // 5) 3のArrayに4を実行し出力
            resultView.text = results[result]
        }
    }
}