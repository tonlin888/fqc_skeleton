/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowGSensorOrientationDisable.java                       *
 * CREATED BY  :  @author ke-xin.wang                                      *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC test GSensor Orientation Disable.                          *
 *                                                                         *
 * REFERENCE CODE: QUALCOMM-FQC7630                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/


package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowGSensorOrientationDisable extends BaseActivity{ /* implementation hidden */ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //20130719 oliver Dynamic Layout by LayoutResourceHelper START
        //setContentView(R.layout.sensor);
      //20130719 oliver Dynamic Layout by LayoutResourceHelper END
        //final FQCConfig config = new FQCConfig(this);
//        if(config.getConfigFunctionEnable(FQCXmlParseHandler.FQCSETTING
//                +"_ShowGSensorOrientationDisable_Calibration")){
//            try{
//                String packageName = config.getConfigDataString(FQCXmlParseHandler.FQCSETTING
//                        +"_ShowGSensorOrientationDisable_Calibration_PackageName");
//                String className = config.getConfigDataString(FQCXmlParseHandler.FQCSETTING
//                        +"_ShowGSensorOrientationDisable_Calibration_ClassName");
//                FQCLog.Logv("packageName="+packageName+"className="+className);
//                Intent intent = new Intent();
//                intent.setClassName(packageName, className);
//                startActivityForResult(intent,RESULE_CAB);
//            }catch(Exception e){
//                FQCLog.Loge("ShowECompassCalibrationException"+e.getMessage());
//            }
//        }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

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

  //JUL-2013 oliver For Params flexibility START
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
    //JUL-2013 oliver For Params flexibility END
