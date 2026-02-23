/**
 * reference Intel  Emily add
 *
 */

package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HDMIActivity extends BaseActivity implements OnCompletionListener{ /* implementation hidden */ }
    // test case configure variable
    // No "android.intent.action" beginning App-proprietary intent at Android O (CTS)
    // private String mActionT = "android.intent.action.HDMI_AUDIO_PLUG";
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { /* implementation hidden */ }
        // implement BroadcastReceiver onReceive()
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
}


//End of 2011-07-27

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
}

    private void initReceiver(){ /* implementation hidden */ }
}


    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    private void stopAudio() { /* implementation hidden */ }
}

    //2011-07-07
    public void playAudio(){ /* implementation hidden */ }
}


    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public void onCompletion(MediaPlayer arg0) { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
