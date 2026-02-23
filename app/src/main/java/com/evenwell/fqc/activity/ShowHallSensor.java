/*=========================================================================*
 * FIH NJDC Design Center                                                  *
 * FILENAME    :  ShowHallSensor.java                                      *
 * CREATED BY  :  Prince                                                   *
 * CREATED DATE:  20110818                                                 *
 * PURPOSE: For Hall Sensor test of FQC mode.                              *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import android.os.Bundle;
import android.os.FileObserver;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;

import java.io.File;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;

public class ShowHallSensor extends BaseActivity{ /* implementation hidden */ }
    // test case configure variable
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    private void parseFile() { /* implementation hidden */ }
            // update status
}

    private class MyFileObserver extends FileObserver { /* implementation hidden */ }
        public MyFileObserver(String path) { /* implementation hidden */ }
        public MyFileObserver(String path, int mask) { /* implementation hidden */ }
        public void onEvent(int event, String path) { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
            // exception
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    private Handler mHandler = new Handler(){ /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
