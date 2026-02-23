package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowFlickerSensor extends BaseActivity { /* implementation hidden */ }
    // IR(2)/RED(3)/GREEN(4)/BLUE(5)/UV(6)/CLR
    private int[] mMins = { /* implementation hidden */ }
    private int[] mMaxs = { /* implementation hidden */ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onPause() { /* implementation hidden */ }
    private void initViews(){ /* implementation hidden */ }
    public int getTestElapsedTime() { /* implementation hidden */ }
    public int getTestMode() { /* implementation hidden */ }
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // IR(2)/RED(3)/GREEN(4)/BLUE(5)/UV(6)/CLR
}


    private final String[] STATUS_NAMES = { /* implementation hidden */ }

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
                //// debug code
                //result = "Red:0x0000939F\n"
                //        + "Green:0x0000212A\n"
                //        + "Blue:0x00000A81\n"
                //        + "IR:0x0000780B\n"
                //        + "UV:0x00000D74\n"
                //        + "CLR:0x000193B9\n"
                //        + "Error Message= Non\n"
                //        + "API status=OK\n";
}




    private int chk(String str) { /* implementation hidden */ }
        int[] s = { /* implementation hidden */ }
        int[] v = { /* implementation hidden */ }
            // IR(2)/RED(3)/GREEN(4)/BLUE(5)/UV(6)/CLR
}




    private void updateUi(String str, int event) { /* implementation hidden */ }
        // Ex: \nStart Capture Mode for ALS - VD6281_Mode_Als_Synchronous\nIR:0x00000D33\nRed:0x00000B95\nGreen:0x00000C05\nBlue:0x00000B1A\nUV:0x00000C51\n
}



    private boolean readSensorId(){ /* implementation hidden */ }
}
