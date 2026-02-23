/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowBrightness.java                                      *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  20110819                                                 *
 * PURPOSE: For Brightness Test of FQC mode.                               *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;

public class ShowBrightness extends BaseActivity { /* implementation hidden */ }
    // test case configure variable
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
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

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    @Override
    public void onTestTimeout() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
                // Set Params to Default if failed to Get from fqc.xml
}

    // State

    // State Dispatch Events

    public void enterState() { /* implementation hidden */ }
                // set manual brightness mode for test
}
                // set brightness


                // restore brightness mode and level

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
                    // pass through
}

    private void setBrightness(int brightness) { /* implementation hidden */ }
}
