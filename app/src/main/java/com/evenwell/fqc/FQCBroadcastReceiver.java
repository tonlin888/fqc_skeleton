/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  FQCBroadcastReceiver.java                                *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/18                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: Receive the secret code and sdcard test result.                *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc;

import com.evenwell.fqc.utility.FQCLog;
import android.net.Uri;
import android.util.Log;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;

public class FQCBroadcastReceiver extends BroadcastReceiver { /* implementation hidden */ }
    // FihTdcCode@20160302 Edwin add to change secret code from 3721 to 372733 {
    // FihTdcCode@20160302 Edwin add to change secret code from 3721 to 372733 }
    // FihTdcCode@20160314 Edwin add new mode 664 for MMI station {
    // FihTdcCode@20160314 Edwin add new mode 664 for MMI station }
    // TonyCYLin, add new mode 3727378 for BFL/ZON/FLC Service Center
    public FQCBroadcastReceiver() { /* implementation hidden */ }
    public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
                    // FihTdcCode@20160314 Edwin add new mode 664 for MMI station {
                    // FihTdcCode@20160314 Edwin add new mode 664 for MMI station }
}
        // push FQC.apk to /system/app/FQC, then factory reset to receive boot complete
        //else if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
        //    Log.d(TAG, "FQC got ACTION_BOOT_COMPLETED");
        //    Intent i = new Intent(Intent.ACTION_MAIN);
        //    i.setClass(context, FQCTestItemListActivity.class);
        //    i.putExtra(OQC_ON, false);
        //    i.putExtra(DEBUG_ON, false);
        //    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //    context.startActivity(i);
        //}
        // ej 20150313 start - for robot
        // ej 20150313 end
