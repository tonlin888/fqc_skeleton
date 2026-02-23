/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowIntHeadTestSharp.java                                *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/22                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: show Int head Test(QC).                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.io.File;
import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.R;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HeadsetLoopbackTest extends BaseActivity{ /* implementation hidden */ }
    //Add ScriptDelay Time between two Test during Run auto FQC by Gary1115 START
    //Add ScriptDelay Time between two Test during Run auto FQC by Gary1115 END
    // IMG_HEADSET_IN, IMG_HEADSET_HOOK, IMG_HEADSET_START
    private String[] mImagePath = { /* implementation hidden */ }
}


            @Override
            public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
}



    @Override
    public boolean onKeyDown(int arg0, KeyEvent arg1) { /* implementation hidden */ }
}


    @Override
    public void run() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}


    @Override
    protected void onResume() { /* implementation hidden */ }
}

    private void lockedBackKey(){ /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
        // release media player
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}


    // adding for USB Audio device


    private boolean isTypeC() { /* implementation hidden */ }
}

    private final Handler mPollingHandler = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
                    //Log.d(TAG, "mPollingHandler, send intent if state changed. "
                    //    + mUsbAudioConnected + ", " + now);
}

    private boolean isDeviceConnected() { /* implementation hidden */ }
            // get usb audio status from virtual file
}

    // media button
    private void registerRemoteControlClient() { /* implementation hidden */ }
}
    private void unregisterRemoteControlClient() { /* implementation hidden */ }
}

    public void playAudio() { /* implementation hidden */ }
            //mMediaPlayer.setVolume(0, 0);
            //mMediaPlayer.pause();
                public void onCompletion(MediaPlayer arg0) { /* implementation hidden */ }
}
    private void setImage(int t) { /* implementation hidden */ }
}
