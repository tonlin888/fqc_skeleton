/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  FQCXmlParseHandler.java                                  *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: FQCXmlParseHandler will parse the xml fqc.xml                  *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;

import com.evenwell.fqc.utility.LogHelper;
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.script.TestScript;
import com.evenwell.fqc.script.ParserHelper;

public class FQCXmlParseHandler extends DefaultHandler { /* implementation hidden */ }
    //2013-AUG TAG
    //20130827 oliver For FQC config value item can tag "value" instead of "name"
    //20130827 oliver Maintain a tagStack for tracing parents
    // disabled element, all child element is diabled, too
}

    public void setBlackList(ArrayList<String> blackList) { /* implementation hidden */ }
}

    @Override
    public void endDocument() throws SAXException { /* implementation hidden */ }
}

    @Override
    public void startDocument() throws SAXException { /* implementation hidden */ }
        //20130827 oliver Maintain a tagStack for tracing parents
        // mPrefsItemEdit.putBoolean("FQC", false);
}

    @Override


        // test script end

        //20130827 oliver Maintain a tagStack for tracing parents



    @Override
        //20130827 oliver Maintain a tagStack for tracing parents


        //Parse title attributes

        // give test script unique name

        // Get the map key, ex. mLocalName = fqcsetting_ShowVoc_SensorId



        // skip disable item, subitem under disable item or blocked item

            // begin to collect test script

                // boolean type config value (ex. <TouchPanelFirmware enable="true">)
                // string type config value (ex. <Path name="/proc/AllHWList/Touch" enable="true"> </Path>)
                    //Can get mMap by getTestItem()

            // ej 20140805 start - put all attributes
            // ej 20140805 end


    @Override
    /**
     * @author JimmyChen at 2011/8/22
     * @return LinkedHashMap<String,String>
     * @param @return
     * @Description: Return all maps
     */
    public LinkedHashMap<String, String> getTestItem(){ /* implementation hidden */ }
}

    /**
     * @author JimmyChen at 2011/8/30
     * @return void
     * @param @param tag
     * @param @param pass
     * @Description: Deprecate fucntion by JimmyChen 1203
     */
    @Deprecated
    public void setFristLunach(){ /* implementation hidden */ }
}

    /**
     * @author JimmyChen at 2011/12/3
     * @return void
     * @param @param path
     * @Description: Deprecate fucntion by JimmyChen 1203
     */
    @Deprecated
    public void setConfigPath(String path){ /* implementation hidden */ }
}

    /**
     * @author JimmyChen at 2011/12/3
     * @return void
     * @param
     * @Description: Clear fqc data
     */
    public void clearFQCConfigData(){ /* implementation hidden */ }
}

    private boolean haveSIM() { /* implementation hidden */ }
}


    public void clearHideItems() { /* implementation hidden */ }
        // filter HideInMMIMode & HideWhenTestALL test case
            // there are MMI and OQC in FQC, and each mode can be Debuggable ot not.
            //   hideInMMI -> hide this test item in mmi mode.
            //   hideInAll -> hide this test item in OQC and FQC mode without debuggable
            //   hideInFQC -> hide this test item in OQC and FQC mode without debuggable
                // remove test case from mMap
}

        // request from factory, hide battery info test at auto test

        // filter SIM test while no SIM card

    public boolean isHideItem(String testName) { /* implementation hidden */ }
}




        // request from factory, hide battery info test at auto test


    // get default language string by resource id
    private String getDefaultString(int resId) { /* implementation hidden */ }
        //Log.d(TAG, "getDefaultString(" + resId + ") = " + result);
}

    private boolean block(String name) { /* implementation hidden */ }
}

    private String getTestName(String str) { /* implementation hidden */ }
}

    private String getTestParams(String str) { /* implementation hidden */ }
            // ex, "fqcsetting_ShowNFC::ExpirationTime"
}

    private boolean isEnable(String value) { /* implementation hidden */ }
}



