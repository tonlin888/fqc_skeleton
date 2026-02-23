package com.evenwell.fqc.activity;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager; // 20151020 Edwin add - keep screen on
import android.widget.ImageView;
import android.widget.TextView;

import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;

public class Ecompasscalibration extends Activity implements SensorEventListener{ /* implementation hidden */ }
    //private int tempLightSensorValue;
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //FIHNJdcCode@20120209 fly.f.ren modified   for TNQ.B-3027 end
            //20130719 oliver Dynamic Layout by LayoutResourceHelper START
              //setContentView(R.layout.ecompass_tinq);
            //20130719 oliver Dynamic Layout by LayoutResourceHelper END
            //20130719 oliver Dynamic Layout by LayoutResourceHelper START
              //setContentView(R.layout.ecompassca);
            //20130719 oliver Dynamic Layout by LayoutResourceHelper END
        //FIHNJdcCode@20120209 fly.f.ren modified   for TNQ.B-3027 end
}

    public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
            // ej 20150521 start - for accuracy
            //if (mMagAccuracy == 3)
            // FihTdcCode@20150924 Edwin add to monitor e-compass calibration issue {
            // FihTdcCode@20150924 Edwin add to monitor e-compass calibration issue }
                //Log.d(TAG, "Text = " + testText);

    public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
                //openMessageBox("Calibration_Finish");

    @Override
    protected void onPause() { /* implementation hidden */ }
        // TODO Auto-generated method stub
//          Settings.System.putInt(getContentResolver(), Settings.System.LIGHT_SENSOR, tempLightSensorValue);
}

    @Override
    protected void onResume() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}

//          tempLightSensorValue = Settings.System.getInt(getContentResolver(), Settings.System.LIGHT_SENSOR);
//          Settings.System.putInt(getContentResolver(), Settings.System.LIGHT_SENSOR, 0);

    /*method for replace image begin*/




    /*method for replace image end*/
  //FIHNJdcCode@20120209 fly.f.ren added for TNQ.B-3027 begin
    private int onScreenHeightPx(){ /* implementation hidden */ }
}
    //FIHNJdcCode@20120209 fly.f.ren added   for TNQ.B-3027 end

    // ej 20140825 start - for IWP/NX1/LMR who don't have back key
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
}
        // ej 20150513 start - for lmr - change the constant value to xml value
        // ej 20150513 end
        /* FihtdcCode@20150724 YiYu add for block volume up and down START */
        /* FihtdcCode@20150724 YiYu add for block volume up and down END */
    // ej 20140825 end
