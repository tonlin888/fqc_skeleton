/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowGSensorAccelerometer.java                            *
 * CREATED BY  :  @author ke-xin.wang                                      *
 * CREATED DATE:  2011/8/19                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC Show GSensor Accelerometer                                 *
 *                                                                         *
 * REFERENCE CODE: QUALCOMM-FQC7630                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

public class ShowGSensorAccelerometer extends BaseActivity { /* implementation hidden */ }
    // SensorEventListener is new method of cupcake that will take the place of
    // SensorListener
    private SensorEventListener gAccelerometerListener = new SensorEventListener() { /* implementation hidden */ }
        private final float[] mScale = new float[] { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
                // only shows if we think the delta is big enough, in an attempt
                // to detect "serious" moves left/right or up/down
}



        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
            // TODO Auto-generated method stub
}

    private void countDownTimer() { /* implementation hidden */ }
            public void run() { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
                // do nothing


    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
            // Create listener only if sensors do exist
}




        //final FQCConfig config = new FQCConfig(this);
//        if(config.getConfigFunctionEnable(FQCXmlParseHandler.FQCSETTING
//                +"_ShowGSensorAccelerometer_Calibration")){
//            try{
//                String packageName = config.getConfigDataString(FQCXmlParseHandler.FQCSETTING
//                        +"_ShowGSensorAccelerometer_Calibration_PackageName");
//                String className = config.getConfigDataString(FQCXmlParseHandler.FQCSETTING
//                        +"_ShowGSensorAccelerometer_Calibration_ClassName");
//                FQCLog.Logv("packageName="+packageName+"className="+className);
//                Intent intent = new Intent();
//                intent.setClassName(packageName, className);
//                startActivityForResult(intent,RESULE_CAB);
//            }catch(Exception e){
//                FQCLog.Loge("ShowECompassCalibrationException"+e.getMessage());
//            }
//        }

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    @Override
    protected void onStop() { /* implementation hidden */ }
}

    public boolean onTouchEvent(MotionEvent event) { /* implementation hidden */ }
        // could be change to Switch operation
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

  //JUL-2013 oliver For Params flexibility START
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
    //JUL-2013 oliver For Params flexibility END
