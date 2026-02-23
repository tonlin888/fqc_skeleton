package com.evenwell.fqc.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Utility;

public class HeaterTestv7 extends BaseActivity { /* implementation hidden */ }
    // fqc.xml parameters
    //private String mCmdWarmUp = "heater 5 on && accy fan all off";
    //private String mCmdCoolDown = "heater 5 on c && accy fan all on";
    //private String mCmdOff = "heater 5 off && accy fan all off";
	//private String mCmdReadTemp = "cat /sys/class/thermal/thermal_zone3/temp";
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
		//super.onBackPressed();
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    public void onTestTimeout() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // Set Params to Default if failed to Get from fqc.xml
}

	int readTemp() { /* implementation hidden */ }
}
	/* ============================================================ */
	final String[] STATE_NAME = { /* implementation hidden */ }
}

	void runCmd(StringBuilder sb, String cmd) { /* implementation hidden */ }
}

	void nextState() { /* implementation hidden */ }
}

	void handleState() { /* implementation hidden */ }
}









        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
