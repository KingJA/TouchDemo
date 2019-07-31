package sample.kingja.touchdemo;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Description:TODO
 * Create Time:2019/7/27 15:53
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class MySimpleButton extends AppCompatButton {


    private static final String TAG = "子---------->";

    public MySimpleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.v(TAG, "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v(TAG, "onTouchEvent");
        return super.onTouchEvent(event);
    }
}
