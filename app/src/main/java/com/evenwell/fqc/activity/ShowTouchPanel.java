/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowTouchPanel.java                                      *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  20110819                                                 *
 * PURPOSE: For TouchPanel Test of FQC mode.reference QC 7630              *
 *=========================================================================*/
package com.evenwell.fqc.activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import static android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

public class ShowTouchPanel extends BaseActivity { /* implementation hidden */ }
    public void onResume() { /* implementation hidden */ }
        /* FihtdcCode@20150626 YiYu add for refine Touch Lens layout START */
            // get the real full screen size for LCM
            // FihtdcCode@20150819 YiYu update: support from 4.1 to 5.1
            // this is used to get display size
        // TOOLGP-4368, The initial picture does not display completed in Touch Lens Test (Android P)
        //mHandler.postDelayed(new Runnable() {
        //        @Override
        //        public void run() {
        //            setContentView(mSurfaceView);
        //        }
        //    }, 100);
}
    @Override
    protected void onPause() { /* implementation hidden */ }
}
    @Override
    protected void onDestroy() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}


    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    public void colorChanged(int color) { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}
    @Override
    public int getTestMode() { /* implementation hidden */ }
}
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
