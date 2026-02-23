/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowEarphone.java                                      *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  2009                                                     *
 * PURPOSE: For Earphone Test of FQC mode.                                 *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.Utility;

public class ShowEarphone extends BaseActivity { /* implementation hidden */ }
    //20130723 OliverKHLee MG2.B-429 Reopen due for MTK platform for MG2 Sound will play back via Speaker but not Earphone.
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //20130723 OliverKHLee MG2.B-429 Re-enable due for MTK platform for MG2 Sound will play back via Speaker but not Earphone. START
        //20130527 OliverKHLee MG2.B-429 for MG2 Sound will play back via Speaker but not Earphone, Skip the useless function call.
            //20131107 oliver MG2.B-3058 Fix AsyncTask Delay for MG2 START
             //new DelayPlayAsyncTask().execute(this);
            //20131107 oliver MG2.B-3058 Fix AsyncTask Delay for MG2 END
        //20130723 OliverKHLee MG2.B-429 Re-enable due for MTK platform for MG2 Sound will play back via Speaker but not Earphone. END
}

    /* FihtdcCode@20150819 YiYu modify for New test tone START */
    private Uri getSrcRing() { /* implementation hidden */ }
}
    /* FihtdcCode@20150819 YiYu modify for New test tone END */

    public void playAudio() { /* implementation hidden */ }
            // FihTdcCode@20151209 Edwin add for FAOM-1576 Sound of receiver is too low. {
            // FihTdcCode@20151209 Edwin add for FAOM-1576 Sound of receiver is too low. }
            // FihTdcCode@20151209 Edwin add for FAOM-1195: Make sure to play completely {
            // FihTdcCode@20151209 Edwin add for FAOM-1195: Make sure to play completely }
                public void onCompletion(MediaPlayer arg0) { /* implementation hidden */ }
                    // diable loop play
                    //arg0.seekTo(0);
                    //arg0.start();
}


    private String getFormatTime(long time) { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
        // ej 20140925 start - for test
}
        // ej 20140925 end
      //20130723 OliverKHLee MG2.B-429 Re-enable due for MTK platform for MG2 Sound will play back via Speaker but not Earphone. START
      //20130723 OliverKHLee MG2.B-429 Re-enable due for MTK platform for MG2 Sound will play back via Speaker but not Earphone. END

    @Override
    protected void onPause() { /* implementation hidden */ }
}
        // ej 20140925 start
        // ej 20140925 end

    @Override
    public void onBackPressed() { /* implementation hidden */ }
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

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

    //20130723 oliver Move Delay play function to AsyncTask START
        protected Boolean doInBackground(Context... _context) { /* implementation hidden */ }
}

        protected void onProgressUpdate(Integer... progress) { /* implementation hidden */ }
            // setProgressPercent(progress[0]);
}

        protected void onPostExecute(Boolean result) { /* implementation hidden */ }
}
    //20130723 oliver Move Delay play function to AsyncTask START
