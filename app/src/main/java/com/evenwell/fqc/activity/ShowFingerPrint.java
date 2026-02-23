/*=========================================================================*
 * FIH Taiwan Design Center                                                *
 * FILENAME    :  ShowFingerPrint.java                                     *
 * CREATED BY  :  @author EdwinLYTsai                                       *
 * CREATED DATE:  2015/10/23                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: Verify the finger print sensor availability                    *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.fingerprints.extension.sensortest.FingerprintSensorTest;
import com.fingerprints.extension.sensortest.SensorTest;
import com.fingerprints.extension.sensortest.SensorTestInput;
import com.fingerprints.extension.sensortest.SensorTestResult;

public class ShowFingerPrint extends BaseActivity { /* implementation hidden */ }
    // test result
    // test case configure variable
    // State
    private final String[] STATE_NAMES = { /* implementation hidden */ }
    // State Dispatch Events
    private final String[] EVENT_NAMES = { /* implementation hidden */ }
    private String s2n(int s) { /* implementation hidden */ }
    private String e2n(int e) { /* implementation hidden */ }
    // 1. ST_INITIAL -> ST_SELF_SERVICE -> ST_BADPOINT_SERVICE -> ST_FINAL
    // 2. ST_INITIAL -> ST_SELF_BADPOINT_ACTIVITY -> ST_FINAL
    // 3. ST_INITIAL -> ST_SELF_READ_FILE -> ST_BADPOINT_BINARY -> ST_FINAL
    // 4. ST_INITIAL -> ST_SELF_BINARY -> ST_BADPOINT_BINARY -> ST_FINAL
    // 5. ST_INITIAL -> ST_BADPOINT_BINARY -> ST_FINAL
    private void setupFlow() { /* implementation hidden */ }
}

        // if no self test method, that means no need to check mSelfTestResult

        // if no badpoint test method, that means no need to check mBadPointTestResult

        // if no detect test method, that means no need to check mDetectTestResult


    public void enterState() { /* implementation hidden */ }
}


    private final Handler mStateDispatchHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
                    // make sure do exec thread has stopped
                    // update UI status
}


                    // pass through

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // show "Please put finger on sensor" if mTouchSensor (config by xml)
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
        // launch 3rd party to verify FP, need user to check whether the item is passed
}

    /*
    <Service test method>
        TestWithAPI: test by com.fingerprints.service.FingerprintSensorTest

    <APK test method>
        PackageName: apk for self test
        ClassName: apk for self test

    <command test>
        SelfTestScript: command to do self test
        BadPointTestScript: command to do bad point test

    <read file>
        SelfTestPath: file path; keeping self test result
    */
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // get test result from system property
            //get different test error result from system property
            // get test result from system property
            // show "Please put finger on sensor" during bad point test
            // show "Please put finger on sensor" during test
}

    private void sendEvent(int event) { /* implementation hidden */ }
}

    class DoExec implements Runnable { /* implementation hidden */ }
         DoExec(String c, String r) { /* implementation hidden */ }
         public void run() { /* implementation hidden */ }
                String[] cmds = { /* implementation hidden */ }
                    //int r = Utility.getPropInt(this.result, 0);
                    //Log.d(TAG, "DoExec.run(), read " + r + " from " + this.result);
                    //code = r;
}

    // test method
    private void doTest_Service(String test_name) { /* implementation hidden */ }
}

                    @Override
                    public void onResult(final SensorTestResult result) { /* implementation hidden */ }
}

    private void doSelf_BadPointTest_Activity() { /* implementation hidden */ }
        // Start ap
        // mExtApkType: we have two type of external Apk Interface,
        //      1) unspecified
        //      2) CE1-1: [in]timeid = 1000, command = "cmd", result = "result". [out] result = "PASS" or "FAIL"
}
    private void doSelfTest_Binary() { /* implementation hidden */ }
        // wait do exec thread until THREAD_TIMEOUT
}
    private void doBadpointTest_Binary() { /* implementation hidden */ }
        // wait do exec thread until THREAD_TIMEOUT
}
    private void doDetectTest_Binary() { /* implementation hidden */ }
        // wait do exec thread until THREAD_TIMEOUT
}

    private void doSelfTest_ReadFile() { /* implementation hidden */ }
}

    //private FingerprintSensorTestListener mListener = new FingerprintSensorTestListener() {
    //    @Override
    //    public void onSelfTestResult(final boolean result) {
    //        Log.d(TAG, "--onSelfTestResult, result = " + result);
    //        mSelfTestResult = (result) ? TEST_PASS : TEST_FAIL;
    //        mSelfTestText.setText(getResources().getString(R.string.Auto_Self_Test_Title) + mSelfTestResult);
    //        sendEvent(EV_NEXT);
    //    }
    //
    //    @Override
    //    public void onCheckerboardTestResult(int result) {
    //        Log.d(TAG, "--onCheckerboardTestResult, result = " + result);
    //        mBadPointTestResult = (0 == result) ? TEST_PASS : TEST_FAIL;
    //        mBadTestText.setText(getResources().getString(R.string.Bad_Point_Test_Title) + mBadPointTestResult + ", code =" + result);
    //        sendEvent(EV_NEXT);
    //    }
    //};
    //
    //private SensorTestCallback mListener2 = new SensorTestCallback() {
    //    @Override
    //    public void onSelfTestResult(int result) {
    //        Log.d(TAG, "--onSelfTestResult, result = " + result);
    //        mSelfTestResult = (0==result) ? TEST_PASS : TEST_FAIL;
    //        mSelfTestText.setText(getResources().getString(R.string.Auto_Self_Test_Title) + mSelfTestResult);
    //        sendEvent(EV_NEXT);
    //    }
    //
    //    @Override
    //    public void onCheckerboardTestResult(int result) {
    //        Log.d(TAG, "--onCheckerboardTestResult, result = " + result);
    //        mBadPointTestResult = (0 == result) ? TEST_PASS : TEST_FAIL;
    //        mBadTestText.setText(getResources().getString(R.string.Bad_Point_Test_Title) + mBadPointTestResult + ", code =" + result);
    //        sendEvent(EV_NEXT);
    //    }
    //    @Override
    //    public void onImagequalityTestResult(int result){}
    //    @Override
    //    public void onImagecapacitanceTestResult(int result){}
    //    @Override
    //    public void onImageresetpixelTestResult(int result){}
    //    @Override
    //    public void onAfdcalibrationTestResult(int result){}
    //    @Override
    //    public void onAfdcalibrationrubberstampTestResult(int result){}
    //    @Override
    //    public void onAfdrubberstampTestResult(int result){}
    //};
