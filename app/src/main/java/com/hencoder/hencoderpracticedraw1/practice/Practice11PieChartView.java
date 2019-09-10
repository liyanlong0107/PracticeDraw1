package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private Paint mPaint = new Paint();
    RectF rectFFirst = new RectF();
    RectF rectFSecond = new RectF();

    private void init() {
        rectFFirst.left = 200;
        rectFFirst.top = 200f;
        rectFFirst.right = 500f;
        rectFFirst.bottom = 500f;


        rectFSecond.left = 210;
        rectFSecond.top = 210f;
        rectFSecond.right = 510f;
        rectFSecond.bottom = 510f;

    }






    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setTextSize(30);
        canvas.drawText("Lollipop", 100, 100, mPaint);
//        canvas.drawLine(100, 100, mPaint);



        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.RED);
        canvas.drawArc(rectFFirst,180, 120, true, mPaint);


        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectFSecond,80, 100, true, mPaint);


        mPaint.setColor(Color.GREEN);
        canvas.drawArc(rectFSecond,40, 38, true, mPaint);

        mPaint.setColor(Color.GRAY);
        canvas.drawArc(rectFSecond,20, 18, true, mPaint);

        mPaint.setColor(Color.WHITE);
        canvas.drawArc(rectFSecond,0, 18, true, mPaint);


        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(rectFSecond,-60, 60, true, mPaint);


















    }
}
