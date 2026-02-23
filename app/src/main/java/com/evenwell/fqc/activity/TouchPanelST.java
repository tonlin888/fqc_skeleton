package com.evenwell.fqc.activity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

// ej 20150430 - change base class for NX1
public class TouchPanelST extends ShapeBaseActivity { /* implementation hidden */ }
    // FihTdcCode@20160509 Edwin add for TPST to test with binary
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // do heavy work later
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
        // do nothing
}

    protected void setupTest() { /* implementation hidden */ }
                public void run() { /* implementation hidden */ }
}

    protected void tearDown() { /* implementation hidden */ }

    protected void doTest() { /* implementation hidden */ }
        // test method 1, got binary path
        // test method 2, only read path
        // test method 3, got read/write path
        // invalid fqc config!!
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
                            public void run() { /* implementation hidden */ }
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

    private void doBinary() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
}
        // wait until timeout

    private void doReadData() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
}
        // wait until timeout

    private void doWriteData() { /* implementation hidden */ }
                @Override public void run() { /* implementation hidden */ }
}
        // wait until timeout

    private int do_exec_result(String cmd) { /* implementation hidden */ }
            String[] cmds = { /* implementation hidden */ }
}

    private boolean readData() { /* implementation hidden */ }
}

    private boolean writeData() { /* implementation hidden */ }
}

    @Override
    public boolean onTouchEvent(MotionEvent event) { /* implementation hidden */ }
}
