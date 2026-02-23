/*=========================================================================*
 * FIH Taiwan Design Center                                                *
 * FILENAME    :  ShowExtendedSD.java                                      *
 * CREATED BY  :  Prince                                                   *
 * CREATED DATE:  20110818                                                 *
 * PURPOSE: SD card operation of FQC mode.
 * Reference Nvidia Code                                                   *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.storage.StorageManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.utility.LayoutResourceHelper;

import android.util.Log;


public class ShowExtendedSD extends BaseActivity{ /* implementation hidden */ }
    final String[] EVENT_NAME = { /* implementation hidden */ }
            // check write file to sd card
}


    private void initViews() { /* implementation hidden */ }
}

    // ej 20140320 start
    private boolean checkInSDcard() { /* implementation hidden */ }
}



    private boolean write_data() { /* implementation hidden */ }
            // Get the directory for the user's public pictures directory.
}

    private boolean read_data() { /* implementation hidden */ }
}

    private boolean delete_data() { /* implementation hidden */ }
}

    private Handler m_hHandle = new Handler() { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
    // ej 20140320 end

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
