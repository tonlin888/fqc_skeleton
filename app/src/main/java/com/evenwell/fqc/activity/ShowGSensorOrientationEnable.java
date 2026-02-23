/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowGSensorOrientationEnable.java                        *
 * CREATED BY  :  @author ke-xin.wang                                      *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC test GSensor Orientation Enable.                           *
 *                                                                         *
 * REFERENCE CODE: QUALCOMM-FQC7630                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/


package com.evenwell.fqc.activity;

import java.util.List;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
// ej 20150430 - change base class for NX1
public class ShowGSensorOrientationEnable extends ShapeBaseActivity { /* implementation hidden */ }
    // ej 20141014 start
    // ej 20141014 end
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}
        // can't not use Sensor.TYPE_ORIENTATION

        //20130719 oliver Dynamic Layout by LayoutResourceHelper START
//        setContentView(R.layout.sensor);
        //20130719 oliver Dynamic Layout by LayoutResourceHelper END


            // Create listener only if sensors do exist

                // added for LT6
                    @Override
                    public void onClick(View v) { /* implementation hidden */ }
                        //do something
}



            // ej 20140917 start
            // ej 20140917 end
            // HenryLJLong 20180319 add
        //final FQCConfig config = new FQCConfig(this);
            // ej 20140221 start
                // ej 20140312 start
                // ej 20140312 end
         // ej 20140221 end

    class OrientationEventListenerImpl implements SensorEventListener { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
            // Calculate the tilt angle.
            // This is the angle between the up vector and the x-y plane (the plane of
            // the screen) in a range of [-90, 90] degrees.
            //   -90 degrees: screen horizontal and facing the ground (overhead)
            //     0 degrees: screen vertical
            //    90 degrees: screen horizontal and facing the sky (on table)
            // If the tilt angle is too close to horizontal then we cannot determine
            // the orientation angle of the screen.
                //fail?
                // Calculate the orientation angle.
                // This is the angle between the x-y projection of the up vector onto
                // the +y-axis, increasing clockwise in a range of [0, 360] degrees.
                    // atan2 returns [-180, 180]; normalize to [0, 360]
                //Get now rotate
}

                // Find the nearest rotation.
//                float nearestRotation = (orientationAngle + 45) / 90;
//                FQCLog.Logv("1nearestRotation="+ nearestRotation);
//                if (nearestRotation == 4) {
//                    nearestRotation = 0;
//                }
//                FQCLog.Logv("nearestRotation="+ nearestRotation);
                // ej 20141030 start show value
                // ej 21041030 end


        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
}

    class OrientationEventListenerForAngleImpl implements SensorEventListener { /* implementation hidden */ }
        public void onSensorChanged(SensorEvent event) { /* implementation hidden */ }
            // Calculate the tilt angle.
            // This is the angle between the up vector and the x-y plane (the plane of
            // the screen) in a range of [-90, 90] degrees.
            //   -90 degrees: screen horizontal and facing the ground (overhead)
            //     0 degrees: screen vertical
            //    90 degrees: screen horizontal and facing the sky (on table)
            // test: calculate each angle
            // x = [arctan(Ax / squr(Ay*Ay + Az*Az))] * RADIANS_TO_DEGREES
            // y = [arctan(Ay / squr(Ax*Ax + Az*Az))] * RADIANS_TO_DEGREES
            // z = [arctan(Az / squr(Ax*Ax + Ay*Ay))] * RADIANS_TO_DEGREES
            // If the tilt angle is too close to horizontal then we cannot determine
            // the orientation angle of the screen.
            if (false /* Math.abs(tiltAngle) > MAX_TILT */) {
                //fail?
                // Calculate the orientation angle.
                // This is the angle between the x-y projection of the up vector onto
                // the +y-axis, increasing clockwise in a range of [0, 360] degrees.
                //int orientationAngle = (int) Math.round(-Math.atan2(-x, y) * RADIANS_TO_DEGREES);
                //Log.d(TAG, "onSensorChanged, Orientation Angle = " + orientationAngle + " (" + mAngle + ", " + mCount + ", " + mTolerance +")");
                //if (orientationAngle < 0) {
                //    // atan2 returns [-180, 180]; normalize to [0, 360]
                //  int orig = orientationAngle;
                //    orientationAngle += 360;
                //  Log.d(TAG, "onSensorChanged, orientationAngle = " + orig + " ---> " + orientationAngle + " (" + mAngle + ", " + mCount + ")");
                //}
                int orientationAngle = tiltAngleX;/*(mAxis == "x") ? tiltAngleX : ((mAxis == "y") ? tiltAngleY : tiltAngleZ);*/ //not work?
                // update displayed information
                //sb.append("orientation angle = " + orientationAngle + "\n");
                        //set new placeAngel
                        //reset count
}
                        //set new placeAngel
                        //reset count


        public void onAccuracyChanged(Sensor sensor, int accuracy) { /* implementation hidden */ }
}

    public void onOrientationChanged(int orientation){ /* implementation hidden */ }
        // ej 20141014 start
            // do nothing
}
        // ej 20141014 end
            //set checked port
            //show land bitmap
                // ej 20140917 start
                // ej 20140917 end

    private void registerSensor(){ /* implementation hidden */ }
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
}


    @Override
    protected void onDestroy() { /* implementation hidden */ }
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
        // TODO Auto-generated method stub
}

