/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  FQCTestItemListActivity.java                             *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: show list form fqc.xml list.                                   *
 *  reference QC  7630                                                     *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.preference.PreferenceFragment;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;

public class BatteryInfoActivity extends BaseActivity { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onPause() { /* implementation hidden */ }
    public int getTestElapsedTime() { /* implementation hidden */ }
    public int getTestMode() { /* implementation hidden */ }
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

    public static class BatteryInfoFragment extends PreferenceFragment { /* implementation hidden */ }
        public void onAttach(Context context) { /* implementation hidden */ }
        public void onCreate(final Bundle savedInstanceState) { /* implementation hidden */ }
}

        @Override
        public void onPause() { /* implementation hidden */ }
}

        @Override
        public void onResume() { /* implementation hidden */ }
}

        private BroadcastReceiver mBatteryInfoReceiver = new BroadcastReceiver() { /* implementation hidden */ }
            public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
                    // ==================================================================
}
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================
                    // ==================================================================

        private final String tenthsToFixedString(int x) { /* implementation hidden */ }
}

        private Handler mHandler = new Handler() { /* implementation hidden */ }
            public void handleMessage(Message msg) { /* implementation hidden */ }
}

        private void setSummary(String key, String str) { /* implementation hidden */ }
}

        private String getDeviceInfo(String path) { /* implementation hidden */ }
}

