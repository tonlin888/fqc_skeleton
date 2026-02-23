/*=========================================================================*
 * FIH Taipei Design Center                                               *
 * FILENAME    :  WirelessCharging.java                                   *
 * CREATED BY  :  Gary Chen                                               *
 * CREATED DATE:  20130510                                                *
 * PURPOSE: For Wireless Charging Test of FQC mode.                       *
 *=========================================================================*/
package com.evenwell.fqc.activity;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;




public class ShowWirelessCharging extends BaseActivity { /* implementation hidden */ }
    //private float mlist;
    //==============================================
    //private final int STAGE_0_Initial = 0;
    //Stage Flag
    //20130704 oliver Pass or Fail Determined
    // ============================================
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // TODO Auto-generated method stub
    private void setParamByConfig() { /* implementation hidden */ }
        //Don't care Disconnnet stage
        //Don't care Disconnnet stage
    private boolean EvaluatePickupByGyro(List<Float> mValue) { /* implementation hidden */ }
}



    private SensorEventListener mGyroSensorListener = new SensorEventListener() { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
}

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
}

    private boolean CheckLeaveThePadByPickup() { /* implementation hidden */ }
}

    private Handler mHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
                //20130628 oliver Function use incorrect ./originally=text2.setText(R.string.wireless_charging_batt_level+ level + "%)");
}


        @Override
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
}






                /* VKY-16242 By Gary Fixed, Crash happened after run wireless charging test fail.*/



    public int getTime_Charging_connected() { /* implementation hidden */ }
}

    public void setTime_Charging_connected(int time_Charging_connected) { /* implementation hidden */ }
}

    public void TestCaseTimerActions() { /* implementation hidden */ }
}

    public void Start_TestCaseTimer() { /* implementation hidden */ }
        /* VKY-16242 By Gary Fixed, Crash happened after run wireless charging test fail.*/
                public void run() { /* implementation hidden */ }
}


    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
        // ej 20140805 start
        //return COST_TIME;
        // ej 20140805 end
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected int getCoundDownTime() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    protected void DelaySetStage(int DelayTime) { /* implementation hidden */ }
        /* VKY-16242 By Gary Fixed, Crash happened after run wireless charging test fail.*/
                public void run() { /* implementation hidden */ }
}

    protected int setStage() { /* implementation hidden */ }
        //20130704 oliver Stop Stage transition when test finished.
}








            // To Fail
            //20130704 oliver Stop Stage transition when test finished.


            // To Pass
            //20130704 oliver Stop Stage transition when test finished.


    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
