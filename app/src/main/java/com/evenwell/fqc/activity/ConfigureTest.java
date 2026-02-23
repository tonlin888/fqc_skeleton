package com.evenwell.fqc.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.evenwell.fqc.FQCApplication;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.os.VibrationEffect;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ConfigureTest extends BaseActivity implements AdapterView.OnItemSelectedListener { /* implementation hidden */ }
    // ui components
    final int[] TEXT_VIEWS = { /* implementation hidden */ }
    final int[] SPINNERS = { /* implementation hidden */ }
    // config variable
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // keep local xmlsettigns
                // clear the status of component
}

    // data: "1,2,3"
    private void init_data(Spinner s, int idx, String data) { /* implementation hidden */ }
        // build selection list
}

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        android.R.layout.simple_spinner_item, arraySpinner);


        // sync current settings


    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) { /* implementation hidden */ }
}



    @Override
    public void onNothingSelected(AdapterView<?> parent) { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public void finishTest(int type) { /* implementation hidden */ }
        // update settings file after test pass
}

    private String get_xml_settings(int idx) { /* implementation hidden */ }
}

    private String set_xml_settings(int idx, String data) { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}

