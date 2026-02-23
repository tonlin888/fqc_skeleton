package com.evenwell.fqc.script;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.script.Command.onResultLisener;
import com.evenwell.fqc.script.service.ScriptService;
import com.evenwell.fqc.utility.Utility;
import com.google.zxing.WriterException;

import java.util.Locale;

public class TestScript extends BaseActivity { /* implementation hidden */ }
    // support general purpose: %R0% ... %R8% and %R9% (keep result)
    public void textOut(String str) { /* implementation hidden */ }
    public String compile(String str) { /* implementation hidden */ }
    public String compile(String str, boolean spc) { /* implementation hidden */ }
        // translate register
}

        // translate macro

                //Log.d(TAG, "compile, macro = " + macro);
                //Log.d(TAG, "compile, exp_str = " + exp_str);
                //Log.d(TAG, "compile, translated = " + translated);

        //Log.d(TAG, "compile, str = " + str + ", translated = " + translated + ", mValue[1] = " + mValue[1]);

    public void hintOutConcat(String str) { /* implementation hidden */ }
}

    public void hintOut(String str) { /* implementation hidden */ }
}

    public void hintOut() { /* implementation hidden */ }
        //Log.d(TAG, "[Script] Hint: " + translated);
}

    public void imageOut(String str) { /* implementation hidden */ }
}


    public void valueOut(int index, String str) { /* implementation hidden */ }
}

	public void logOut(String reason, String info) { /* implementation hidden */ }
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // get simple chinese string from SChinese@fqc.xml
        // support alias test name. User can configure test name.
        // get script from fqc.xml
}

    private void initViews(){ /* implementation hidden */ }
}

    @Override
    public void onResume() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public void onTestTimeout() { /* implementation hidden */ }
}

        // run OffCmd

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // can not access comfig at this funtion because of mTestScriptName no ready
}

    void showUserConfirmDialog(Command gCmd) { /* implementation hidden */ }
                    public void onClick(DialogInterface dialog, int id) { /* implementation hidden */ }
}
                    public void onClick(DialogInterface dialog, int id) { /* implementation hidden */ }
}

    private String getConfigDataString(String str) { /* implementation hidden */ }
        //if (TextUtils.isEmpty(ret)) Log.d(TAG, "Warning: " + mTestScriptName + "." + str + " is empty!");
}

    final String[] EVENT_NAME = { /* implementation hidden */ }


        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}




                    // skip BEGIN-END block

        @Override
        public void onResult(int result) { /* implementation hidden */ }
                    // execute next command
                    // do nothing
}

	public ServiceConnection mConnection = new ServiceConnection() { /* implementation hidden */ }
        public void onServiceConnected(ComponentName className, IBinder service) { /* implementation hidden */ }
        public void onServiceDisconnected(ComponentName className) { /* implementation hidden */ }
}
