package com.evenwell.fqc.activity;

import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Utility;

import android.os.Handler;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class ShowMicrophone extends BaseActivity { /* implementation hidden */ }
    //private final String RECORD_FILE
    //    = "/data/data/com.evenwell.fqc/" + getClass().getSimpleName() + ".amr";
    public enum TestState { /* implementation hidden */ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
            // default: check headset
}

    //FihnjdcCode@20120410 JimmyChen fixed GOXI.B-2456 begin
    /*
     * Make sure we're not recording music playing in the background, ask
     * the MediaPlaybackService to pause playback.
     */
    private void stopAudioPlayback() { /* implementation hidden */ }
        // Shamelessly copied from MediaPlaybackService.java, which
        // should be public, but isn't.
}
    //FihnjdcCode@20120410 JimmyChen fixed GOXI.B-2456 end

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}



    private void sleep(int time) { /* implementation hidden */ }
}

    private String getFormatTime(long time) { /* implementation hidden */ }
}

    public void goNextState(TestState nextState) { /* implementation hidden */ }
}

    private void playAudio() { /* implementation hidden */ }
}
        // File SDCardpath = Environment.getExternalStorageDirectory();
                // mMediaPlayer.reset();

                            @Override
                            public void onCompletion(MediaPlayer mp) { /* implementation hidden */ }
}

    private void stopRecorder() { /* implementation hidden */ }
}

    private void recording() { /* implementation hidden */ }
        // String fileName = "record.amr";
            // File SDCardpath = Environment.getExternalStorageDirectory();
            // File myDataPath = new File( SDCardpath.getAbsolutePath() +
            // "/recorder" );
            // if( !myDataPath.exists() ) myDataPath.mkdirs();
}

    private void onTest() { /* implementation hidden */ }
}

    private void checkHeadset() { /* implementation hidden */ }
}

    public void registerHeadsetListener() { /* implementation hidden */ }
                public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
                        // Listen for ACTION_HEADSET_PLUG broadcasts.
}

    final Runnable mHeadsetPluginHandler = new Runnable() { /* implementation hidden */ }
        public void run() { /* implementation hidden */ }
            /* Update the UI based on the state change of the headset/antenna */
}

    boolean isHeadsetPlugged() { /* implementation hidden */ }
}

    @Override
    protected void onStop() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    private void deleteFile(){ /* implementation hidden */ }
        // delete the file
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // Set Params to Default if failed to Get from fqc.xml
}

    private boolean isDeviceConnected() { /* implementation hidden */ }
}
