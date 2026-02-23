/*=========================================================================*
 * FIH Taiwan Design Center                                                                                                                                    *
 * FILENAME    :  ShowIRTest.java                                                                                                                             *
 * CREATED BY  :  EdwinLYTsai                                                                                                                                 *
 * CREATED DATE:  20160429                                                                                                                                   *
 * PURPOSE: For IR Test of FQC mode.                                                                                                                       *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class ShowIRTest extends BaseActivity { /* implementation hidden */ }
    //private String IRCode = "38000,9008,4496,560,1680,560,1680,560,560,560,560,560,560,560,560,560,560,560,1680,560,560,560,560,560,1680,560,560,560,1680,560,1680,560,1680,560,1680,560,1680,560,1680,560,1680,560,560,560,1680,560,560,560,560,560,560,560,560,560,560,560,560,560,1680,560,560,560,1680,560,1680,560,1680,560,40000,";
    //private String IRHexCode = "0000 006d 0022 0002 0156 00aa 0016 0016 0016 0016 0016 003f 0016 003f 0016 0016 0016 003f 0016 0016 0016 003f 0016 003f 0016 003f 0016 0016 0016 0016 0016 003f 0016 0016 0016 003f 0016 0016 0016 0016 0016 003f 0016 0016 0016 0016 0016 0016 0016 0016 0016 0016 0016 0016 0016 003f 0016 0016 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 05e9 0156 0055 0016 0e3c";
    // Panasonic HDTV: on
    //Ref:
    //http://files.remotecentral.com/library/3-1/panasonic/hdtv/power_control/index.html
    //http://www.remotecentral.com/cgi-bin/codes/panasonic/page-2/
    /*private String IRHexCode = "0000 0071 0000 0032 0080 003f 0010 0010 0010 0030
                                  0010 0010 0010 0010 0010 0010 0010 0010 0010 0010
                                  0010 0010 0010 0010 0010 0010 0010 0010 0010 0010
                                  0010 0010 0010 0030 0010 0010 0010 0010 0010 0010
                                  0010 0010 0010 0010 0010 0010 0010 0010 0010 0010
                                  0010 0010 0010 0030 0010 0010 0010 0010 0010 0010
                                  0010 0010 0010 0010 0010 0010 0010 0010 0010 0010
                                  0010 0010 0010 0030 0010 0030 0010 0030 0010 0030
                                  0010 0030 0010 0010 0010 0010 0010 0010 0010 0030
                                  0010 0030 0010 0030 0010 0030 0010 0030 0010 0010
                                  0010 0030 0010 0a98";*/
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    private void sendIrCode() { /* implementation hidden */ }
}

        //FQCLog.Logv(TAG, "sendIrCode(). pattern.length:"+pattern.length+", pattern[1]:"+pattern[1]+", pattern[pattern.length]"+pattern[pattern.length-1]);

        // pattern is the alternating on/off pattern in microseconds to transmit
        // 560us (pulse) + 1680us (space) means bit 1.
        // 560us (pulse) + 560us (space) means bit 0.
        // default IR code can transmit 0xC12FE817

    // return value:
    private String hex2dec(String irData) { /* implementation hidden */ }
}




    private String count2duration(String countPattern) { /* implementation hidden */ }
}


    private void sendIrCodeTimer() { /* implementation hidden */ }
            public void run() { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
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
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected int getCoundDownTime() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
