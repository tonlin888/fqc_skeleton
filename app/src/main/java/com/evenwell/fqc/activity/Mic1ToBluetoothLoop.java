/*=========================================================================*
 * FIH Taiwan Design Center                                                *
 * FILENAME    :  Mic1ToBluetoothLoop.java                                 *
 * CREATED BY  :  @author OliverKHLee                                      *
 * CREATED DATE:  2013/9/10                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: Check the Mic1 input via Bluetooth headset                     *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaRecorder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LogHelper;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Mic1ToBluetoothLoop extends BaseActivity { /* implementation hidden */ }
    // private ImageView mUserInfo;
    // private boolean mTestHookKey = false;
    // private FQCConfig mConfig;
    //private int mLockedTime = 0;
    // ===========================
    // ===========================
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //mUserInfo = (ImageView) this.findViewById(R.id.userinfo);//
            public void onClick(View v) { /* implementation hidden */ }
            public void onClick(View arg0) { /* implementation hidden */ }
}

        // mTestHookKey =
        // mConfig.getConfigFunctionEnable(FQCXmlParseHandler.FQCSETTING
        // + "_Mic1ToHeadsetLoop_HookKey");

        // ========================================

        // Initialize Supported Bluetooth headset device configurations.






    // /========================
    private boolean CheckSupportedDevicePaired() { /* implementation hidden */ }
        // If there are paired devices
}



    private void SearchDevice() { /* implementation hidden */ }
        // listOfDevices.clear();
        // btPairthat1.setText("Searching Available Devices...");
            public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
                // When discovery finds a device
                    // Get the BluetoothDevice object from the Intent
                    // If supported, put device into Map
                            // ActivateSupportBtBtns
}
                    // discovery is finished




    private void InitSupportBtBtns() { /* implementation hidden */ }
                public void onClick(View arg0) { /* implementation hidden */ }
}


    private void ActivateSupportBtBtns(Button ThisBtBtn) { /* implementation hidden */ }
}

    private void PairDevice(BluetoothDevice device) { /* implementation hidden */ }
            // waitingForBonding = true;
            // Show UUIDs
            // ParcelUuid[] mParcelUuid=device.getUuids();
            // String UUIDoutput="";
            // for(ParcelUuid thisParcelUuid: mParcelUuid){
            // UUIDoutput+="  This UUID="+thisParcelUuid;
            // }
            // btPairthat2.setText( "Pairing finished. UUIDs="+UUIDoutput);
}


    private void RecFromMic1() { /* implementation hidden */ }
}

    private void PlayFromBluetooth() { /* implementation hidden */ }
        // Async Approach:
}

        // //stopRecording();
        // stopPlaying();

        // //route
        // AudioManager mAudioManager = (AudioManager)
        // getSystemService(Context.AUDIO_SERVICE);
        // //A2DP Play
        // mPlayer = new MediaPlayer();
        // try {
        // if(!mAudioManager.isBluetoothA2dpOn())
        // mAudioManager.setBluetoothA2dpOn(true);
        // mAudioManager.stopBluetoothSco();
        // try {
        // Thread.sleep(1500);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // // mAudioManager.setStreamSolo(AudioManager.STREAM_MUSIC, true);
        // mAudioManager.setRouting(AudioManager.MODE_NORMAL,
        // AudioManager.ROUTE_BLUETOOTH_A2DP, AudioManager.ROUTE_BLUETOOTH);
        // mAudioManager.setMode(AudioManager.STREAM_MUSIC );
        // mAudioManager.setBluetoothScoOn(true);
        // mAudioManager.startBluetoothSco();
        // File SDCardpath = Environment.getDataDirectory();
        // mPlayer.setDataSource(SDCardpath.getAbsolutePath() + "/"+fileName);
        // mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC );
        // mPlayer.prepare();
        // mPlayer.start();
        // mPlayer.setOnCompletionListener(new OnCompletionListener() {
        // public void onCompletion(MediaPlayer mp) {

        // mTextInfo.setText( "Playback finished." +
        // "\n Press BACK to done test" +
        // "\n Or press REC to record again.");
        // }
        //
        // });
        //
        // } catch (IOException e) {
        // Log.e(TAG, "prepare() failed");
        // }

    private void stopRecording() { /* implementation hidden */ }
}

    private void stopPlaying() { /* implementation hidden */ }
}

    private void resumeAudioRoute() { /* implementation hidden */ }
}

    private void resumeReceivers() { /* implementation hidden */ }
}

    private void EAsetBluetoothEnabled(boolean enable) { /* implementation hidden */ }
        // http://stackoverflow.com/questions/3806536/how-to-enable-disable-bluetooth-programmatically-in-android
}


    // /========================

    @Override
    public boolean onKeyDown(int arg0, KeyEvent arg1) { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
        //String commandOff = mConfig
        //        .getConfigDataString(FQCXmlParseHandler.FQCSETTING
        //                + "_Mic1ToHeadsetLoop_ShellOffCommandPath");
}

    //Handler mHandler = new Handler() {
    //    @Override
    //    public void handleMessage(Message msg) {
    //        mLocked = true;
    //        super.handleMessage(msg);
    //    }
    //
    //};

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    //private void lockedBackKey() {
    //    String lockedtime = mConfig
    //            .getConfigDataString(FQCXmlParseHandler.FQCSETTING
    //                    + "_Mic1ToHeadsetLoop_LockedTime");
    //    FQCLog.Logv("lockedtime =" + lockedtime);
    //    if (!TextUtils.isEmpty(lockedtime)) {
    //        try {
    //            FQCLog.Logv("parseInt");
    //            mLockedTime = Integer.parseInt(lockedtime);
    //            FQCLog.Logv("mLocked = false ");
    //            mLocked = false;
    //            mHandler.sendEmptyMessageDelayed(1, mLockedTime);
    //        } catch (Exception e) {
    //            FQCLog.Loge("parseInt" + e.getMessage());
    //        }
    //    }
    //}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
        // ej 20140805 start
        //return COST_TIME;
        // ej 20140805 end
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
                // Get Configurable Params from fqc.xml Defined Before JUL-2013
                // (These Params Might be set again in other functions)
                // Get Configurable Params from fqc.xml added After JUL-2013
                // Set Params to Default if failed to Get from fqc.xml
}


    AsyncTask<String, Integer, Boolean> { /* implementation hidden */ }
