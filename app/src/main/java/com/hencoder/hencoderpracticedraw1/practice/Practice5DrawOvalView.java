package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawOval() 方法画椭圆

        RectF rectF = new RectF();
        rectF.left = 350f;
        rectF.top = 200f;
        rectF.right = 800f;
        rectF.bottom = 400f;

        RectF rectF2 = new RectF();
        rectF2.left = 0;
        rectF2.top = 100f;
        rectF2.right = 200f;
        rectF2.bottom = 300f;

        canvas.drawOval(rectF,mPaint);

        canvas.drawOval(rectF2,mPaint);


    }
}
