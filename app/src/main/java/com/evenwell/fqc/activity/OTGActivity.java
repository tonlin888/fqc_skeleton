/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  OTGActivity.java                                         *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: show list form fqc.xml list.                                   *
 *  reference intel                                                        *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.InputDevice;
import android.widget.ImageView;
import android.widget.TextView;

public class OTGActivity extends BaseActivity { /* implementation hidden */ }
    //private static final boolean DBG = true;
    private final BroadcastReceiver mUsbReceiver = new BroadcastReceiver() { /* implementation hidden */ }
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
            // OTG type should be "1" if received ACTION_USB_DEVICE_ATTACHED
            // OTG type should be "0" if received ACTION_USB_DEVICE_DETACHED
              // skip detached intent if TypeCheck file exist or OTG has not attached
}

                    //mUserInfo.setImageResource(R.drawable.usb_out);

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //Detect if otg device is inserted
}

    @Override
    protected void onResume() { /* implementation hidden */ }
            // register input device listener, no ACTION_USB_DEVICE_ATTACHED at Android Q
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

    private boolean isOtgExist() { /* implementation hidden */ }
          // Query the USB manager since devices might have attached
          // before we added our listener.
}

    private boolean isOtgMouseExist() { /* implementation hidden */ }
}

            @Override
            public void onInputDeviceRemoved(int deviceId) { /* implementation hidden */ }
}

            @Override
            public void onInputDeviceChanged(int deviceId) { /* implementation hidden */ }
}

            @Override
            public void onInputDeviceAdded(int deviceId) { /* implementation hidden */ }
}

    final String[] EVENT_NAME = { /* implementation hidden */ }

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
