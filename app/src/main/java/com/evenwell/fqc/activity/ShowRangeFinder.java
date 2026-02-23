/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowProximity.java                                      *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  20110819                                                 *
 * PURPOSE: For Proximity Test of FQC mode.                                *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

/**
 * reference QC 7630 EricYang add
 *
 */
public class ShowRangeFinder extends BaseActivity { /* implementation hidden */ }
    // test case configure variable
    private final Handler mHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
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

    void updateInfo() { /* implementation hidden */ }
}


    // Range Finder Class Definition
    private class RangeFinder { /* implementation hidden */ }
        // for debug only
        //String vals[] = {"BB 8", "?1 C", "9. 4", "4B 0", "3E8", "320", "1F4", "12C"};
        //int idx = 0;
        RangeFinder(String enable, String cmd, String disable) { /* implementation hidden */ }
}

        int read() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
                            // ex, "1C 02". it should not longer than 16 bits
}

            // wait until timeout

        int enable() { /* implementation hidden */ }
}

        int disable() { /* implementation hidden */ }
}
