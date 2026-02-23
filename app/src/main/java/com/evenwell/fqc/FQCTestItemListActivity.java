/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  FQCTestItemListActivity.java                             *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: show list form fqc.xml list.                                   *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc;

import android.app.Activity;
import android.app.Dialog;
import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.evenwell.fqc.activity.AutoTestController;
import com.evenwell.fqc.activity.FCI;
import com.evenwell.fqc.activity.FQCTestResultDialog;
import com.evenwell.fqc.activity.FQCTestResultDialog.onResultLisener;
import com.evenwell.fqc.activity.ShowBackgroundTests;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.provider.FQCProvider;
import com.evenwell.fqc.script.TestScript;
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.MarkPowerKey;
import com.evenwell.fqc.utility.Utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

//import android.net.Uri;
//import android.os.Build;

public class FQCTestItemListActivity extends ListActivity{ /* implementation hidden */ }
    /** @author JimmyChen at 2011/12/8 for test mode define*/
    /** @author JimmyChen at 2011/12/8 for components mode define*/
    //2013-JUL Logging Rules
    // 20131004 To record Manual Rounds(3721) & Auto Rounds (372) when start FQC By Gary implement STARD
    // 20131004 To record Manual Rounds(3721) & Auto Rounds (372) when start FQC By Gary implement END
    // ej 20140311 start
    // ej 20140311 end
    // FihTdcCode@20160314 Edwin add new mode 664 for MMI station {
    // FihTdcCode@20160314 Edwin add new mode 664 for MMI station }
//    private boolean mIsBB2 = false;
    // 20131004 To record Manual Rounds(3721) & Auto Rounds (372) when start FQC By Gary implement START
    // 20131004 To record Manual Rounds(3721) & Auto Rounds (372) when start FQC By Gary implement END
    // FihTdcCode@20150930 Edwin add for FH2-3331 to recover volume settings {
    // FihTdcCode@20150930 Edwin add for FH2-3331 to recover volume settings }
        // JGR/MS1 report OOM after loop test.
        // no OOM after removing UncaughtExceptionHandler
        //// ej 20140421 start - avoid power/home key haven't unlock due to force close
        //
        //Thread.UncaughtExceptionHandler _unCaughtExceptionHandler =
        //        new Thread.UncaughtExceptionHandler() {
        //            @Override
        //            public void uncaughtException(Thread thread, Throwable ex) {
        //                Log.e("FQC","uncaughtException in FQC:", ex);
        //                MarkPowerKey.enablePowerKey();
        //                restoreNavKeys(); // FihtdcCode@20150724 YiYu add for hide navigation keys
        //                // ej 20140813 start
        //                Platform_Uninit();
        //                // ej 20140813 end
        //                finish();
        //                System.exit(0);
        //            }
        //        };
        //Thread.setDefaultUncaughtExceptionHandler(_unCaughtExceptionHandler);
        //
        //// ej 20140421 end
}


        //initnewAPK();





    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){ /* implementation hidden */ }
}

    private void lazyStart() { /* implementation hidden */ }
        //20130719 oliver Dynamic Layout by LayoutResourceHelper START
        //initListViewData();
        //show system view
        //showSystemView();
        //2013-JUL oliver Add LayoutResourceHelper For dynamic layout
        //initLayoutResourceHelper();
        //20130719 oliver Dynamic Layout by LayoutResourceHelper START
        // 20131004 To record Manual Rounds(3721) & Auto Rounds (372) when start FQC By Gary implement START
        // 20131004 To record Manual Rounds(3721) & Auto Rounds (372) when start FQC By Gary implement END
        // ej 20140421 start - erase results
}
        // ej 20140421 end

        // ej 20140813 start
        // ej 20140813 end

    /**
     * @author GaryPWChen at 2013/10/04
     * @return void
     * @param @param
     * @Description: To record Manual Rounds(3721) & Auto Rounds (372) when start FQC
     */
    public void saveRunRounds() { /* implementation hidden */ }
                // TODO Auto-generated catch block
}





    private void turnOnADB(){ /* implementation hidden */ }
            //Toast.makeText(this, "mADBState="+mADBState, Toast.LENGTH_LONG).show();
}

    private void turnOffADB(){ /* implementation hidden */ }
}
    /**
     * @author JimmyChen at 2012/3/28
     * @return void
     * @param
     * @Description: Fixed issue ITD.B-90
     */
    private void setOrate(){ /* implementation hidden */ }
}


    /**
     * @author JimmyChen at 2011/12/19
     * @return void
     * @param @param getIntent
     * @Description: set debug mode true by press *#*#3721#*#*
     */
    private void setDebugMode(Intent getIntent){ /* implementation hidden */ }
}
            // FihTdcCode@20160314 Edwin add new mode 664 for MMI station {
            // FihTdcCode@20160314 Edwin add new mode 664 for MMI station }

    private void initSound() { /* implementation hidden */ }
        /* FihtdcCode@20150722 YiYu modify for FAO-5671: move setStreamVolume out of debug mode START */
            // FihTdcCode@20150930 Edwin add for FH2-3331 to recover volume settings {
            mFmVolume = audioManager.getStreamVolume(/*AudioManager.STREAM_FM*/7);
            //Log.d(TAG, "--- volume: system = " + mSystemVolume + ", music = " + mMusicVolume
            //    + ", ring = " + mRingVolume + ", voice call = " + mVoiceCallVolume
            //    + ", fm = " + mFmVolume + ", ringer mode = " + mRingerMode + " ---");
            // FihTdcCode@20150930 Edwin add for FH2-3331 to recover volume settings }
            //Log.d(TAG, "initSound, " + Utility.dumpStreamVolume(this));
}

        // disable sound effect(Settings/Sound/Touch sounds)

        //Fihtdc Add for Android N begin
        //Fihtdc Add for Android N end

            //Log.d(TAG, "initSound, mFullbezel = " + mFullbezel);

        // initialization of the audio attributes and focus request
        //Log.d(TAG, "initSound, " + Build.VERSION.SDK_INT + ", " + Build.VERSION_CODES.P);


            // requesting audio focus

    private static class FocusChangeListener implements AudioManager.OnAudioFocusChangeListener { /* implementation hidden */ }
        int getFocusChangeAndReset() { /* implementation hidden */ }
}

        @Override
        public void onAudioFocusChange(int focusChange) { /* implementation hidden */ }
}

                @Override  public void onAudioFocusChange(int focusChange) { /* do nothing */ }

    /**
     * @author JimmyChen at 2011/12/11
     * @return void
     * @param
     * @Description: pre enable mould
     */
    private void preEnableMould(){ /* implementation hidden */ }
}
                //do nothing
