package com.evenwell.fqc.activity;

import java.util.ArrayList;
import java.util.Collections;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.LayoutResourceHelper;

public class WaterResist extends BaseActivity { /* implementation hidden */ }
    // events
    final String[] EVENT_NAME = { /* implementation hidden */ }
    // states
    final String[] STATE_NAME = { /* implementation hidden */ }
	// config variable
    // debug only
    private float[] mDebugData = { /* implementation hidden */ }
        // get median
        // add weight
        // remove weight
    private void sendFakeData(int delay) { /* implementation hidden */ }
}

    private void onUpdate() { /* implementation hidden */ }
}


        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}







    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    private void initViews() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

    private boolean registerSensor() { /* implementation hidden */ }
}

    protected void unregisterSensor() { /* implementation hidden */ }
}


    private float calculateMedian() { /* implementation hidden */ }
}

    private SensorEventListener mEventListener = new SensorEventListener() { /* implementation hidden */ }
        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
}
