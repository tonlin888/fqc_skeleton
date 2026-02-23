/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowTouchPanel.java                                      *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  20110819                                                 *
 * PURPOSE: For TouchPanel Test of FQC mode.reference QC 7630              *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Cell;
import com.evenwell.fqc.utility.FQCLog;

public class NineTouch extends BaseActivity { /* implementation hidden */ }
    // private BufferedWriter mFileWriter = null;
    // private static boolean bPressed = false;
    public void onResume() { /* implementation hidden */ }
        // IntentFilter intentFilter = new IntentFilter(
        // Intent.ACTION_MEDIA_MOUNTED);
        // intentFilter.addAction(Intent.ACTION_MEDIA_UNMOUNTED);
        //
        // intentFilter.addDataScheme("file");
        // registerReceiver(m_Receiver, intentFilter);
    protected void onPause() { /* implementation hidden */ }
        // unregisterReceiver(m_Receiver);
    private void testPass() { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // Intent intent = this.getIntent();
        // mEmboss = new EmbossMaskFilter(new float[] { 1, 1, 1 }, 0.4f, 6,
        // 3.5f);
        // mBlur = new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL);
    public void colorChanged(int color) { /* implementation hidden */ }
    public class MyView extends View { /* implementation hidden */ }
        public Handler mHandler = new Handler() { /* implementation hidden */ }
            public void handleMessage(Message msg) { /* implementation hidden */ }
}


        /**
         * @param context
         */
        public MyView(Context context) { /* implementation hidden */ }
}

        public void initCellSize() { /* implementation hidden */ }
}

        public void initCellRect() { /* implementation hidden */ }
            // draw cell rect
}


        /*
         * (non-Javadoc)
         *
         * @see android.view.View#onMeasure(int, int)
         */
        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { /* implementation hidden */ }
}

        /*
         * (non-Javadoc)
         *
         * @see android.view.View#onLayout(boolean, int, int, int, int)
         */
        @Override
                int bottom) { /* implementation hidden */ }
}

        /*
         * (non-Javadoc)
         *
         * @see android.view.View#onDraw(android.graphics.Canvas)
         */
        @Override
        protected void onDraw(Canvas canvas) { /* implementation hidden */ }
}

        public void drawCellRect(Canvas canvas) { /* implementation hidden */ }
}

        public void drawLine(Canvas canvas) { /* implementation hidden */ }
            // draw horizon line
}

            // draw portrait line

        public void judgeIfCellTouched(MotionEvent event) { /* implementation hidden */ }
}

        /*
         * (non-Javadoc)
         *
         * @see android.view.View#onTouchEvent(android.view.MotionEvent)
         */
        @Override
        public boolean onTouchEvent(MotionEvent event) { /* implementation hidden */ }
}


    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
        // ej 20140805 start
        //return COST_TIME;
        // ej 20140805 end
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

  //JUL-2013 oliver For Params flexibility START
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
    //JUL-2013 oliver For Params flexibility END
