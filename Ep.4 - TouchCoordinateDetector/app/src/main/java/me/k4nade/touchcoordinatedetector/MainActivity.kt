package me.k4nade.touchcoordinatedetector

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //２）新しいクラスを表示させる
        val ballView = BallView(this)
        setContentView(ballView)
    }

    //１）Viewを継承したクラス
    class BallView(context: Context?) : View(context) {
        private var paint:Paint = Paint()
        private var circleX : Float = 200F
        private var circleY : Float = 200F

        //３）onDrawで描画の準備
        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)

            canvas?.drawColor(Color.RED) //カンバス（背景）色

            //４）ペイントする色の指定と、丸い図形
            paint.color = Color.YELLOW
            canvas?.drawCircle(circleX,circleY ,50F,paint)
        }

        //５）画面タッチ
        @SuppressLint("ClickableViewAccessibility")
        override fun onTouchEvent(event: MotionEvent?): Boolean {

            //タッチポジション
            circleX = event!!.x
            circleY = event.y
            invalidate()

            //return super.onTouchEvent(event)
            return true
        }

    }
}