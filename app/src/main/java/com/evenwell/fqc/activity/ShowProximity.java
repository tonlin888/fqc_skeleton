/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowProximity.java                                      *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  20110819                                                 *
 * PURPOSE: For Proximity Test of FQC mode.                                *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import java.io.File;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

/**
 * reference QC 7630 EricYang add
 *
 */
public class ShowProximity extends BaseActivity implements SensorEventListener { /* implementation hidden */ }
    // test case configure variable
    //private static final int ST_UNCOVER = 2;
    //private static final int ST_FINAL = 3;
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    // @Override
    public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
}

    // @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}


        // get default sensor object
            // by checking sensor name (for LFC project)


    @Override
    protected void onStop() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // ex, <NumOfSensor name="1,5,18.0,10.0" enable="true" />
}



    void updateText() { /* implementation hidden */ }
}

    // Detector Class Definition
    private class Detector { /* implementation hidden */ }
}

        void setThreshold(float near, float far) { /* implementation hidden */ }
}

        public String toString() { /* implementation hidden */ }
}

        void gotEvent(SensorEvent event) { /* implementation hidden */ }
}


                // the value will be lower if close to sensor
                // the value will be higher if close to sensor


        boolean isAllNear() { /* implementation hidden */ }
}

        boolean isAllFar() { /* implementation hidden */ }
}

        // list state by type (ST_NEAR or ST_FAR)
        String getStatusIds(int type) { /* implementation hidden */ }
                int[] order = { /* implementation hidden */ }
}
