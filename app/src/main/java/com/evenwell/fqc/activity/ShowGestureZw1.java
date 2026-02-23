/* EJ 20150107
 * request from project zw1
 */

package com.evenwell.fqc.activity;

import java.util.Hashtable;
import java.util.Map;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShowGestureZw1 extends BaseActivity implements SensorEventListener{ /* implementation hidden */ }
    //private static final int COMPONENTS_MODE = FQCTestItemListActivity.COMPONENTS_MODE_SEMI;
    // gesture sensor type in zw1
    final static int[] GESTURE_NUMBERS = { /* implementation hidden */ }
    //private int m_iTestCount = -1;
    //
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onResume() { /* implementation hidden */ }
        // gesture1
}
        // gesture2
        // gesture3
        // gesture4
        // context posture
        // context motion
        // context transport

    private boolean isAllPass() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
        // ej 20150312 - it seems like this sensor can't be unregistered.
        //mSensorManager.unregisterListener(this);
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

    @Override
    public void onAccuracyChanged(Sensor arg0, int arg1) { /* implementation hidden */ }
        // do nothing
}

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) { /* implementation hidden */ }
        // following is copy from
        //      Context-Gesture Android Application and QuickLogic libsensor Integration Guide
        //      ver 1.2
        // fqc only use SENSOR_TYPE_GESTURE1.
                    //ctxGestType.setText("Gest1 , EventID= Raise HAND");
                    //m_tvText.append("SENSOR_TYPE_GESTURE1");
}
                    //ctxGestType.setText("Gest2 , EventID= Rotate or Twist HAND");
                    //m_tvText.append("\nSENSOR_TYPE_GESTURE2");
                    // ej 20150306 start
                    // ej 20150306 end

                        //ctxGestType.setText("Gest3 , Front TAP ");
                        //ctxGestType.setText("Gest3 , Back TAP");
                    //ctxGestType.setText("Gest4 , EventID= Free Fall");
                        //ctxGestType.setText("CP , Unknown ");
                        //ctxGestType.setText("CP , In Pocket");;
                        //ctxGestType.setText("CM , Unknown ");
                        //ctxGestType.setText("CM , Stationary");
                        //ctxGestType.setText("CM , Not on Person");
                        //ctxGestType.setText("CM , Waking Steps="+sensorEvent.values[1]);
                        //ctxGestType.setText("CM , Running Steps="+sensorEvent.values[1]);
                        //ctxGestType.setText("CM , Jogging");
                        //ctxGestType.setText("CT , In Vehicle");
                        //ctxGestType.setText("CT , Off Vehicle");
