/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  PixelTestActivity.java                                   *
 * CREATED BY  :  @author An-Ming.Wang                                     *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC will use it to test pixel.                                 *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Utility;

import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.view.WindowManager.LayoutParams;
import static android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

public class PixelTestActivity extends BaseActivity { /* implementation hidden */ }
    //20130731 oliver COST_TIME Flexibility
    // FihTdcCode@20151020 Edwin add to become fullscreen {
    // FihTdcCode@20151020 Edwin add to become fullscreen }
    private final String[] STATE_NAMES = { /* implementation hidden */ }
    private String[] mPaths = { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public boolean onTouchEvent(MotionEvent event) { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
        // disable back key
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // Set Params to Default if failed to Get from fqc.xml
}

        // setup test flow


        // setup timeout

    private class PixelTestView extends View { /* implementation hidden */ }
        public PixelTestView(Context context) { /* implementation hidden */ }
        private void drawScaleBitmap(Canvas canvas, int res) { /* implementation hidden */ }
            // get the real full screen size for LCM
        protected void onDraw(Canvas canvas) { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
                            // set manual brightness mode for test
}

            // FihTdcCode@20151020 Edwin add to become fullscreen {
            // FihTdcCode@20151020 Edwin add to become fullscreen {

    // need more time to load bitmap resource
    private int delay(int st) { /* implementation hidden */ }
}

    private void keepBrightnessSettings() { /* implementation hidden */ }
}
