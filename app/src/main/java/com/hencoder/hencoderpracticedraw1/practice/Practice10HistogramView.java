package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {


    private static final int OFFSET_RECT = 20;
    private static final int RECT_WIDTH = 100;
    private static final String NAME = "直方图";

    private String[] nameList = new String[]{"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};

    private Paint mPaint = new Paint();
    private Path mPath = new Path(); // 初始化 Path 对象
    private Random random = new Random();


    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }



    private void init() {


    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        int pointX = (int)(getWidth() * 0.11f);
        int pointY = (int)(getHeight() * 0.7f);

        mPaint.setAntiAlias(true);

        mPath.moveTo(pointX,20);
        mPath.lineTo(pointX, pointY);
        mPath.rLineTo((int)(getWidth() * 0.8f), 0);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(3);
        canvas.drawPath(mPath, mPaint);

        mPaint.setTextSize(42);
        canvas.drawText(NAME, getWidth() / 2 - 50, getHeight() - (int)(getHeight() * 0.15f), mPaint);

        mPaint.setTextSize(30);
        for (int i = 0; i < nameList.length; i++) {
            int x = pointX + ((i+1) * OFFSET_RECT) + i * RECT_WIDTH;
            if (i == 0) {
                x = pointX + OFFSET_RECT;
            }

            canvas.drawText(nameList[i], x, pointY + 30, mPaint);
        }

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.GREEN);
        for (int i = 0; i < nameList.length; i++) {
            int x = pointX + ((i+1) * OFFSET_RECT) + i * RECT_WIDTH;
            if (i == 0) {
                x = pointX + OFFSET_RECT;
            }

            int height = random.nextInt(300);

            canvas.drawRect(x,(pointY - height), x + RECT_WIDTH, pointY, mPaint);
        }
    }
}
