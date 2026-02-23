/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowFlashLight.java                                      *
 * CREATED BY  :  @author An-Ming.Wang                                     *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC will use it to test the flash light.                       *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.io.IOException;
import java.util.List;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

// FihTdcCode@20151006 Edwin add to fix for HGO & NBQ {
import android.view.SurfaceHolder;
import android.view.SurfaceView;
// FihTdcCode@20151006 Edwin add to fix for HGO & NBQ }

public class ShowFrontFlashLight extends BaseActivity implements SurfaceHolder.Callback{ /* implementation hidden */ }
    // private FQCConfig mConfig;
    // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ {
    // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ {
        /*testText = new TextView(this);
        testText.setText(R.string.flight_turn_on);
        testText.setTextAppearance(this, R.style.FQCText);
        setContentView(testText);*/
        // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ  }
        // mConfig = new FQCConfig(getApplication());
    public void onResume() { /* implementation hidden */ }
        // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ  {
        // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ  }
            //mCamera = CameraHolder.instance().open(0); //oliver
            // try to flash light
                        // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ {
}
                        // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ }

                        // 20130527 OliverKHLee for AO9 Flashlight START
                        // 20130527 OliverKHLee for AO9 Flashlight END

//                      mCamera.autoFocus(new AutoFocusCallback() {
//                          public void onAutoFocus(boolean success,
//                                  Camera camera) {
//                          }
//                      });

                        // mCamera.autoFocus(mAutoFocusCallback);
                        // return true;


    @Override
    public void onPause() { /* implementation hidden */ }
            //if (mMode != null) {
            //  mCamera.stopPreview();
            //}
            // FIHnjdcCode@20120303 JimmyChen fixed Flash light begin
            // FIHnjdcCode@20120303 JimmyChen fixed Flash light end
            //CameraHolder.instance().release();// oliver
}

    // AutoFocusCallback mAutoFocusCallback = new AutoFocusCallback() {
    // @Override
    // public void onAutoFocus(boolean focused, Camera camera) {
    // showDialog(0);
    // }
    // };
    //
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
        // TODO Auto-generated method stub
}
    //JUL-2013 oliver For Params flexibility END

    // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ {
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) { /* implementation hidden */ }
}

    @Override
    public void surfaceCreated(SurfaceHolder holder) { /* implementation hidden */ }
}

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) { /* implementation hidden */ }
}
    // FihTdcCode@20151006 Edwin add to fix for HGO & NBQ }

