/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowBluetoothTest.java                                   *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  20110819                                                 *
 * PURPOSE: For Bluetooth Test of FQC mode.                                *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import java.util.Timer;
import java.util.TimerTask;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.LogHelper;

/**
 * reference QC 7630 EricYang add
 *
 */
// ej 20150430 - change base class for NX1
public class ShowBluetoothTest extends ShapeBaseActivity { /* implementation hidden */ }
    /** Called when the activity is first created. */
    //private boolean sstate;
    // private static final String strPaircancel = "Pair Cancel";
    public enum TestState { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
                // ej 20140701 start
                /*
                mBluetoothAdapter.enable();
                */
                // ej 20140701 end
}

    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { /* implementation hidden */ }
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
            //FIHTDC CarolChen fixed VKY-3396 begin
            //FIHTDC CarolChen fixed VKY-3396 end
}


                    /* BOND_STATE_CHANGED_ACTION from removeBond(). */

    public void startBluetoothEvent() { /* implementation hidden */ }
        // Bluetooth on/off broadcasts
        // Discovery broadcasts
        // filter.addAction(BluetoothDevice.ACTION_DISAPPEARED);
        // filter.addAction(BluetoothDevice.ACTION_NAME_CHANGED);
        // Pairing broadcasts
        // filter.addAction(BluetoothDevice.ACTION_PAIRING_CANCEL);
        // filter.addAction(BluetoothDevice.ACTION_PAIRING_REQUEST);
        // Fine-grained state broadcasts
        // filter.addAction(BluetoothA2dp.ACTION_SINK_STATE_CHANGED);
        // filter.addAction(BluetoothHeadset.ACTION_STATE_CHANGED);
        // filter.addAction(BluetoothDevice.ACTION_CLASS_CHANGED);
        // filter.addAction(BluetoothDevice.ACTION_UUID);
        // Dock event broadcasts
        // filter.addAction(Intent.ACTION_DOCK_EVENT);
}

    public void stopBluetoothEvent() { /* implementation hidden */ }
}

    @Override
    public void onPause() { /* implementation hidden */ }
        //20130812 oliver Cancel objects only onDestroy to avoid interruptions cause test fail
//        if (mBluetoothAdapter != null) {
//            stopBluetoothEvent();
//            if (mBluetoothAdapter.isDiscovering()) {
//                mBluetoothAdapter.cancelDiscovery();
//            }
//            if (t != null) {
//                t.cancel();
//            }
//            if (mState == TestState.ADDING) {
//                mBluetoothAdapter.cancelDiscovery();
//            }
//        }
}



    @Override
    protected void onDestroy() { /* implementation hidden */ }
        //20130812 oliver Cancel objects only onDestroy to avoid interruptions cause test fail
}

    @Override
    protected void onResume() { /* implementation hidden */ }
            // Device does not support Bluetooth
}
        // ej 20140701 start
        /*
        startBluetoothEvent();
        if(mBluetoothAdapter.isEnabled()) {
            mBluetoothAdapter.disable();
        } else {
            mBluetoothAdapter.enable();
        }
        */

        // ej 20140701 end

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //20130719 oliver Dynamic Layout by LayoutResourceHelper START
        //setContentView(R.layout.bluetooth);
        //20130719 oliver Dynamic Layout by LayoutResourceHelper END
}

    public void goNextState(TestState nextState) { /* implementation hidden */ }
}


            //sstate = true;

                public void run() { /* implementation hidden */ }
                        public void run() { /* implementation hidden */ }
                            //sstate = false;
}


            //JimmyChen add auto test mode

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
