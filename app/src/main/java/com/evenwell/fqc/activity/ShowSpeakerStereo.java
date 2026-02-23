/*=========================================================================*
 * FIH Taiwan Design Center                                                *
 * FILENAME    :  ShowSpeakerStereo.java                                   *
 * CREATED BY  :  OliverKHLee                                              *
 * CREATED DATE:  20130716                                                 *
 * PURPOSE: For Stereo Speaker test of FQC mode.                           *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import java.lang.reflect.Field;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

/**
 * reference QC 7630 EricYang add
 *
 */
public class ShowSpeakerStereo extends BaseActivity { /* implementation hidden */ }
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    private int getSrcRingL(){ /* implementation hidden */ }
}

    private int getSrcRingR(){ /* implementation hidden */ }
}


    public void playAudio() { /* implementation hidden */ }
            // mMediaPlayer.prepare();
                public void onCompletion(MediaPlayer arg0) { /* implementation hidden */ }
                    // ej 20140801 start
                    //playAudio();
                    // ej 20140801 end
}


    public void playAudio(int _mSrcRingThis,int _mSrcRingNext) { /* implementation hidden */ }
}
            // ej 20140801 start
            // ej 20140801 end
            // mMediaPlayer.prepare();

                @Override
                public void onCompletion(MediaPlayer arg0) { /* implementation hidden */ }
}



    @Override
    protected void onResume() { /* implementation hidden */ }
        //playAudio();
}

    private void DualSpeakerAudioHandler() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
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

  //JUL-2013 oliver For Params flexibility START
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
  //JUL-2013 oliver For Params flexibility END

