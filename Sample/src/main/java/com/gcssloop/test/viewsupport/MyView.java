package com.gcssloop.test.viewsupport;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import com.gcssloop.view.CustomView;

public class MyView extends CustomView {
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

//        public MyView(Context context) {
//            super(context);
//            mDeafultPaint.setColor(Color.GRAY);             // 获得一个默认的画笔
//            mDeafultPaint.setTextSize(42);
//            mDeafultPaint.setTextAlign(Paint.Align.CENTER);
//        }

    @Override
    public void initView() {
        mDeafultPaint.setColor(Color.GRAY);             // 获得一个默认的画笔
        mDeafultPaint.setTextSize(42);
        mDeafultPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
        protected void onDraw(Canvas canvas) {
            canvas.translate(mViewWidth/2,mViewHeight/2);   // 获得视图宽高

            canvas.drawCircle(0, -100, 100, mDeafultPaint);
            canvas.drawText("用默认画笔绘制一个圆", 0, 60, mDeafultPaint);
        }
    }