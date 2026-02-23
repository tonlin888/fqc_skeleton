/* EJ 20140117
 *
 */
package com.evenwell.fqc.activity;

import java.io.File;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;

// FihTdcCode@20150911 Edwin add new feature: assign resource with path {
import android.graphics.drawable.Drawable;
// FihTdcCode@20150911 Edwin add new feature: assign resource with path }

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.Utility;

public class RecNPlay extends BaseActivity { /* implementation hidden */ }
    // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
    // FihTdcCode@20160107 Edwin add new feature: check volume from mic }
    //private static final String RECORD_FOLDER = "/data/data/com.evenwell.fqc/";
    // FihTdcCode@20151117 Edwin add new feature: assign resource with path {
    // FihTdcCode@20151117 Edwin add new feature: assign resource with path }
    // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
    //private static final int SAMPLE_RATE_IN_HZ = 8000;
    //private static final int BUFFER_SIZE = AudioRecord.getMinBufferSize(SAMPLE_RATE_IN_HZ,
    //            AudioFormat.CHANNEL_IN_DEFAULT, AudioFormat.ENCODING_PCM_16BIT);
    // private AudioRecord mAudioRecord = null;
    // private long startTime;
    // private long endTime;
    // FihTdcCode@20160107 Edwin add new feature: check volume from mic }
    private void updateMicStatus() { /* implementation hidden */ }
                // FihTdcCode@20160122 Edwin add to record more information {
                // FihTdcCode@20160122 Edwin add to record more information }
            //mHandler.postDelayed(mUpdateMicStatusTimer, SPACE);
}

    /*public void startRecord() {
        if (mMediaRecorder == null)
            mMediaRecorder = new MediaRecorder();
        try {
            mMediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            mMediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
            mMediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            FQCLog.Logv("=== Record path:"+ getFilesDir() + fileName + " ===");
            mMediaRecorder.setOutputFile(getFilesDir()+fileName);
            mMediaRecorder.setMaxDuration(MAX_LENGTH);
            mMediaRecorder.prepare();
            mMediaRecorder.start();
            startTime = System.currentTimeMillis();
            //updateMicStatus();
            FQCLog.Logv("startTime" + startTime);
        } catch (IllegalStateException e) {
            FQCLog.Logv("call startRecord() failed!IllegalStateException:" + e.getMessage());
        } catch (IOException e) {
            FQCLog.Logv("call startRecord() failed!IOException:" + e.getMessage());
        }
    }

    public void stopRecord() {
        isGetVoiceRun = false;
        FQCLog.Logv("=== stopRecord() ===");
        if (mMediaRecorder == null)
            //return 0L;
            return;

        try {
        endTime = System.currentTimeMillis();
        FQCLog.Logv("endTime" + endTime);

        if(mMediaRecorder!=null)
        {
            mMediaRecorder.stop();
            mMediaRecorder.reset();
            mMediaRecorder.release();
            mMediaRecorder = null;
        }

        FQCLog.Logv("Time" + (endTime - startTime));
        } catch (Exception e){
            FQCLog.Logv("call stopRecord() failed!Exception:" + e.getMessage());
        }
    }*/


    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

        // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
        // FihTdcCode@20160107 Edwin add new feature: check volume from mic }

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
        /*mAudioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,
                SAMPLE_RATE_IN_HZ, AudioFormat.CHANNEL_IN_DEFAULT,
                AudioFormat.ENCODING_PCM_16BIT, BUFFER_SIZE);
        if (mAudioRecord == null) {
            FQCLog.Logv("sound", "mAudioRecord is null!");
        }*/
        // FihTdcCode@20160107 Edwin add new feature: check volume from mic }
}

        /*
        setContentView(R.layout.recnplay);
        m_txtText       = (TextView) findViewById(R.id.txtRecInfo);
        m_btnRecStart   = (Button) findViewById(R.id.btnRecStart);
        m_btnRecStop    = (Button) findViewById(R.id.btnRecStop);
        m_btnPlayStart  = (Button) findViewById(R.id.btnPlayStart);
        m_btnPlayStop   = (Button) findViewById(R.id.btnPlayStop);

        m_btnRecStart.setOnClickListener( listenerClick );
        m_btnRecStop.setOnClickListener( listenerClick );
        m_btnPlayStart.setOnClickListener( listenerClick );
        m_btnPlayStop.setOnClickListener( listenerClick );

        //
        m_btnRecStart.setText("RecStart");
        m_btnRecStop.setText("RecStop");
        m_btnPlayStart.setText("PlayStart");
        m_btnPlayStop.setText("PlayStop");
        */

        /*
        m_txtText = new TextView(this);
        setContentView(m_txtText);
        m_txtText.setTextAppearance(this, R.style.FQCText);
        m_txtText.setText("TBR:" + String.valueOf(m_dTimeB4Record) +
                ";RT:" + String.valueOf(m_dRecordTime) +
                ";TBP:" + String.valueOf(m_dTimeB4Play));
        */

        // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
        // FihTdcCode@20160107 Edwin add new feature: check volume from mic }

    // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
    private final Handler mUiHandler = new Handler(){ /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
    // FihTdcCode@20160107 Edwin add new feature: check volume from mic }






                    // FihTdcCode@20151117 Edwin add new feature: assign resource with path {

                    // FihTdcCode@20151117 Edwin add new feature: assign resource with path }
                    // FihTdcCode@20151117 Edwin add new feature: assign resource with path {


                    // FihTdcCode@20151117 Edwin add new feature: assign resource with path }



            //m_fileRecDir = Environment.getExternalStorageDirectory();
            //m_fileRecDir = new File(RECORD_FOLDER);
            //m_fileRec = File.createTempFile("Kuohae_Audio", ".amr", m_fileRecDir );




        // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
                @Override
                public void run() { /* implementation hidden */ }
}

        // FihTdcCode@20160107 Edwin add new feature: check volume from mic }


        // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
        // FihTdcCode@20160107 Edwin add new feature: check volume from mic }






        // FihTdcCode@20160107 Edwin add to fix force close issue {
        // FihTdcCode@20160107 Edwin add to fix force close issue }

        // 0:b4rec 1:rec 2:b4paly 3:play 4:afterplay
            //m_txtText.setText(getResources().getString(R.string.RecNPlay_Prepare) + String.format("(%.2f s)", dTime));
            //m_txtText.setText(getResources().getString(R.string.microphone_recording_stop) + String.format("(%.2f s)", dTime));
            //m_txtText.setText(getResources().getString(R.string.RecNPlay_Play_Start) + String.format("(%.2f s)", dTime));

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
        // ej 20140805 start
        //return COST_TIME;
        // ej 20140805 end
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

    @Override

    //private Runnable m_rRunnable1 = new Runnable()
    //{
    //    @Override
    //    public void run() {
    //        try
    //        {
    //            Thread.sleep((long)(m_dTimeB4Record * 1000));
    //        }
    //        catch( Exception e )
    //        {}
    //        Message msg1 = new Message();
    //        msg1.what = MSG_REC_START;
    //        m_hdrProc.sendMessage(msg1);
    //        try
    //        {
    //            Thread.sleep((long)(m_dRecordTime * 1000));
    //        }
    //        catch( Exception e )
    //        {}
    //        Message msg2 = new Message();
    //        msg2.what = MSG_REC_STOP;
    //        m_hdrProc.sendMessage(msg2);
    //        try
    //        {
    //            Thread.sleep((long)(m_dTimeB4Play * 1000));
    //        }
    //        catch( Exception e )
    //        {}
    //        Message msg3 = new Message();
    //        msg3.what = MSG_PLAY_START;
    //        m_hdrProc.sendMessage(msg3);
    //        try
    //        {
    //            Thread.sleep((long)(m_dRecordTime * 1000));
    //        }
    //        catch( Exception e )
    //        {}
    //        Message msg4 = new Message();
    //        msg4.what = MSG_PLAY_STOP;
    //        m_hdrProc.sendMessage(msg4);
    //    }
    //};

        @Override
        public void run() { /* implementation hidden */ }
}
                //

    // FihTdcCode@20160107 Edwin add new feature: check volume from mic {
    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    // FihTdcCode@20160107 Edwin add new feature: check volume from mic }

    @Override

    @Override


