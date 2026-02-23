package com.evenwell.fqc.activity;

import java.nio.charset.Charset;
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
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.baseActivity.BaseActivity;

public class ShowNFCCard extends BaseActivity{ /* implementation hidden */ }
    // to do find way to only enable write button when a writable NFC tag is discovered
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onPause() { /* implementation hidden */ }
}

    protected void onResume() { /* implementation hidden */ }
}

    private void findViews() { /* implementation hidden */ }
        //mImg.setImageResource(R.drawable.nfc_checking);
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
