/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  FQCBaseActivity.java                                     *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/12/01                                               *
 *-------------------------------------------------------------------------*
 * PURPOSE: Test item.                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.baseActivity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.evenwell.fqc.FQCItemInformation;
import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.activity.FQCTestResultDialog;
import com.evenwell.fqc.activity.FQCTestResultDialog.onResultLisener;
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.MarkPowerKey;
import com.evenwell.fqc.utility.Utility;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;

//20130620 oliver Make this class abstract For setParamsByConfig() abstract function For Params flexibility
public abstract class BaseActivity extends Activity implements TestMode { /* implementation hidden */ }
    // hide positive button before test done
    // test is finished (wait for user confirm or close soon)
    // single test, for auto test tool at factory
    /** Key code constant: The counterclockwise action of the Wheel button */
    /** Key code constant: The clockwise action of the Wheel button */
    /** Key code constant: The click action of the Wheel button */
    //Here we change mConfig from private to protectted,now we need to
    protected void attachBaseContext(Context newBase) { /* implementation hidden */ }
}

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //20130620 oliver For Params flexibility
        // support alias test name. User can configure test name.
        // Test script will update title at TestScript.onCreate()
}

        //Log.d(TAG, Utility.dumpStreamVolume(this));

    @Override
    protected void onStart() { /* implementation hidden */ }
        // avoid malicious application to launch unprotected IPC endpoints (activities), EVW-5282
        // turn on single_test to launch from shell, ex.
        //     adb shell am start -n com.evenwell.fqc/com.evenwell.fqc.activity.ShowSpeaker --ez "launchByShell" true
}

    private void setLable(){ /* implementation hidden */ }
}

            // the lable get from package manager is wrong!

    // let test case have chance to do something before timeout
    public void onTestTimeout() { /* implementation hidden */ }
        // do nothing
}

    @Override
    public void run() { /* implementation hidden */ }
}

    @Override
    public void startTestTimer() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    public void finishTest(int type){ /* implementation hidden */ }
}


    @Override
    public void setTestMode() { /* implementation hidden */ }

    @Override
    protected Dialog onCreateDialog(int id, Bundle args) { /* implementation hidden */ }
        //20130918 oliver For Dialog debug
        // check the now tested time and marked retry button
}

            // determine the result of semi/auto test automatically

            //20130918 oliver For Dialog debug

                @Override
                public void onSaveTestResult(int type) { /* implementation hidden */ }
}


    // FihTdcCode@20160122 Edwin add to record more information {
    public void updateDetails(String failReason, String information){ /* implementation hidden */ }
            // 999 is useless number but it should not be 0
            // Use "Skip" to update only fail reason and information
}
    // FihTdcCode@20160122 Edwin add to record more information }

    public void appendDetails(String failReason, String information) { /* implementation hidden */ }
}

    @Override
    public String getBackupTitle() { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    protected int getCoundDownTime(){ /* implementation hidden */ }
}

    private int getTestedCount(String title){ /* implementation hidden */ }
}
    /* FIHTDCCode@20121129 CarolChen for S1U.B-3475  begin*/
    private boolean isTopProcess(){ /* implementation hidden */ }
}
        // ej 20150320 start
        // ej 20150320 end
    /* FIHTDCCode@20121129 CarolChen for S1U.B-3475  end*/
    @Override
    protected void onPause() { /* implementation hidden */ }
        /* FIHTDCCode@20121129 CarolChen for S1U.B-3475  begin*/
        /* FIHTDCCode@20121129 CarolChen for S1U.B-3475  end*/
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    //20130620 oliver For Params flexibility START

    protected FQCParamsByConfigHelper ParamsByConfigHelperFactory(Context _context, String _ConfigPrefix, FQCConfig _Config) { /* implementation hidden */ }
}
    protected FQCParamsByConfigHelper ParamsByConfigHelperFactory(Context _context, String _ConfigPrefix) { /* implementation hidden */ }
}
    //20130620 oliver For Params flexibility END

    // ej 20140825 start - for IWP/NX1 who don't have back key
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
}
        // ej 20150513 start - for lmr - change the constant value to xml value
        // ej 20150513 end
        /* FihtdcCode@20150724 YiYu add for block volume up and down START */
        // add KEYCODE_CAMERA, KEYCODE_WHEEL_CCW, KEYCODE_WHEEL_CCW, KEYCODE_WHEEL_CLICK for LP3
        /* FihtdcCode@20150724 YiYu add for block volume up and down END */
    // ej 20140825 end

    protected void test_case_preparing(String reason) { /* implementation hidden */ }
}

    // test done, but we don't know whether pass or not, popup result while timeout or back key pressed
    protected void test_case_running(String reason) { /* implementation hidden */ }
}

    // test done, test case is fail, show result, need confirm(Pass/Fail/Retry) manually
    protected void test_case_wait_confirm(String reason) { /* implementation hidden */ }
}
    protected void test_case_wait_confirm(String reason, boolean noY) { /* implementation hidden */ }
}





    // test done, test case is pass, no need to show result
    protected void test_case_pass(String reason) { /* implementation hidden */ }
}

    // test done, test case is fail, no need to show result
    protected void test_case_fail(String reason) { /* implementation hidden */ }
}

    // check a test case is finish or not
    protected boolean test_case_isFinished() { /* implementation hidden */ }
}

    // read one line from [path]
    protected String readFile(String path) { /* implementation hidden */ }
}

    protected String getCallers(final int depth) { /* implementation hidden */ }
}

    protected String do_exec(String cmd) { /* implementation hidden */ }
}

    public static String do_exec(String cmd, String title) { /* implementation hidden */ }
}

            // replace shell

            String[] cmds = { /* implementation hidden */ }

