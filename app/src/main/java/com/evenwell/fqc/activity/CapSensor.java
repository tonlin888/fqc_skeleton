package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vendor.fih.hardware.dSar.V1_0.IdSar;
import vendor.fih.hardware.dSar.V1_0.IdSarCallback;


public class CapSensor extends BaseActivity { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
                // get cap sensor thro' service type defined in fqc.xml (support from DG2)
}
                //android/frameworks/base/core/java/android/hardware/Sensor.java


    @Override
    protected void onResume() { /* implementation hidden */ }
            // do nothing
}

    @Override
    protected void onStop() { /* implementation hidden */ }
            // do nothing
}

    private SensorEventListener proximityListener = new SensorEventListener() { /* implementation hidden */ }
        // @Override
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
}

        // @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
}

    // normal case: value == 1 --> close
    // reverse case: value == 0 --> close
    private boolean isSensorClose(int value) { /* implementation hidden */ }
}

    private boolean updateStatus(int value_man, int value_sub) { /* implementation hidden */ }
        if (mState == ST_COVER_RIGHT && isSensorClose(value_man) /* value_man == 1 */) {
        } else if (mState == ST_UNCOVER_RIGHT && !isSensorClose(value_man) /* value_man == 0 */) {
            // test pass if only one cap sensor
}
        } else if (mState == ST_COVER_LEFT && isSensorClose(value_sub) /* value_sub == 1 */) {
        } else if (mState == ST_UNCOVER_LEFT && !isSensorClose(value_man) /* value_sub == 0 */) {

    private boolean updateStatusByChannel(int channel, int value) { /* implementation hidden */ }
        if (mState == ST_COVER_RIGHT && channel == 0 && isSensorClose(value) /* value == 1 */) {
        } else if (mState == ST_UNCOVER_RIGHT && channel == 0 && !isSensorClose(value) /* value == 0 */) {
        } else if (mState == ST_COVER_LEFT && channel == 1 && isSensorClose(value) /* value == 1 */) {
        } else if (mState == ST_UNCOVER_LEFT && channel == 1 && !isSensorClose(value) /* value == 0 */) {
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // DG2 QTI sensors definitions:
            //  #define QTI_SENSOR_TYPE_BASE 33171000
            //  #define QTI_SENSOR_TYPE_SAR (QTI_SENSOR_TYPE_BASE + 5)
            //  #define QTI_SENSOR_STRING_TYPE_SAR "qti.sensor.sar"
            //  #define QTI_SENSOR_TYPE_SAR_2 (QTI_SENSOR_TYPE_BASE + 6)
            //  #define QTI_SENSOR_STRING_TYPE_SAR_2 "qti.sensor.sar2"
}

    private class SarCallback extends IdSarCallback.Stub { /* implementation hidden */ }
}
        // Methods from ::vendor::fih::hardware::dSar::V1_0::IdSarCallback follow.

        @Override
        public void notifyPortStatusChange(int var1) { /* implementation hidden */ }
}

        // var1: channel(0/1)
        // var2: down(1) / up(0)
        // var3: reserve
        @Override
        public void notifyCapSensorEvent(int var1, int var2, int var3) { /* implementation hidden */ }
}

    private void registerCapSensor_hidl() { /* implementation hidden */ }
            proxy = IdSar.getService(true /* retry */);
}
