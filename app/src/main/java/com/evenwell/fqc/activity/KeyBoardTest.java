package com.evenwell.fqc.activity;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.activity.KeyBoardTest;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.MarkRecentkey;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class KeyBoardTest extends BaseActivity { /* implementation hidden */ }
    /** Key code constant: The counterclockwise action of the Wheel button */
    /** Key code constant: The clockwise action of the Wheel button */
    /** Key code constant: The click action of the Wheel button */
    int[][] mKeyLocation = { /* implementation hidden */ }
    private enum KeyDef { /* implementation hidden */ }
        // virtual key for generic motion event
        // add F6, F7 and F8 for HSP
        // add Action key(F8) for DG2
        // add keys for LP3
        // key for lmr watch, keycode defined by xml
        KeyDef(String c, int k, int v, int p, int o, int s){ /* implementation hidden */ }
        public String toString() { /* implementation hidden */ }
}

    public class TestKey { /* implementation hidden */ }
        public TestKey(KeyDef k, int x, int y, String t) { /* implementation hidden */ }
        public void turnOn(boolean on) { /* implementation hidden */ }
}

        public void keyDown() { /* implementation hidden */ }
}

        public void keyUp() { /* implementation hidden */ }
}

        public boolean isDone() { /* implementation hidden */ }
}

        public boolean isBackKey() { /* implementation hidden */ }
}


    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
                // read key code from xml for KEYCODE_UNKNOWN
}

                // add into test buttons

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) { /* implementation hidden */ }
}

    // FihTdcCode@20151201 Edwin add for FAG HW key test
    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent event) { /* implementation hidden */ }
}

    @Override

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
                // minimum interval (ms) between two key events
                // Set Params to Default if failed to Get from fqc.xml
}


    private boolean allDone() { /* implementation hidden */ }
}

    // main function to handle key event,
    // speical case for back key. popup test result confirm dialog when :
    //   1) back key not in test list, or
    //   2) back key in test list and click twice
    private void runIt(int event, int code) { /* implementation hidden */ }
        // minimum time interval between key event
}

            // we can not check minimum time interval to switch key
            // because it will keep send key event

            // test key
            // not test key
