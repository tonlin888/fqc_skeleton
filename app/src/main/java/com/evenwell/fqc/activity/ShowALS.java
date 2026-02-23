/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowALS.java                                             *
 * CREATED BY  :  @author An-Ming.Wang                                     *
 * CREATED DATE:  2011/8/19                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC will use it to test ALS.                                   *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.LayoutResourceHelper;

public class ShowALS extends ShapeBaseActivity { /* implementation hidden */ }
    private SensorEventListener mALSListener = new SensorEventListener() { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
}


        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    private void initViews(){ /* implementation hidden */ }
}

    private void initSensor() { /* implementation hidden */ }
}


    @Override
    public void onResume() { /* implementation hidden */ }
}

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
}


    private boolean isDark(int[] values, int threshold) { /* implementation hidden */ }
}

    private boolean isLight(int[] values, int threshold) { /* implementation hidden */ }
}

    private String val2str() { /* implementation hidden */ }
}

    // all values is negative, setup test flow by first value, this step only run one time
    private void setTestIfNeed(int value) { /* implementation hidden */ }
}

    public void goNextState() { /* implementation hidden */ }
}

    private void updateUi() { /* implementation hidden */ }
}