//            LocationManager locationManager =
//                (LocationManager)getSystemService(Context.LOCATION_SERVICE);
//            locationManager.setTestProviderEnabled(LocationManager.GPS_PROVIDER, true);

        /* FihtdcCode@20150722 YiYu modify for FAO-5671: move setStreamVolume out of debug mode END */
        //Start child thread to test auto test mode

    /**
     * @author JimmyChen at 2011/11/26
     * @return void
     * @param
     * @Description: initialize list and adapter
     */
    private void initListViewData(){ /* implementation hidden */ }
                LayoutResourceHelper.getResource("fqctestitemlist"), new String[]{ /* implementation hidden */ }
}

    /**
     * @author JimmyChen at 2011/11/26
     * @return void
     * @param
     * @Description: set power screen wake lock
     */
    private void setPower(){ /* implementation hidden */ }
        // ej 20150330 begin - this method is depricated
        //PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        //wl = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK, "Brightness on");
        //wl.acquire();
        // ej 20150330 end
}

    /**
     * @author JimmyChen at 2011/11/26
     * @return void
     * @param
     * @Description: initialize window(screen on)
     */
    private void initWindow(){ /* implementation hidden */ }
}

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){ /* implementation hidden */ }
}


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
}

        // mapping result code to String for reading


        // reload_config_file(); // SX1-1812, always back to top item.

            //MANUAL_TEST_MODE && FCI
            //AUTO_TEST_MODE && FCI
                //DEBUG MODE
                    // ej 20150320 start
                    // ej 20150320 end




                    // do a match opration in order to find the failed item position



            // ej 20140317 start - if next activity is FCI, show background tests status. - auto test





            // ej 20140317 end

                    //Maybe we will add a toast

    private boolean startBackGroundActvity(int requestCode,boolean isResultOK,boolean isFirst){ /* implementation hidden */ }
}

                        // ej 20140317 end

    @Override
    protected void onDestroy(){ /* implementation hidden */ }
}

    private void recoveryAllState() { /* implementation hidden */ }
}

    private void reSetData(){ /* implementation hidden */ }
        // FihTdcCode@20150930 Edwin add for FH2-3331 to recover volume settings {
            audioManager.setStreamVolume(/*AudioManager.STREAM_FM*/7,
}
        // FihTdcCode@20150930 Edwin add for FH2-3331 to recover volume settings }

        // recover sound effect(Settings/Sound/Touch sounds)

        //reset state
        //wl.release(); // ej 20150330 - depricated
        //reset WIFI/BT/GPS state



    private void unregisterLisener(){ /* implementation hidden */ }
}


    /**
     * @author F3060326 at 2012/8/7
     * @return void
     * @param
     * @Description: clear data
     */
    private void clearData(){ /* implementation hidden */ }
}

    // generate test item name, launch intent
    Map<String, Object> generate_testItem(Map.Entry<String, String> entry) { /* implementation hidden */ }
}


            // support alias test name. User can configure test name.
                // get simple chinese string from SChinese@fqc.xml


    // create database record for each test item for show untest item at FCI
    // exclude FCI, RunAllTest
    private void update_database(Map.Entry<String, String> entry) { /* implementation hidden */ }
            // to cover the same string id issue for Touch Panel Self Test (Manual)
}

    /**
     * @author JimmyChen at 2011/11/26
     * @return void
     * @param
     * @Description: Async LoadingAdaper and sendMessage
     */
    private void asyncLoadingAdaper(){ /* implementation hidden */ }
            public void run() { /* implementation hidden */ }
}

    private void LoadingAdaper() { /* implementation hidden */ }
}
            //update_database(entry);
        //mHandler.sendEmptyMessage(HIDE_PROGRESS);


    /**
     * @author JimmyChen at 2011/11/19
     * @return void
     * @param
     * @Description: Add version show in title
     */
    private void initTitle(){ /* implementation hidden */ }
}


        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
                // put run all test at first
                        // because it always begin from second item at auto run mode (for run all test)
                        // we add some item to take the rule of "run all test"

                //Auto run


    /**
     * @author JimmyChen at 2011/11/30
     * @return List
     * @param @return
     * @Description: get the testItem map for run all test
     */
    public ArrayList<Map<String, Object>> getTestItemMap(){ /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onStart() { /* implementation hidden */ }
}

    @Override
    protected void onStop() { /* implementation hidden */ }
                // recovery only if wifi, gps and bt not testing in background
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}
        // ej 20150107 start - change all font size
        //Utility.overrideTextSize(this, getWindow().getDecorView(), 30);
        //getWindow().getDecorView().invalidate();
        // ej 20150107 end

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    @Override
    protected Dialog onCreateDialog(int id, Bundle args) { /* implementation hidden */ }
                public void onSaveTestResult(int type) { /* implementation hidden */ }
                        // ej 20150320 start
                        // ej 20150320 end
                        //do nothing
}

    // ej 20140813 start
    private void Platform_Init() { /* implementation hidden */ }
}

    private void Platform_Uninit() { /* implementation hidden */ }
}
    // ej 20140813 end

    // ej 20140825 start - for IWP/NX1 who don't have back key
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
}
        // ej 20150513 start - for lmr - change the constant value to xml value
        // ej 20150513 end
        /* FihtdcCode@20150724 YiYu add for block volume up and down START */
        /* FihtdcCode@20150724 YiYu add for block volume up and down END */

    private void dump_retest_info() { /* implementation hidden */ }
}


    // need System UI to support the fake back key funciton
    private void sendFakeBackKeyIntent(boolean on) { /* implementation hidden */ }
}

    // reload fqc.xml
    void reload_config_file() { /* implementation hidden */ }
        // clear data
        // parse xml, create list view
            LayoutResourceHelper.getResource("fqctestitemlist"), new String[]{ /* implementation hidden */ }
            // because it always begin from second item at auto run mode (for run all test)
            // we add some item to take the rule of "run all test"
}

    // write settings to histroy if not null, or read settings from histroy
    public static String sync_settings_histroy(Context context, String settings) { /* implementation hidden */ }
}

            // read
            // write



    // check xmlsettings is not empty for PSS project
    private void check_xml_settings_for_PSS() { /* implementation hidden */ }
}

