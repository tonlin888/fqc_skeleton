/**
 * ej 20150313
 * This activity is made for robot test.
 * Some requests will run several test items.
 * So, I write this new activity to manage it.
 */

package com.evenwell.fqc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class FQCTestForRobotActivity extends Activity { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // init UI
        // get command
        //
    private void SomeInit() { /* implementation hidden */ }
        // resource
        //
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { /* implementation hidden */ }
        // must be 1001
        //m_tvText.append("Result Code:" + resultCode + "\n");
        //
}
        //
            // test is finish, broadcast result
            //

    private void ProcessCommand() { /* implementation hidden */ }
        // FQCXmlParseHandler in queryTestItems() will  init preference
            // request test item list
}
            //
            //
            // run specific test item(s)
            // trigger the first test. onActivityResult() will handle the rest of the test procedure.

    private ArrayList<String> queryTestItems() { /* implementation hidden */ }
        //
        // get fqc file path
}
        // parse xml
        //
