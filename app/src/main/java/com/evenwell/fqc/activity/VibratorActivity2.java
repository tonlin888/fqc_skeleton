package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings;
import android.widget.TextView;
import android.widget.Toast;

/**
 * reference QC 7630  Emily add
 *
 */
// ej 20150430 - change base class for NX1
public class VibratorActivity2 extends ShapeBaseActivity { /* implementation hidden */ }
    private static final int COST_TIME = 4000; // FihTdcCode@20151020 Edwin:FH2-4193, popup dialog before 3rd vibration { /* implementation hidden */ }
            /*vibrateTime[0] = 500; //Bug fixed APPG2-2170 Gary chen 2013/04/17
            vibrateTime[1] = 300;
            vibrateTime[2] = 1000;
            vibrateTime[3] = 300;
            vibrateTime[4] = 1000;
            vibrateTime[5] = 300;*/
}
        //3 is repeat times, not to over vc.getVibrateTime().lengthm, so strange
    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // TODO Auto-generated method stub
    //  20130726 Create a  layout for Vibrator by GaryChen begin
//        vibrateText = new TextView(this);
//        vibrateText.setTextAppearance(this, R.style.FQCText);
//        setContentView(vibrateText);
        //setContentView(R.layout.vibrator);
    //  20130726 Create a  layout for Vibrator by GaryChen end
        // disable vibrate on touch
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
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

