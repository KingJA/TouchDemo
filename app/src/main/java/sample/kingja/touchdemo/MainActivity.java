package sample.kingja.touchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Level【0】\t【Activity】\t\t";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View mButton = findViewById(R.id.btn);
//        mButton.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                int action = event.getAction();
//
//                switch (action) {
//                    case MotionEvent.ACTION_DOWN:
//                        Log.e(TAG, "onTouch ACTION_DOWN");
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        Log.e(TAG, "onTouch ACTION_MOVE");
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        Log.e(TAG, "onTouch ACTION_UP");
//                        break;
//                    default:
//                        break;
//                }
//                return false;
//            }
//        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick");
            }
        });
//        mButton.setOnLongClickListener(new View.OnLongClickListener() {
//
//            @Override
//            public boolean onLongClick(View v) {
//                Log.e(TAG, "onLongClick");
//                return false;
//            }
//        });
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
}
