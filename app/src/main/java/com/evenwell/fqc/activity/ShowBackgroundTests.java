// ej 20140317
package com.evenwell.fqc.activity;


import java.util.ArrayList; // FihtdcCode@20150602 YiYu add for SIM2/SD Combo
import java.util.List;
import java.util.Map;
import java.util.Timer;

import com.evenwell.fqc.FQCApplication;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.activity.AutoTestController.TestStatus; // FihtdcCode@20150602 YiYu add for SIM2/SD Combo
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.MarkPowerKey;
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.utility.FQCLog;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


public class ShowBackgroundTests extends Activity { /* implementation hidden */ }
    /* FihtdcCode@20150601 YiYu add for SIM2/SD Combo START */
    /* FihtdcCode@20150601 YiYu add for SIM2/SD Combo END */
    private Handler m_hHandle = new Handler(){ /* implementation hidden */ }
        public void handleMessage(Message msg){ /* implementation hidden */ }
            // display current background tests' status
    private boolean isAllTested() { /* implementation hidden */ }
}


    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //
        //
        //
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
            // stop all tests
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
        // ej 20141211 begin - hide when there is no test item to show
        // ej 20141211 end
}

    class AutoTestAdapter extends BaseAdapter{ /* implementation hidden */ }
        public int getCount() { /* implementation hidden */ }
        public Object getItem(int position) { /* implementation hidden */ }
        public long getItemId(int position) { /* implementation hidden */ }
        public View getView(int position, View convertView, ViewGroup parent) { /* implementation hidden */ }
                    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo START */
                    // FihTdcCode@20160524 Edwin add for TSP: Partial pass for SIM1 combo {
}
                    // FihTdcCode@20160524 Edwin add for TSP: Partial pass for SIM1 combo }
                    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo END */
                    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo START */
                    //switch(atc.GetTestStatus())
                    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo END */
                        /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo START */
                            // FihTdcCode@20160524 Edwin add for TSP: Partial pass for SIM1 combo {
                            // FihTdcCode@20160524 Edwin add for TSP: Partial pass for SIM1 combo }
                        /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo END */

    // ej 20140825 start - for IWP/NX1 who don't have back key
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
}
        // ej 20150513 start - for lmr - change the constant value to xml value
        // ej 20150513 end
        /* FihtdcCode@20150724 YiYu add for block volume up and down START */
        /* FihtdcCode@20150724 YiYu add for block volume up and down END */
    // ej 20140825 end
    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo START */
    private TestStatus getTestState(ArrayList<AutoTestController> list, String name) { /* implementation hidden */ }
}
    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo END */
