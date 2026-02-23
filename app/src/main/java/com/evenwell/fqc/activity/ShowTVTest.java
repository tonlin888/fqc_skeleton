package com.evenwell.fqc.activity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import android.content.Intent;
//import android.os.Bundle;
import android.os.*;
import android.util.Log;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

//Ted Add for FQC
import android.widget.Button;
import android.view.*;
import android.view.View.OnClickListener;

public class ShowTVTest extends BaseActivity implements OnClickListener { /* implementation hidden */ }
    // private boolean bDoColorBar;
    // private static final int MAIN = 0;
    // private static final int FRONT = 1;
    //private int tempRotationValue;
    //private BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
//    private String mDeviceModelName = getDeviceModel();
    //private static int currentPage = 0;
    //private final int SNR_VIEW = 1;
    //FQCConfig mConfig;
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //mConfig = new FQCConfig(getApplicationContext());
        //
        //
        // int nOrientation = getRequestedOrientation();
        // if (mDeviceModelName.equals("AI1D") ||
        // mDeviceModelName.equals("AI1S") || mDeviceModelName.equals("FM6"))
        // {
        // if (nOrientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // else
        // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        // }
        // else
        // {
        // if (nOrientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        // else
        // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // }
//        mDeviceModelName = getDeviceModel();
        // LauncherTV();
    public void onClick(View v) { /* implementation hidden */ }
            //currentPage = SNR_VIEW;
        // default:
        // showDialog(0);
        // break;
}

    @Override
    public void onDestroy() { /* implementation hidden */ }
}

//    private String getDeviceModel() {
//        String devModelStr = null;
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(
//                    "/proc/devmodel"), 256);
//            try {
//                devModelStr = reader.readLine();
//            } finally {
//                reader.close();
//            }
//
//            return devModelStr.toUpperCase();
//        } catch (IOException e) {
//            return "Unavailable";
//        }
//    }

    private void LauncherTV() { /* implementation hidden */ }
//        int nOrientation = getRequestedOrientation();
//        if (mDeviceModelName.equals("AI1D") || mDeviceModelName.equals("AI1S")
//                || mDeviceModelName.equals("FM6")) {
//            if (nOrientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//            else
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//        } else {
//            if (nOrientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//            else
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        }
            // i.putExtra("VGAmode", 1);
}


    private void LauncherShowSNR_BER_Info() { /* implementation hidden */ }
}
        // mTextForShowSnrBerInfo.setVerticalScrollBarEnabled(true);
        // mTextForShowSnrBerInfo.setOnClickListener(this);
            // BufferedReader readerSnrBerInfo = new BufferedReader(new
            // FileReader("/data/SNR_BER.txt"), 256);
                // tempString = SnrBerString.toString();
                // tempString1 = tempString.substring(0,33);
                // tempString = SnrBerString.substr(0,32);
            // SnrBerString = readerSnrBerInfo.toString();
            // mTextForShowSnrBerInfo.setText(R.layout.dtv_showsnrberinfo, );
            // mTextForShowSnrBerInfo.setText(text, type)

        // mTextForShowSnrBerInfo.setText("hello For SNR BER");
        // Intent i = new Intent(Intent.ACTION_MAIN);
        // i.setClassName("com.android.mobiletv.app",
        // "com.android.mobiletv.app.activity.FullScreen");
        // i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        // startActivity (i);

    @Override
    public void onPause() { /* implementation hidden */ }
}

    @Override
    public void onStop() { /* implementation hidden */ }
        // android.os.Process.killProcess(android.os.Process.myPid());
        // ShowTVTest.this.finish();
        // super.onStop();
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

