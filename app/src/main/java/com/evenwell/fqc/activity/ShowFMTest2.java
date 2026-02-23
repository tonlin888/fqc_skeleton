// fihtdc
package com.evenwell.fqc.activity;

import android.content.Context;
import android.content.ComponentName;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.media.AudioManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.fmradio.FmService;
import com.android.fmradio.FmListener;
import com.android.fmradio.FmUtils;
import com.evenwell.fqc.R;
import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.Utility;

public class ShowFMTest2 extends BaseActivity { /* implementation hidden */ }
    // Logging
    // test case state: wait, test, finish
    // Service listener
    private FmListener mFmRadioListener = new FmListener() { /* implementation hidden */ }
        public void onCallBack(Bundle bundle) { /* implementation hidden */ }
            // remove tag message first, avoid too many same messages in queue.
}

    /**
     * Main thread handler to update UI
     */
    private final Handler mHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
                    // if receive headset plug out, need set headset mode on ui
}


                    // tune finished, should make power enable
                    //mCurrentStation = FmUtils.computeStation(frequency);
                    // After tune to station finished, refresh favorite button and
                    // other button status.

                    // tune fail,should resume button status


                    //finish();


    // When call bind service, it will call service connect. register call back
    // listener and initial device
    private final ServiceConnection mServiceConnection = new ServiceConnection() { /* implementation hidden */ }
        /**
         * called by system when bind service
         *
         * @param className component name
         * @param service service binder
         */
        public void onServiceConnected(ComponentName className, IBinder service) { /* implementation hidden */ }
}

        /**
         * unbind service will call this method
         *
         * @param className
         *            component name
         */
        public void onServiceDisconnected(ComponentName className) { /* implementation hidden */ }
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}


        // Should start FM service first.







    @Override
    protected void onPause(){ /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}


    @Override
    public void onTestTimeout() { /* implementation hidden */ }
}


    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // Set Params to Default if failed to Get from fqc.xml
}

        @Override
        public void onClick(View arg0) { /* implementation hidden */ }
}

        @Override
        public void onClick(View arg0) { /* implementation hidden */ }
}

        @Override
        public void onClick(View arg0) { /* implementation hidden */ }
}

    /**
     * Check whether antenna is available
     *
     * @return true or false indicate antenna available or not
     */
    private boolean isAntennaAvailable() { /* implementation hidden */ }
}

    private void openFM() { /* implementation hidden */ }
}


    private void closeFM(String reason) { /* implementation hidden */ }
}


    private void setFreNum(int frequence) { /* implementation hidden */ }
        // FihTdcCode@20160122 Edwin add to record more information {
        // FihTdcCode@20160122 Edwin add to record more information }
}

    private void switchUiState(String s) { /* implementation hidden */ }
}

    private void registerHeadsetPlug(){ /* implementation hidden */ }
            public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
}


    private boolean testByFmApp() { /* implementation hidden */ }
}

    private void launchFm() { /* implementation hidden */ }
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
}
