
/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  QwertyKeyBoardTest.java                                  *
 * CREATED BY  :  @author ke-xin.wang                                      *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: Just for TNQ  Project                                          *
 *                                                                         *
 * REFERENCE CODE: QUALCOMM-FQC7x27                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.util.ArrayList;
import java.util.List;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Bitmap;

import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.baseActivity.BaseActivity;

public class QwertyKeyBoardTest extends BaseActivity{ /* implementation hidden */ }
    private class KeyInfo extends android.graphics.drawable.Drawable { /* implementation hidden */ }
        public void setBounds(int left, int top, int right, int bottom) { /* implementation hidden */ }
        public void setBounds(Rect bounds) { /* implementation hidden */ }
        public void draw(Canvas canvas) { /* implementation hidden */ }
        public int getOpacity() { /* implementation hidden */ }
        public void setAlpha(int alpha) { /* implementation hidden */ }
        public void setColorFilter(ColorFilter cf) { /* implementation hidden */ }
        public int getKeyCode() { /* implementation hidden */ }
        public boolean getTestStatus() { /* implementation hidden */ }
        public void setTestStatus(boolean state) { /* implementation hidden */ }
        public KeyInfo(int key_code, int x, int y, Bitmap bmp) { /* implementation hidden */ }
    private class KeyboardView extends View { /* implementation hidden */ }
        public KeyboardView(Context context) { /* implementation hidden */ }
                        //key = new KeyInfo(i, 0, 212, mImageButton); //chang by yisong test
                        //key = new KeyInfo(i, 168, 212, mImageButton);//chang by yisong
                        //key = new KeyInfo(i, 85, 212, mImageButton);//chang by yisong
                        //key = new KeyInfo(i, 251, 0, mImageButton);//chang by yisong
                        //key = new KeyInfo(i, 0, 142, mImageButton);
}

        @Override
        protected void onDraw(Canvas canvas) { /* implementation hidden */ }
}


    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
        //return super.dispatchKeyEvent(event);
}
                        //Log.e(TAG, "mydata.getKeyCode() = " + mydata.getKeyCode())

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

