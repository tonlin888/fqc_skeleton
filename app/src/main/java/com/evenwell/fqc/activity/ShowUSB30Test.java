/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowALS.java                                             *
 * CREATED BY  :  @author An-Ming.Wang                                     *
 * CREATED DATE:  2011/8/19                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC will use it to test ALS.                                   *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;

 // FihTdcCode@20150911 Edwin add new feature: assign resource with path {
import android.graphics.drawable.Drawable;
 // FihTdcCode@20150911 Edwin add new feature: assign resource with path {

// ej 20150430 - change base class for NX1
public class ShowUSB30Test extends ShapeBaseActivity { /* implementation hidden */ }
    // flow: initial -> usb30 side 1 detecting -> usb30 removing -> usb30 side 2 detecting -> usb30 removing -> final
    // State Dispatch Events
    // test case configure variable
    // USB Type-C right side(1), inverse side(0), not detected(-1)
    //private static final String OTG_RIGHT_SIDE = "1";
    //private static final String OTG_INVERSE_SIDE = "0";
    // high-speed, super-speed or unknown
    //private static final String OTG_HIGH_SPEED = "high-speed";
    //private static final String OTG_UNKNOWN_SPEED = "unknown";
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // view setup
    public void onResume() { /* implementation hidden */ }
    protected void onStop() { /* implementation hidden */ }
    public int getTestElapsedTime() { /* implementation hidden */ }
    public int getTestMode() { /* implementation hidden */ }
    public void run() { /* implementation hidden */ }
    private void sendMessage(int event) { /* implementation hidden */ }
    private void updateView(final int state) { /* implementation hidden */ }
}

    public void goNextState() { /* implementation hidden */ }
}

    private final Handler mStateDispatchHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
                    // just go next state

    private String readDirect() { /* implementation hidden */ }
}

    private boolean isSuperSpeed() { /* implementation hidden */ }
}

    //// test code {
    //int test_idx = 0;
    //String test_data[] = {OTG_SUPER_SPEED, OTG_RIGHT_SIDE, OTG_NOT_DETECT, OTG_SUPER_SPEED, OTG_INVERSE_SIDE, OTG_NOT_DETECT};
    //// test code }

    private String readOneLinefromFile(final String path) { /* implementation hidden */ }
}
                // by pass

        //// test code {
        //result = test_data[test_idx];
        //test_idx = ((test_idx + 1) < test_data.length)?test_idx + 1: test_idx;
        //// test code }


    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