protected Boolean doInBackground(String... cmds) { /* implementation hidden */ }
}

protected void onProgressUpdate(Integer... progress) { /* implementation hidden */ }
    // setProgressPercent(progress[0]);
}

protected void onPostExecute(Boolean result) { /* implementation hidden */ }
}



            AsyncTask<String, Integer, Boolean> { /* implementation hidden */ }
        protected Boolean doInBackground(String... cmds) { /* implementation hidden */ }
                // stopPlaying();
}

        protected void onProgressUpdate(Integer... progress) { /* implementation hidden */ }
            // setProgressPercent(progress[0]);
}

        protected void onPostExecute(Boolean result) { /* implementation hidden */ }
}

    private class ToPlayTask extends AsyncTask<String, Integer, AudioManager> { /* implementation hidden */ }
        protected AudioManager doInBackground(String... cmds) { /* implementation hidden */ }
                // route
                // A2DP Play
                    // mAudioManager.setStreamSolo(AudioManager.STREAM_MUSIC,
                    // true);
                    //Route Audio to A2DP
                        public void onCompletion(MediaPlayer mp) { /* implementation hidden */ }
}




        protected void onProgressUpdate(Integer... progress) { /* implementation hidden */ }
            // setProgressPercent(progress[0]);
}

        protected void onPostExecute(AudioManager mAudioManager) { /* implementation hidden */ }
}

