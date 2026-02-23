/*=========================================================================*
 * FIH Taiwan Design Center                                                *
 * FILENAME    :   Mic1ToPcLoop.java                                       *
 * CREATED BY  :  @author OliverKHLee                                      *
 * CREATED DATE:  2013/9/16                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: Test Mic input via PC on the device which have no Audio output *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.AsyncTask;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.AudioFileFunc;
import com.evenwell.fqc.utility.AudioRecordFunc;
import com.evenwell.fqc.utility.ErrorCode;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.LogHelper;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Mic1ToPcLoop extends BaseActivity { /* implementation hidden */ }
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //User instructions.
    private void StartRecordingHandler() { /* implementation hidden */ }
        //User instructions.
        //20131008 APPG2-5287 oliver Modify test flow to make the test flow monotone
//          switch(mFlag){
//          case FLAG_WAV:
//              break;
//          case FLAG_AMR:
//              MediaRecordFunc mRecord_2 = MediaRecordFunc.getInstance();
//              mResult = mRecord_2.startRecordAndFile();
//              break;
//          }
}


    private void StopRecordingHandler() { /* implementation hidden */ }
                //User instructions.
                //20131008 APPG2-5287 oliver Modify test flow to make the test flow monotone
//              switch(mState){
//              case FLAG_WAV:
//                  break;
//              case FLAG_AMR:
//                  MediaRecordFunc mRecord_2 = MediaRecordFunc.getInstance();
//                  mRecord_2.stopRecordAndFile();
//                  break;
//              }
}



     class RecordTask extends AsyncTask<Void, Integer, Void>{ /* implementation hidden */ }
            protected Void doInBackground(Void... arg0) { /* implementation hidden */ }
                    //To determine to continue recording or not
}



            protected void onProgressUpdate(Integer...progress){ /* implementation hidden */ }
                //stateView.setText(progress[0].toString());
}

            protected void onPostExecute(Void result){ /* implementation hidden */ }
}

            protected void onPreExecute(){ /* implementation hidden */ }
}


     class UIHandler extends Handler{ /* implementation hidden */ }
            public void handleMessage(Message msg) { /* implementation hidden */ }
//                      MediaRecordFunc mRecord_2 = MediaRecordFunc.getInstance();
//                      mSize = mRecord_2.getRecordFileSize();
}


    class UIThread implements Runnable { /* implementation hidden */ }
            public void stopThread(){ /* implementation hidden */ }
            public void run() { /* implementation hidden */ }
}





      private BroadcastReceiver mUSBconnectReceiver = new BroadcastReceiver() { /* implementation hidden */ }
            public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
                    //BATTERY_PLUGGED_AC
                    //BATTERY_PLUGGED_USB
                        //BATTERY_PLUGGED_USB
                        //UNPLUGGED
}
                        //BATTERY_PLUGGED_AC




        private void endtest() { /* implementation hidden */ }
}


        public void removeRecording(String FilePath){ /* implementation hidden */ }
}


    @Override
    protected void onResume() { /* implementation hidden */ }
        //Creating file path
        //File fpath = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/download/");
                //Creating Temp .pcm format recordings
                //audioFile = File.createTempFile("FQC_Mic1ToPcTest", ".pcm", fpath);
                // deletes file when the virtual machine terminate
}

            //20131008 APPG2-5287 oliver Modify test flow to make the test flow monotone
            //stopButton = (Button) findViewById(R.id.btStop);

            //20131008 APPG2-5287 oliver Modify test flow to make the test flow monotone

                @Override
                public void onClick(View v) { /* implementation hidden */ }
}
            //20131008 APPG2-5287 oliver Modify test flow to make the test flow monotone
            //stopButton = (Button) findViewById(R.id.btStop);
                @Override
                public void onClick(View v) { /* implementation hidden */ }
}






    @Override
    protected void onDestroy() { /* implementation hidden */ }
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

        protected Integer doInBackground(Integer... cmds) { /* implementation hidden */ }
}


        protected void onProgressUpdate(Integer... progress) { /* implementation hidden */ }
            // setProgressPercent(progress[0]);
}

        protected void onPostExecute(Integer result) { /* implementation hidden */ }
            // showDialog("Downloaded " + result + " bytes");
}


    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
                // Get Configurable Params from fqc.xml Defined Before JUL-2013 (These Params Might be set again in other functions)
                // Get Configurable Params from fqc.xml added After JUL-2013
                // Set Params to Default if failed to Get from fqc.xml
}











