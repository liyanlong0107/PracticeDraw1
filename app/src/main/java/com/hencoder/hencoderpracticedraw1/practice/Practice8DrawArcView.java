package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        RectF rectF = new RectF();
        rectF.left = 350f;
        rectF.top = 200f;
        rectF.right = 800f;
        rectF.bottom = 400f;

        mPaint.setStyle(Paint.Style.FILL);

        canvas.drawArc(rectF,-110,100, true, mPaint); // 绘制扇形
        canvas.drawArc(rectF,20,140, false, mPaint);  // 绘制弧形

        mPaint.setStyle(Paint.Style.STROKE);

        canvas.drawArc(rectF,180,60, false, mPaint);  // 绘制弧形
        
    }
}
