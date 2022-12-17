package me.k4nade.simplecalcapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //１）id取得
        val prompt1: EditText = findViewById(R.id.prompt1)
        val prompt2: EditText = findViewById(R.id.prompt2)
        val ansBtn: Button = findViewById(R.id.ansBtn)
        val ansView: TextView = findViewById(R.id.ansView)
        val clearBtn: Button = findViewById(R.id.clearBtn)
        //２）クリック処理（足し算）
        ansBtn.setOnClickListener {
            //４）条件分岐
            if (prompt1.text.toString() == ("") || prompt2.text.toString() == ("")) {
                //エラー処理
                AlertDialog.Builder(this)
                    .setTitle(R.string.errorTitle)
                    .setMessage(R.string.errorMessage)
                    .setPositiveButton(R.string.errorBtnText, null)
                    .show()
            } else {
                //Edit(編集型) ⇒ String(文字)型 ⇒　int型
                val sum = prompt1.text.toString().toInt() + prompt2.text.toString().toInt()
                ansView.text = "$sum"
            }
        }
        //３）クリア処理
        clearBtn.setOnClickListener {
            prompt1.text.clear()
            prompt2.text.clear()
            ansView.text = getString(R.string.ans)
        }
    }
}