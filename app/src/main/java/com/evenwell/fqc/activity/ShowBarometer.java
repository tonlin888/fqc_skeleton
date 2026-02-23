/* EJ 20150318
 * test pressure and temperature
 *          complete in 20150422
 */

package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler; // FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature
import android.os.Message; // FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
// ej 20150430 - change base class for NX1
public class ShowBarometer extends ShapeBaseActivity { /* implementation hidden */ }
    /* FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature START */
    /* FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature END */
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onResume() { /* implementation hidden */ }
        /* FihtdcCode@20150722 YiYu modify for LMR: seprate Barometer and Temperature START */
}
        /* FihtdcCode@20150722 YiYu modify for LMR: seprate Barometer and Temperature END */
        /* FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature START */

        /* FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature END */

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        //
}

    private SensorEventListener m_lnrSensorEvent = new SensorEventListener() { /* implementation hidden */ }
        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
                    /* FihtdcCode@20150722 YiYu modify for LMR: seprate Barometer and Temperature START */
                    /* FihtdcCode@20150728 YiYu modify for LMR sensor problem START */
                    // original code
                    //m_tvPress.setText("Pressure: " + event.values[0] + " (" + m_iCountPres + "/" + mPassCount + ")");
                    //if (m_iCountPres > mPassCount) {
                    //    unRegisterSensor(Sensor.TYPE_PRESSURE);
                    //    m_tvPress.setText("Pressure: Test Pass");
                    //    mHandler.sendEmptyMessageDelayed(START_TEMPERATURE, 500);
                    //}
}
                    /* FihtdcCode@20150728 YiYu modify for LMR sensor problem END */
                    /* FihtdcCode@20150722 YiYu modify for LMR: seprate Barometer and Temperature END */
                    /* FihtdcCode@20150722 YiYu modify for LMR: seprate Barometer and Temperature START */
                    /* FihtdcCode@20150728 YiYu modify for LMR sensor problem START */
                    // original code
                    //m_tvTemp.setText("Temperature: " + event.values[0] + " (" + m_iCountTemp + "/" + mPassCount + ")");
                    //if (m_iCountTemp > mPassCount) {
                    //    unRegisterSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
                    //    m_tvTemp.setText("Temperature: Test Pass");
                    //    mHandler.sendEmptyMessageDelayed(CHECK_RESULT, 500);
                    //}
                    /* FihtdcCode@20150728 YiYu modify for LMR sensor problem END */
                    /* FihtdcCode@20150722 YiYu modify for LMR: seprate Barometer and Temperature END */
    /* FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature START */
    private boolean isValidValue(double value) { /* implementation hidden */ }
}

    private Sensor getSensor(int type) { /* implementation hidden */ }
}

    private boolean registSensor(int type) { /* implementation hidden */ }
}

    private void unRegisterSensor(int type) { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
    /* FihtdcCode@20150722 YiYu add for LMR: seprate Barometer and Temperature START */
