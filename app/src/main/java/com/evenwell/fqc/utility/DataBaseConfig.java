/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  DataBaseConfig.java                                               *
 * CREATED BY  :  @author RobinPei                                              *
 * CREATED DATE:  2012/4/6                                             *
 *-------------------------------------------------------------------------*
 * PURPOSE: This is an example for file header.                            *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/
package com.evenwell.fqc.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.evenwell.fqc.provider.FQCProvider;
import com.evenwell.fqc.FQCApplication;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

public class DataBaseConfig extends FQCConfig { /* implementation hidden */ }
    //private Cursor mCursor = null;
    public DataBaseConfig(Context context) { /* implementation hidden */ }
    public void setTestResult(int count,long time,String backupName,String functionName, boolean pass,boolean isAutoTest) { /* implementation hidden */ }
    // FihTdcCode@20160122 Edwin add to record more information {
        boolean isAutoTest, String failReason, String information) { /* implementation hidden */ }
            // get test count and duration
}



    // FihTdcCode@20160122 Edwin add to record more information }

    public ArrayList<String> getForegroundFailItems() { /* implementation hidden */ }
}

    /**
     * @author RobinPei at 2012/4/14
     * @return ArrayList<Integer>
     * @param @return
     * @Description: get the failed items' id which run in background
     * @throws
     */
    @Override
    public ArrayList<String> getRunInBackGroundFailItemsName() { /* implementation hidden */ }
}

    /**
     * @author RobinPei at 2012/4/6
     * @return cursor
     * @param name
     * @Description: According to the function name ,get its item information
     */
    public Cursor getFQCCursor(String name){ /* implementation hidden */ }
       /* String where = FQCProvider.FQCColumn.COLUMN_NAME_TESTITEM_US_NAME + "=" + "'"+ name +"'"+ " OR "+
                FQCProvider.FQCColumn.COLUMN_NAME_SYSTEM_NAME + "=" + "'"+ name +"'";*/
}

    private Cursor getCursor(String name){ /* implementation hidden */ }
}

    public int getItemTestCount(String name){ /* implementation hidden */ }
     // FihnjdcCode@20121212 FelixTang modify for S1UJ.B-278 begin
}
     // FihnjdcCode@20121212 FelixTang modify for S1UJ.B-278 end
    /**
     * @author RobinPei at 2012/4/6
     * @return void
     * @param count: this item's test times
     * @param time:test time in millisecond
     * @param backupName
     * @param functionName
     * @param pass
     * @Description: insert the item's test information to items table
     */
    // FihTdcCode@20160122 Edwin add to record more information {
    private void insertFQCItem(int count,long time,String backupName,String functionName, boolean pass,boolean isAutoTest, String failReason, String information){ /* implementation hidden */ }
        //20131009 oliver for FQC log debug
}

    // FihTdcCode@20160122 Edwin add to record more information }

    /**
     * @author RobinPei at 2012/4/6
     * @return void
     * @param count: this item's test times
     * @param time:test time in millisecond
     * @param backupName
     * @param functionName
     * @param pass
     * @Description: update the item's test information to items table
     */

    // FihTdcCode@20160122 Edwin add to record more information {
        boolean pass, boolean isAutoTest, String failReason, String information){ /* implementation hidden */ }
}

    // FihTdcCode@20160122 Edwin add to record more information }

    /**
     * @author RobinPei at 2012/4/6
     * @return cursor
     * @Description: get all items information
     */
    private Cursor getAllItemResult(String where){ /* implementation hidden */ }
}

    @Override
    public void clearFQCTestResultData() { /* implementation hidden */ }
}

    @Override
    public Map<String, Boolean> getAllResult() { /* implementation hidden */ }
                // we keep all test item include untest item, no need return untest item here
}

    @Override
    public StringBuffer getAllResult(boolean more) { /* implementation hidden */ }
}



    /**
     * @author RobinPei at 2012/4/6
     * @return void
     * @Description: close the Cursor
     */
    public void closeCursor(Cursor curosr){ /* implementation hidden */ }
}

    // a test item without test count is untest item
    private int getDispCategory(int count, boolean pass) { /* implementation hidden */ }
}
