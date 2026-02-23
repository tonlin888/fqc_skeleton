package com.evenwell.fqc.activity;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Random;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.TextRecord;
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.baseActivity.BaseActivity;

public class ShowNFC extends BaseActivity implements OnClickListener{ /* implementation hidden */ }
    // to do find way to only enable write button when a writable NFC tag is discovered
    //private  TextView  textResult2;
    //private  boolean   isRead = false;
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //randInt.setSeed(17011701);
        //resolveIntent(getIntent());
}

    @Override
    protected void onDestroy() { /* implementation hidden */ }
}

        @Override
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
}

    protected void onPause() { /* implementation hidden */ }
}

    protected void onResume() { /* implementation hidden */ }
}


            //PendingIntent intent = PendingIntent.getActivity(this, 0,
            //    new Intent(this, getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), PendingIntent.FLAG_IMMUTABLE);



    private void findViews() { /* implementation hidden */ }
}

    // listen for button clicks
    private void setListeners() { /* implementation hidden */ }
}

    public void onClick(View v) { /* implementation hidden */ }
        //emily add try catch
                    //textResult.setText("Writing...");
                    //generate a random number for writing test
                    //Get a random number to write
}



                //buttonNFCWriteResult.setBackgroundColor(0xFF00FF00);
                //buttonNFCWriteResult.setText("FAIL");
    void resolveIntent(Intent intent) { /* implementation hidden */ }
            // parse the intent
                // read NFC Tag
}
                    // unknown Tag type


                //Get the tag from the Intent for later writing operation

                // get the Ndef (TagTechnology) from the tag

                // setup the views
                        // convert ByteArray data into HEX format
                //textResult.setText("Unknown intent:"+ intent);


    private boolean parseMessage(NdefMessage newMsg){ /* implementation hidden */ }
}

    private void writeTag() { /* implementation hidden */ }
}


            public void run() { /* implementation hidden */ }
                //textResult2  = (TextView) findViewById(R.id.NFC_RESULT);
                        // connect I/O
                        // check for connection
                                //textResult2.setText("Unable to connect to tag");
}

                    // construct the NdefMessage

                        // write the NdefMessage

                        // close I/O
                    //textResult2.append("Writing is completed");


 // create a new NdefRecord
    private NdefRecord newTextRecord(String text) { /* implementation hidden */ }
}

    @Override
    public void onNewIntent(Intent intent) { /* implementation hidden */ }
                public void run() { /* implementation hidden */ }
}
//        setIntent(intent);
//        //if (isRead) {
//            resolveIntent(intent);
//        //}

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

