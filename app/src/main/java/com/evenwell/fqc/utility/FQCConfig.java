/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  FQCConfig.java                                           *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: TestItem will getConfig like FihConfig                         *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;

public abstract class FQCConfig { /* implementation hidden */ }
    // FihTdcCode@20160122 Edwin add to record more information {
    // FihTdcCode@20160122 Edwin add to record more information }
    //private String mPass = "Pass";
    //private String mFail = "Fail";
    public FQCConfig(Context context){ /* implementation hidden */ }
    /**
     * @author JimmyChen at 2011/8/18
     * @return String
     * @param @param tag
     * @param @return data
     * @Description: you can get the config data
     * please add the "_" in tag
     * for example: fqcsetting_Battery_BatteryStatus_PackageName
     */
    public String getConfigDataString(String tag){ /* implementation hidden */ }
    // ej 20140701 start
    /**
     * @param tag string
     * @param default_str default return value
     * @return
     */
    public String getConfigDataString(String tag, String default_str){ /* implementation hidden */ }
    // ej 20140701 end
    // ej 20140805 start
    public int getConfigDataInteger(String tag, int def) { /* implementation hidden */ }
                // do nothing
}
    // ej 20140805 end

    /**
     * @author JimmyChen at 2011/8/19
     * @return boolean
     * @param @param tag
     * @param @return true=enable,otherwise return false
     * @Description: Get you function item is enabled
     */
    public boolean getConfigFunctionEnable(String tag){ /* implementation hidden */ }
        // ej 20140224 start
}
            // FihTdcCode@20160314 Edwin add new mode 664 for MMI station {
            // FihTdcCode@20160314 Edwin add new mode 664 for MMI station }
        // ej 20140224 end

    /**
     * @author JimmyChen at 2011/8/19
     * @return void
     * @param @param functionName
     * @param @param pass
     * @Description: Set Test Result
     */

    // FihTdcCode@20160122 Edwin add to record more information {
    // FihTdcCode@20160122 Edwin add to record more information }



        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}


    public String getConfigDataPath(){ /* implementation hidden */ }
            //Get xml from CDA
}

                //Get <dialing-number-parser-rule-file>
                //Get file path
                //Log.d(TAG, 3+e.getMessage());
        //Log.d(TAG, "filePath="+filePath);

    /**
     * @author JimmyChen at 2011/12/3
     * @return void
     * @param
     * @Description: Clear FQC TestResult Data
     */

    public void saveSingleTestResult(String backupName, boolean pass, String info) { /* implementation hidden */ }
}

    public void saveTestResultTo(String name, boolean details) { /* implementation hidden */ }
}



    public void saveTestResult() { /* implementation hidden */ }
        String[] filenames = { /* implementation hidden */ }
        boolean[] details = { /* implementation hidden */ }
}

    public void removeLog() { /* implementation hidden */ }
        String[] filenames = { /* implementation hidden */ }
}


    public boolean mIsCountDown(){ /* implementation hidden */ }
}
