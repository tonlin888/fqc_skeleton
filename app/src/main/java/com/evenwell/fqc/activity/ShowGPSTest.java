/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowGPSTest.java                                      *
 * CREATED BY  :  Eric Yang                                                *
 * CREATED DATE:  2009                                                     *
 * PURPOSE: For GPS Test of FQC mode.                                      *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import android.content.Context;
import android.location.GpsStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus.Listener;
import android.location.GnssStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import android.widget.TextView;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.LayoutResourceHelper;
import com.evenwell.fqc.utility.Utility;

/**
 * reference QC 7630 EricYang add
 *
 * 20150730 YiYu remove redundant code
 *
 */
public class ShowGPSTest extends BaseActivity { /* implementation hidden */ }
    /** Called when the activity is first created. */
    // FihTdcCode@20160122 Edwin add to record more information {
    // FihTdcCode@20160122 Edwin add to record more information }
    // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
    //private final float mBaseSNR = 35;
    // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }
    /* FihtdcCode@20150730 YiYu modify for refine PASS condition to only GPS START */
    private final LocationListener mLocationListener = new LocationListener() { /* implementation hidden */ }
        public void onLocationChanged(Location arg0) { /* implementation hidden */ }
        public void onProviderDisabled(String arg0) { /* implementation hidden */ }
        public void onProviderEnabled(String arg0) { /* implementation hidden */ }
        public void onStatusChanged(String arg0, int arg1, Bundle arg2) { /* implementation hidden */ }
    /* FihtdcCode@20150730 YiYu modify for refine PASS condition to only GPS END */
    public void onPause() { /* implementation hidden */ }
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
}
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }


        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
            // TODO Auto-generated method stub
                // Edwin add {
                    // register location listener
}

                // Edwin add }

    @Override
    public void onResume() { /* implementation hidden */ }
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
        /*try {
            // register location listener
            mLocMan.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                                           0, // min interval is milliseconds
                                           0, // min distance is meter
                                           mLocationListener);
        } catch(Exception e) {
            FQCLog.Loge("requestLocationUpdates Exception"+e.getMessage());
        }
        try {
            mLocMan.addGpsStatusListener(mStatusListener);
        } catch(Exception e) {
            FQCLog.Loge("addGpsStatusListener Exception"+e.getMessage());
        }*/
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }
}

    @Override
    public void onStop() { /* implementation hidden */ }
}

    @Override
    public void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }
        //20130719 oliver Dynamic Layout by LayoutResourceHelper START
        //setContentView(R.layout.gps_test);
        //20130719 oliver Dynamic Layout by LayoutResourceHelper END
        // Get handler to system location manager
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
        // try to remove GPS aid data
        //Bundle bundle = new Bundle();
        //bundle.putBoolean("all", true);
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }
        // Edwin add: wait for clear
}

    // FihTdcCode@20160122 Edwin add to record more information {
    public void MaxSNRSatellites(float SNR) { /* implementation hidden */ }
}
    // FihTdcCode@20160122 Edwin add to record more information }

    private Listener mStatusListener = new GpsStatus.Listener() { /* implementation hidden */ }
}

            // ej 20140806 start


                    // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
                    // FihTdcCode@20160122 Edwin add to record more information {
                    // FihTdcCode@20160122 Edwin add to record more information }
                    //sb.append("Passed Satellite count(SNR >= " + mThresholdSNR + "):  " + i + "\n");
                    // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }
            // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
                // restore GPS status and show dialog to end test
            // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }

    @Override
    public void onDestroy() { /* implementation hidden */ }
}

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
        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
                // Set Params to Default if failed to Get from fqc.xml
}

        // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }
    //JUL-2013 oliver For Params flexibility END

    /**
     * Used for receiving notifications when GNSS status has changed.
     */
    public class TestGnssStatusCallback extends GnssStatus.Callback { /* implementation hidden */ }
        //// Store list of Satellites including Gnss Band, constellation & SvId
        //private Set<String> mGnssUsedSvStringIds;
        //private final Set<Float> mCarrierFrequencies;
        public TestGnssStatusCallback() { /* implementation hidden */ }
        public void onStarted() { /* implementation hidden */ }
        public void onStopped() { /* implementation hidden */ }
        public void onFirstFix(int ttffMillis) { /* implementation hidden */ }
        public void onSatelliteStatusChanged(GnssStatus status) { /* implementation hidden */ }
}


                // restore GPS status and show dialog to end test
            // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }
