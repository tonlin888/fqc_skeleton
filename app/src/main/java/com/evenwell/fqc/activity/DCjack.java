/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  USBTestActivity.java                                     *
 * CREATED BY  :  @author An-Ming.Wang                                     *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQC will use it to test USB.                                   *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.R;

public class DCjack extends BaseActivity { /* implementation hidden */ }
    private BroadcastReceiver mUSBconnectReceiver = new BroadcastReceiver() { /* implementation hidden */ }
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
                //BATTERY_PLUGGED_AC
                //BATTERY_PLUGGED_USB
                        //notify remove usb
}

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
        // there are two Action in this activity
//        mIntentFilter.addAction(Intent.ACTION_UMS_CONNECTED);
//        mIntentFilter.addAction(Intent.ACTION_UMS_DISCONNECTED);
//        mIntentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
//        mIntentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);
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
