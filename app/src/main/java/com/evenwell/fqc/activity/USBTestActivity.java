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

import android.annotation.UnsupportedAppUsage;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Slog;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.UEventObserver;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.LayoutResourceHelper;

// FihTdcCode@20150911 Edwin add new feature: assign resource with path {
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.HashMap;

// ej 20150430 - change base class for NX1
public class USBTestActivity extends ShapeBaseActivity { /* implementation hidden */ }
    private BroadcastReceiver mUSBconnectReceiver = new BroadcastReceiver() { /* implementation hidden */ }
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
            // we only update usb state by ACTION_USB_STATE or ACTION_BATTERY_CHANGED
}
    /*
    * Listens for uevent messages from the kernel to monitor the USB state
    */
    private final class UsbUEventObserver extends UEventObserver { /* implementation hidden */ }
        public void onUEvent(UEventObserver.UEvent event) { /* implementation hidden */ }
}

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // Watch for USB configuration changes
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    private void setMode(int mode) { /* implementation hidden */ }
}

    private int getMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}



    private Handler mHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    private void initViews() { /* implementation hidden */ }
}

    private void onUsbState(Intent intent) { /* implementation hidden */ }
}


            // test pass if we got uevent connect and disconnect
            // test pass if we got intent connect and disconnect





