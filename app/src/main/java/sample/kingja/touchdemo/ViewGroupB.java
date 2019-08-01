package sample.kingja.touchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Description:TODO
 * Create Time:2019/7/27 15:53
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class ViewGroupB extends LinearLayout {


    private static final String TAG = "Level【2】\t【ViewGroupB】\t\t";

    public ViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "【dispatchTouchEvent】\t\t 【ACTION_DOWN】");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "【dispatchTouchEvent】\t\t 【ACTION_MOVE】");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "【dispatchTouchEvent】\t\t 【ACTION_UP】");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "【onInterceptTouchEvent】\t\t 【ACTION_DOWN】");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "【onInterceptTouchEvent】\t\t 【ACTION_MOVE】");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "【onInterceptTouchEvent】\t\t 【ACTION_UP】");
                break;
            default:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "【onTouchEvent】\t\t\t\t 【ACTION_DOWN】");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "【onTouchEvent】\t\t\t\t 【ACTION_MOVE】");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "【onTouchEvent】\t\t\t\t 【ACTION_UP】");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Log.e(TAG, "requestDisallowInterceptTouchEvent ");
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }
}
