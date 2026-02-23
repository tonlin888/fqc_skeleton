package com.evenwell.fqc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.XMLReader;

import com.evenwell.fqc.activity.AutoTestController;
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

public class FQCApplication extends Application { /* implementation hidden */ }
    public void onCreate() { /* implementation hidden */ }
        // add code here
    /**
     * @author JimmyChen at 2011/11/26
     * @return void
     * @param
     * @Description: Begin paese data by FQCXmlParseHandler
     */
    public void parseXMLData() { /* implementation hidden */ }
                // append ro.boot.hardware.sku
                // SX4, judge the number of camera base on RAM size (ex, SAMSUNG UFS 64GB, 64G is 2 cameras, 128GB is 3 cameras)
                    String getRamInfoCmd = "str=`cat /proc/AllHWList/ufsinfo`;arr=($str);echo ${ /* implementation hidden */ }
}

    public boolean waitingSoundReady() { /* implementation hidden */ }
}

    private String check_xml(String xml_path, String info) { /* implementation hidden */ }
}

    /* ----------------------------------------------
      fqc.xml Search order:
            1. system property: `fqc.xmlpath`
            2. system property: `vendor.fqc.xmlpath`
            3. default path (/system/etc/fqc.xml)
            4. vendor default paths (/vendor/etc/fqc.xml)
            5. /sdcard/fqc.xml
            6. built in fqc.xml
    -------------------------------------------------- */
    private String getXmlPath() { /* implementation hidden */ }
            // get fqc.xml file path form CDA or pref
}
          // KAD, append fqc.xml with on local.


    private ArrayList<String> getBlackList() { /* implementation hidden */ }
        String[] candidate = { /* implementation hidden */ }
}



    private void initLayoutResourceHelper(){ /* implementation hidden */ }
}

    public String getTestParams(final String name) { /* implementation hidden */ }
}
