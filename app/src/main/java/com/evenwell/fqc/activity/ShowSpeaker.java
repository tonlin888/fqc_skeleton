/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowSpeaker.java                                         *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  20110819                                                 *
 * PURPOSE: For Speaker test of FQC mode.                                  *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import java.io.File;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.media.SoundPool;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Utility;

/**
 * reference QC 7630 EricYang add
 *
 */
public class ShowSpeaker extends BaseActivity { /* implementation hidden */ }
    /** Called when the activity is first created. */
    private void PlayFromSoundPool() { /* implementation hidden */ }
}


    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
            // The audio file currently being tested by SH.
            //mAudio = R.raw.speakerhigh_sh_24; // volume down version, to avoid over driver issue
}

    /* FihtdcCode@20150819 YiYu modify for New test tone START */
    private Uri getSrcRing(){ /* implementation hidden */ }
}
    /* FihtdcCode@20150819 YiYu modify for New test tone END */

    public void playAudio() { /* implementation hidden */ }
            // mMediaPlayer.prepare();
                public void onCompletion(MediaPlayer arg0) { /* implementation hidden */ }
                    // diable loop play
                    //arg0.seekTo(0);
                    //arg0.start();
}


    @Override
    protected void onResume() { /* implementation hidden */ }
}



    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
