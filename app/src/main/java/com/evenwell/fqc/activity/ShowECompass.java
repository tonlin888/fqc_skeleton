/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evenwell.fqc.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.activity.view.CompassView;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
/**
 * This class provides a basic demonstration of how to use the
 * {@link android.hardware.SensorManager SensorManager} API to draw
 * a 3D compass.
 */
public class ShowECompass extends BaseActivity { /* implementation hidden */ }
    /* FihtdcCode@20150730 YiYu modify for refine test result START */
    /* FihtdcCode@20150730 YiYu modify for refine test result END */
    private void updateOrientation(float _roll, float _pitch, float _heading) { /* implementation hidden */ }
          //Log.v(TAG, "heading = " + heading);
          //Log.v(TAG, "pitch = " + pitch);
          //Log.v(TAG, "roll = " + roll);
}

    private void checkRotation(float roll) { /* implementation hidden */ }
        /* FihtdcCode@20150730 YiYu modify for refine test result START */
}

        /* FihtdcCode@20150730 YiYu modify for refine test result END */
    /** Called with the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) { /* implementation hidden */ }
}
        //20130719 oliver Dynamic Layout by LayoutResourceHelper START
        //setContentView(R.layout.compass);
        //20130719 oliver Dynamic Layout by LayoutResourceHelper END



        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
                    /* FihtdcCode@20150730 YiYu modify for refine test result START */
}
                    /* FihtdcCode@20150730 YiYu modify for refine test result END */
                    // ej 20140917 start
                    // ej 20140917 end
                    // ej 20140917 start
                    // ej 20140917 end
                /* FihtdcCode@20150730 YiYu add for refine calibrate progress START */
                /* FihtdcCode@20150730 YiYu add for refine calibrate progress END */


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
        /* FihtdcCode@20150730 YiYu modify for refine calibrate progress START */
            /* FihtdcCode@20150602 YiYu modify for Ecompass test sensor too fast START */
            /* FihtdcCode@20150602 YiYu modify for Ecompass test sensor too fast END */
}
        /* FihtdcCode@20150730 YiYu modify for refine calibrate progress END */

    @Override
    protected void onResume() { /* implementation hidden */ }
        /* FihtdcCode@20150717 YiYu modify for refine test procedure START */
}
        /* FihtdcCode@20150717 YiYu modify for refine test procedure END */


    @Override
    protected void onPause() { /* implementation hidden */ }
}

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
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

    // ======================================================================================
    // ej 20150421 start - for new api
    //======================================================================================
    private void loadCompassSensors() { /* implementation hidden */ }
}

    private void unloadCompassSensors() { /* implementation hidden */ }
}
    private SensorEventListener myListener = new SensorEventListener() { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent sensorEvent) { /* implementation hidden */ }
}
        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
    private  void calculateOrientation() { /* implementation hidden */ }
}
    // ej 20150421 end
