/*=========================================================================*
 * FIH Taiwan Design Center                                                *
 * FILENAME    :  GSensorCalActivity.java                                  *
 * CREATED BY  :  Neo CFYen                                                *
 * CREATED DATE:  2009 Nov.                                                *
 * PURPOSE: View of G-Sensor Calibration.                                  *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager; // 20151020 Edwin add - keep screen on
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.util.DisplayMetrics;

import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;

public class Gsensorcalibration extends Activity implements OnClickListener, SensorEventListener { /* implementation hidden */ }
    /** Called when the activity is first created. */
    /* FihtdcCode@20150626 YiYu add for refine calibrate layout START */
    /* FihtdcCode@20150626 YiYu add for refine calibrate layout END */
    public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
}

        //20130905 oliver For Watch-size GUI ratio tuning START
//        bubble.layout(bubble.getLeft(),
//                calProcess.getBubblePositionY(data[1], mDisplaymetrics.densityDpi),
//                bubble.getLeft()+ bubble.getWidth(),
//                calProcess.getBubblePositionY(data[1], mDisplaymetrics.densityDpi) + bubble.getHeight());
//
//        bubble_lan.layout(calProcess.getBubblePositionX(data[0], mDisplaymetrics.densityDpi),
//                bubble_lan.getTop(),
//                calProcess.getBubblePositionX(data[0], mDisplaymetrics.densityDpi) + bubble_lan.getWidth(),
//                bubble_lan.getTop()+ bubble_lan.getHeight());


        //// For layout tuning only:
        //data[0]=0;
        //data[1]=0;
        /* FihtdcCode@20150626 YiYu modify for refine calibrate layout START */
                                                 mTube.getTop() + bubbleHeight, /* tube top, preserve a bubble height */
                                                 mTube.getBottom() - bubbleHeight); /* tube bottom, preserve a bubble height */

                                                 mTubeLans.getLeft() + bubbleWidth, /* lan tube left, preserve a bubble width */
                                                 mTubeLans.getRight() - bubbleWidth); /* lan tube right, preserve a bubble width */

        //LogHelper.w(TAG, "Gsensorcalibration onSensorChanged mDisplaymetrics.densityDpi"+mDisplaymetrics.densityDpi+" TunedDensityDpi="+TunedDensityDpi);
        //LogHelper.w(TAG, "Gsensorcalibration onSensorChanged data[0]="+data[0]+" data[1]="+data[1]+" data[2]="+data[2]);
        /* FihtdcCode@20150626 YiYu modify for refine calibrate layout END */
        //20130905 oliver For Watch-size GUI ratio tuning END

    public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
            //20130719 oliver Dynamic Layout by LayoutResourceHelper START
            //setContentView(R.layout.gsensorcalibration_tinq);
            //20130719 oliver Dynamic Layout by LayoutResourceHelper END
            //20130719 oliver Dynamic Layout by LayoutResourceHelper START
            //setContentView(R.layout.gsensorcalibration);
            //20130719 oliver Dynamic Layout by LayoutResourceHelper END
}


    @Override
    protected void onResume() { /* implementation hidden */ }
}
            //do nothing

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onStop() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}

        /* FihtdcCode@20150626 YiYu add for refine calibrate layout START */
        /* FihtdcCode@20150626 YiYu add for refine calibrate layout END */


    public void onClick(View v) { /* implementation hidden */ }
}

     //FIHNJdcCode@20120209 fly.f.ren added for TNQ.B Layout begin
    private int onScreenHeightPx(){ /* implementation hidden */ }
}
    //FIHNJdcCode@20120209 fly.f.ren added   for  TNQ.B Layout end

    // ej 20140825 start - for IWP/NX1 who don't have back key
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
}
        // ej 20150513 start - for lmr - change the constant value to xml value
        // ej 20150513 end
        /* FihtdcCode@20150724 YiYu add for block volume up and down START */
        /* FihtdcCode@20150724 YiYu add for block volume up and down END */
    // ej 20140825 end
