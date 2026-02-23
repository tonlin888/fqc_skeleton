/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowGSensorCalibration.java                              *
 * CREATED BY  :  @author ke-xin.wang                                      *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC will Show GSensor Calibration information.                 *
 *                                                                         *
 * REFERENCE CODE: QUALCOMM-FQC7630                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/


package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowGSensorCalibration extends BaseActivity { /* implementation hidden */ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //final FQCConfig config = new FQCConfig(this);
//        if(config.getConfigFunctionEnable(FQCXmlParseHandler.FQCSETTING
//                +"_ShowGSensorCalibration_Calibration")){
//            try{
//                String packageName = config.getConfigDataString(FQCXmlParseHandler.FQCSETTING
//                        +"_ShowGSensorCalibration_Calibration_PackageName");
//                String className = config.getConfigDataString(FQCXmlParseHandler.FQCSETTING
//                        +"_ShowGSensorCalibration_Calibration_ClassName");
//                FQCLog.Logv("packageName="+packageName+"className="+className);
//                Intent intent = new Intent();
//                intent.setClassName(packageName, className);
//                startActivityForResult(intent,RESULE_CAB);
//            }catch(Exception e){
//                FQCLog.Loge("ShowGSensorCalibrationException"+e.getMessage());
//            }
//        }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
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
