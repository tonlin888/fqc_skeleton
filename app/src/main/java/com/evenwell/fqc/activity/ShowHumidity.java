package com.evenwell.fqc.activity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

public class ShowHumidity extends BaseActivity { /* implementation hidden */ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    public int getTestElapsedTime() { /* implementation hidden */ }
    public int getTestMode() { /* implementation hidden */ }
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

    void updateInfo(float value) { /* implementation hidden */ }
}

    // Class Definition
    private class Humidity implements SensorEventListener { /* implementation hidden */ }
}

        public void unregister() { /* implementation hidden */ }
}

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }

        @Override
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
