/* EJ 20150416
 * test Heart Rate
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
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
// ej 20150430 - change base class for NX1
public class ShowHeartRate extends ShapeBaseActivity { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onResume() { /* implementation hidden */ }
        // register sensor
            //
}

    @Override
    protected void onPause() { /* implementation hidden */ }
            //
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
}

