package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

public class SIMTestActivity extends BaseActivity { /* implementation hidden */ }
    // configure test by subclass
    private void testSim() { /* implementation hidden */ }
                public void run() { /* implementation hidden */ }
}


    private void testESim() { /* implementation hidden */ }
                public void run() { /* implementation hidden */ }
}

    private void doTest() { /* implementation hidden */ }
}


    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
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


    private Handler mHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    private void doOnCmd() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
}
        // wait until timeout

    private void doOffCmd() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
}
        // wait until timeout
