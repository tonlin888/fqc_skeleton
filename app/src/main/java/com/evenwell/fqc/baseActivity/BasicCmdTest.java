package com.evenwell.fqc.baseActivity;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class BasicCmdTest extends BaseActivity { /* implementation hidden */ }
    // 0: check manually
    // 1: check result by FQC
    // 2: no check
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    public void onTestTimeout() { /* implementation hidden */ }
}

    private void initViews(){ /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // checking point #1: check command + pattern
            // checking point #2: read command + the range of value
}

    final String[] EVENT_NAME = { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    private boolean chk(String str){ /* implementation hidden */ }
}

    private boolean chkData(String str){ /* implementation hidden */ }
}

    private void doCmd() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
}
        // wait until timeout

    private void doRead() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
}
        // wait until timeout

    public void onTestPass() { /* implementation hidden */ }
}
