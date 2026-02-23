/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  FCI.java                                        *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/19                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: Test item.                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.activity.FQCTestResultDialog.onResultLisener;
import com.evenwell.fqc.activity.view.FCIView;
import com.evenwell.fqc.baseActivity.DensityWrapper;
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.MarkPowerKey;
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.FQCApplication;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.evenwell.fqc.provider.FQCProvider;

public class FCI extends Activity { /* implementation hidden */ }
    protected void attachBaseContext(Context newBase) { /* implementation hidden */ }
}

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // show GPS information, but not used now
}
    private void onCreateForDataBaseConfig() { /* implementation hidden */ }
        //  setContentView(R.layout.testresult);
}

    /**
     * @author RobinPei at 2012/4/11
     * @return void
     * @param
     * @Description: init view when the FQCConfig's subclass is DatabaseConfig.
     * @throws
     */
    private void initView(){ /* implementation hidden */ }
        // GPS info
}

        // test item result list


        // test count








        // FCI View

            // A sim1/sim2 combo can insert SIM or SD at one time.
            // That means only one of them can pass the test.
            // if only one test item fail and the fail item is (sim1 or sd) or (sim2 or sd)
            // we think the test result is still pass.



    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
            // no FCI view, test item result list only
                    // close test item result list and popup "Exit FQC" dialog
}
            // close FCI view and show test item result list
        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    @Override
    protected Dialog onCreateDialog(int id, Bundle args) { /* implementation hidden */ }
                public void onSaveTestResult(int type) { /* implementation hidden */ }
}

    class ViewHolder { /* implementation hidden */ }
}

    class TestResultAdapter extends BaseAdapter { /* implementation hidden */ }
        public TestResultAdapter(Context cxt) { /* implementation hidden */ }
        public int getCount() { /* implementation hidden */ }
        public Object getItem(int position) { /* implementation hidden */ }
        public long getItemId(int position) { /* implementation hidden */ }
        public View getView(int position, View convertView, ViewGroup parent) { /* implementation hidden */ }
            // for SIM1/SD or SIM2/SD Combo
}





    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}
    // ej 20140825 start - for IWP/NX1 who don't have back key
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
}
        // ej 20150513 start - for lmr - change the constant value to xml value
        // ej 20150513 end
        /* FihtdcCode@20150724 YiYu add for block volume up and down START */
        /* FihtdcCode@20150724 YiYu add for block volume up and down END */
    // ej 20140825 end

    String getExportFilename() { /* implementation hidden */ }
}

    @Override

    private boolean isDisableFullScreen() { /* implementation hidden */ }
}
