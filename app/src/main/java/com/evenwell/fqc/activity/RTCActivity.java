package com.evenwell.fqc.activity;

import java.util.Timer;
import java.util.TimerTask;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.ShapeBaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
/**
 * reference QC 7630  Emily add
 *
 */
// ej 20150430 - change base class for NX1
public class RTCActivity extends ShapeBaseActivity { /* implementation hidden */ }
    //FihnjdcCode@20120319 JimmyChen fixed TBE.B-1478 begin
    private void updateTime(){ /* implementation hidden */ }
}
    //FihnjdcCode@20120319 JimmyChen fixed TBE.B-1478 end

        // ej 20140917 start
        // ej 20140917 end
        // TonyCYLin@20160608, show RTC is enough
    // ej 20140917 start
    // ej 20140917 end
        @Override
        public void handleMessage(Message msg){ /* implementation hidden */ }
                    // ej 20140917 start
                    // ej 20140917 end
                    // ej 20140917 start
                    // ej 20140917 end
}
              //we don't use BroadcastReceiver to update Clock
//                updateTime();
    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // TODO Auto-generated method stub
        //  20130726 Create a xml for RTC by GaryChen begin
        //setContentView(R.layout.rtc);
//        RTCText = new TextView(this);
//        RTCText.setTextAppearance(this, R.style.FQCText);
//        setContentView(RTCText);
        //20130726 Create a xml for USB RTC by GaryChen end
}
    @Override
    protected void onPause() { /* implementation hidden */ }
        // TODO Auto-generated method stub
        //timer.cancel();
}
    @Override
    protected void onResume() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
        // ej 20140805 start
        //return COST_TIME;
        // ej 20140805 end
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    protected void onDestroy() { /* implementation hidden */ }
}

  //JUL-2013 oliver For Params flexibility START
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
    //JUL-2013 oliver For Params flexibility END
