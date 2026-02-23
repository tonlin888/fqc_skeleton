package com.evenwell.fqc.activity;

import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.util.Log;
import java.io.File;
import java.io.IOException;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.utility.Utility;

import android.os.Handler;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class HandsetMicrophone extends BaseActivity { /* implementation hidden */ }
    public enum TestState { /* implementation hidden */ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}



    private void sleep(int time) { /* implementation hidden */ }
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
        // delete the file

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
        // ej 20140805 start
        //return COST_TIME;
        // ej 20140805 end
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

  //JUL-2013 oliver For Params flexibility START
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
    //JUL-2013 oliver For Params flexibility END
