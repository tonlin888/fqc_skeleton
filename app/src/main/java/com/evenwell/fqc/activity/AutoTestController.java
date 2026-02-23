/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  AutoTestController.java                                  *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/11/25                                               *
 *-------------------------------------------------------------------------*
 * PURPOSE: Backgroud test(BT,WIFI,GPS,SD,SIM).                            *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import static android.net.wifi.WifiManager.WIFI_STATE_ENABLED;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.evenwell.fqc.FQCApplication;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.utility.CapManager;
import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.FQCFileCat;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.Utility;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.GnssStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.GpsStatus.Listener;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/*
 *May be this file implement way by Test Service
 *We can share the code by service
 *But now the FQC so stabilize that cannot modify more
 *So we modify after FQC branch SVN
*/
public class AutoTestController { /* implementation hidden */ }
    public static class TestEntry { /* implementation hidden */ }
        public TestEntry(int o, int d) { /* implementation hidden */ }
    public static final HashMap<String, TestEntry> mTestRun = new HashMap<String, TestEntry>() { /* implementation hidden */ }
            // 2020/09/11, EP3 => all project should run touch panel st at foreground
            //put(TOUCH_PANEL_ST, new TestEntry(OPEN_TOUCH_PANEL_ST, 0));
}


    //FIHNJdcCode@20120111 fly.f.ren open thread message and key in fqc.xml begin


    //FIHNJdcCode@20120111 fly.f.ren open thread message  and key in fqc.xml end

    //private static final int BTADDING = 18;

    // ej 20140312 start
    // ej 20140312 end

    // FihTdcCode@20160122 Edwin add to record more information {
    // --- TouchPanelST --- //
    // FihTdcCode@20160509 Edwin add for TPST to test with binary
    // --- ShowExtendedSD --- //
    // --- SIMTestActivity --- //

    //private String mInformation_SIMTA = "";

    // FihTdcCode@20160509 Edwin add for TPST to test with binary
    // FihTdcCode@20160122 Edwin add to record more information }

    //private String connectAPName = null;
    //private SupplicantState mCurrentSupplicantState;

    //private static final int GPS_RETEST = 32;
    // ej 20140331 start
    // ej 20140331 end
    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo START */
    /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo END */
    /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd START */
    /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd END */

    // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
    // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }

    //CAP begin
    private static final int MAX_Event_SUPPORTS =1; /* h2w */
    //CAP end




    //FihtdcCode@20151106 Edwin add for Android M {
    //FihtdcCode@20151106 Edwin add for Android M }

    // ej 20140317 start - for showing background test status
        TS_PARTIAL_PASS, /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo */
    public TestStatus GetTestStatus(){ /* implementation hidden */ }
}
    private void TestPass(){ /* implementation hidden */ }
}
    private void TestFail(){ /* implementation hidden */ }
}
    // ej 20140317 end
    // ej 20140331 start - record self type
    // ej 20140331 end

    // FihTdcCode@20160122 Edwin add to record more information {
    public void MaxSNRSatellites(float SNR) { /* implementation hidden */ }
}
    // FihTdcCode@20160122 Edwin add to record more information }

    public AutoTestController(Context context,int type){ /* implementation hidden */ }
}

    class AutoTest extends Thread { /* implementation hidden */ }
        AutoTest(String n) { /* implementation hidden */ }
        public void setup() { /* implementation hidden */ }
}

        @Override
        public void run() { /* implementation hidden */ }
}

    public static boolean checkSIMState(int s) { /* implementation hidden */ }
}


    public static int getSimState(Context cxt, int slot) { /* implementation hidden */ }
}

    public static String getESimState(Context cxt, int slot) { /* implementation hidden */ }
}

        @Override
        public void run() { /* implementation hidden */ }
}

        @Override
        public void run() { /* implementation hidden */ }
}

        @Override
        public void run() { /* implementation hidden */ }
}

        @Override
        public void run() { /* implementation hidden */ }
}

        @Override
        public void setup() { /* implementation hidden */ }
            // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
}



            // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }





        @Override
        public void run() { /* implementation hidden */ }
}



                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd START */
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd END */

        @Override
        public void run() { /* implementation hidden */ }
}



        @Override
        public void run() { /* implementation hidden */ }
}

        @Override
        public void run() { /* implementation hidden */ }
}

        public void setup() { /* implementation hidden */ }
}


        @Override
        public void run() { /* implementation hidden */ }
}

        @Override
        public void run() { /* implementation hidden */ }
}

    private void setTestResult(int c, long t, String b, String func, boolean pass, boolean a, String r, String i) { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
            if(now>mCurrentTime-1000 /* && now<mCurrentTime+1000 */){
                // FihTdcCode@20160122 Edwin add to record more information {
                // FihTdcCode@20160122 Edwin add to record more information }
                // FihTdcCode@20160122 Edwin add to record more information {
                // FihTdcCode@20160122 Edwin add to record more information }
}

            /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo START */
            /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo END */


                        //mHandler.sendEmptyMessageDelayed(WFFAIL, 500);

                // ej 20140331 start
                    // FihTdcCode@20160122 Edwin add to record more information {
                    // FihTdcCode@20160122 Edwin add to record more information }



                // ej 20140331 end

            // ej 20140312 start
            // ej 20140331 start
            // ej 20140331 end
            /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd START */
            /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd END */

    // FihTdcCode@20160509 Edwin add for TPST to test with binary {
            String[] cmds = { /* implementation hidden */ }
            //p.destroy();
            //result = p.exitValue();
    // FihTdcCode@20160509 Edwin add for TPST to test with binary }

    private long getCostTime(){ /* implementation hidden */ }
}
    //private boolean write_data(){
    //    boolean bResult = false;
    //    try {
    //           File root = Environment.getExternalStorageDirectory();
    //        if (root.canWrite())
    //        {
    //            File testFile = new File(root, "testFile.txt");
    //            FileWriter testFileWriter = new FileWriter(testFile);
    //            BufferedWriter out = new BufferedWriter(testFileWriter);
    //            out.write("this is Test, Say Hello world");
    //            out.close();
    //            bResult = true;
    //        }
    //    } catch (IOException e){
    //        FQCLog.Loge("Could not write_data " + e.getMessage());
    //        //Toast.makeText(getApplicationContext(), "Could not write file " + e.getMessage(), 2000).show();
    //    }
    //    return bResult;
    //}

    //private boolean delete_data(){
    //    boolean bResult = false;
    //    try
    //    {
    //        String storageDirectory = Environment.getExternalStorageDirectory().toString();
    //
    //        File sdcardDir = new File( storageDirectory + "/testFile.txt" );
    //        if (sdcardDir.exists())
    //        {
    //            sdcardDir.delete();
    //            bResult = true;
    //        }
    //    }
    //    catch (Exception e){
    //        FQCLog.Loge("Could not delete_data " + e.getMessage());
    //    }
    //    return bResult;
    //}

    //private boolean read_data()
    //{
    //    boolean bResult = false;
    //    try
    //    {
    //        String storageDirectory = Environment.getExternalStorageDirectory().toString();
    //        Log.i("read_data", "storageDirectory:  " + storageDirectory);
    //        File sdcardDir = new File( storageDirectory + "/testFile.txt" );
    //        if (sdcardDir.exists())
    //        {
    //            bResult = true;
    //        }
    //    }
    //    catch (Exception e)
    //    {
    //        FQCLog.Loge("Could not read_data " + e.getMessage());
    //    }
    //    return bResult;
    //}

    public void goBTNextState(int state) { /* implementation hidden */ }
}

    public void startBluetoothEvent() { /* implementation hidden */ }
        // Bluetooth on/off broadcasts
        // Discovery broadcasts
        // filter.addAction(BluetoothDevice.ACTION_DISAPPEARED);
        // filter.addAction(BluetoothDevice.ACTION_NAME_CHANGED);
        // Pairing broadcasts
        // filter.addAction(BluetoothDevice.ACTION_PAIRING_CANCEL);
        // filter.addAction(BluetoothDevice.ACTION_PAIRING_REQUEST);
        // Fine-grained state broadcasts
        // filter.addAction(BluetoothA2dp.ACTION_SINK_STATE_CHANGED);
        // filter.addAction(BluetoothHeadset.ACTION_STATE_CHANGED);
        // filter.addAction(BluetoothDevice.ACTION_CLASS_CHANGED);
        // filter.addAction(BluetoothDevice.ACTION_UUID);
        // Dock event broadcasts
        // filter.addAction(Intent.ACTION_DOCK_EVENT);
}
    public void setIsCanRetest(boolean isReTest){ /* implementation hidden */ }
}
    private BroadcastReceiver mBTReceiver = new BroadcastReceiver() { /* implementation hidden */ }
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
}
                    /* BOND_STATE_CHANGED_ACTION from removeBond(). */
                    //mHandler.sendEmptyMessage(5);

    public void goWFNextState(int nextState) { /* implementation hidden */ }
}
                //Turn off

    public void startWifiEvent() { /* implementation hidden */ }
}

    public void stopWifiEvent() { /* implementation hidden */ }
}

    private BroadcastReceiver mWIFIReceiver = new BroadcastReceiver() { /* implementation hidden */ }
        public void onReceive(Context context, Intent intent) { /* implementation hidden */ }
}
            //FIHNJdcCode@20111205 JimmyChen fixed TBP.B-3213 begin
            //FIHNJdcCode@20111205 JimmyChen fixed TBP.B-3213 begin
            //FIHNJdcCode@20111205 JimmyChen fixed ITV.B-1273 begin
            // SW2-6-1-connectivity-RH-WiFi-FQC-00*[
                    /*|| action.equals(WifiManager.SUPPLICANT_CONNECTION_CHANGE_ACTION)*/)
            // SW2-6-1-connectivity-RH-WiFi-FQC-00*]
            //FIHNJdcCode@20111205 JimmyChen fixed ITV.B-1273 end

//                if (mWFState != WFSCANNING){
//                      return;
//                }

                                //connectAPName = bestSignalSSID;

                    //FIHNJdcCode@20120107 fly.f.ren added for wifi  final judge condition changed begin
                //FIHNJdcCode@20120107 fly.f.ren added for wifi  final judge condition changed
                //
                //mCurrentSupplicantState = state;

    public static String convertToQuotedString(String string) { /* implementation hidden */ }
}



            //int MaxSatellitesNum = GpsStatusObject.getMaxSatellites();

            // FihTdcCode@20160122 Edwin add to record more information {
            // FihTdcCode@20160122 Edwin add to record more information }


                // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building {
                // FihTdcCode@20151029 Edwin, Yiyu add for NBQ-1242 to refine GPS test inside building }


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
            // FihTdcCode@20160122 Edwin add to record more information {
            // FihTdcCode@20160122 Edwin add to record more information }
}


    private final LocationListener mLocationListener = new LocationListener() { /* implementation hidden */ }
        // @Override
        public void onLocationChanged(Location location) { /* implementation hidden */ }
        // @Override
        public void onProviderDisabled(String provider) { /* implementation hidden */ }
        // @Override
        public void onProviderEnabled(String provider) { /* implementation hidden */ }
        // @Override
        public void onStatusChanged(String provider, int status, Bundle extras) { /* implementation hidden */ }
}
  //FIHNJdcCode@20120107 fly.f.ren added for wifi  final judge condition changed begin
    private void wifiTestFinalStatus(boolean isSuccess) { /* implementation hidden */ }
                // do nothing
                // ej 20140331 start - mark this
                //mHandler.sendEmptyMessage(WFFAIL);
                // ej 20140331 end
}
  //FIHNJdcCode@20120107 fly.f.ren added for wifi  final judge condition changed end

    private void gpsTestFinalStatus(boolean isSuccess) { /* implementation hidden */ }
                //do nothing
                //mHandler.sendEmptyMessage(GPSFAIL);
}

    private void btTestFinalStatus(boolean isSuccess) { /* implementation hidden */ }
                //do nothing
}

    private static Class<?> getTargetClass () throws Exception { /* implementation hidden */ }
}


    private static Object getTargetInstance (Class<?> cls) throws Exception { /* implementation hidden */ }
}


    private boolean readData(){ /* implementation hidden */ }
}

    // ej 20140312 start
    private boolean writeData(String filePath){ /* implementation hidden */ }
}
                //Toast.makeText(this, "WriteData="+"0", Toast.LENGTH_SHORT).show();
    // ej 20140312 end


//        String newName = mEventName;
//        int newState = mEventState;
//        mPrevEevntState = mEventState;







                //Get NEW STATUS
                // if (newState > 0) {
                //     update(newName, mEventState,mPrevEevntState);
                // }
                //Slog.e(TAG, "init --> This kernel does not have SimpObserver support :FileNotFoundException");
                //Slog.e(TAG, "" , e);
    public HashMap<String, String> getGPSInfo(){ /* implementation hidden */ }
}

    private boolean checkPassed(int mEventState){ /* implementation hidden */ }
}
    // ej 20140312 start
            String[] cmds = { /* implementation hidden */ }
    // ej 20140312 end

    /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd */


    /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd */
    /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd */
    /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd */
    /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd START */
    /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd END */
    private Handler m_hEXSD_Handle = new Handler(){ /* implementation hidden */ }
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd START */
                    // FihTdcCode@20160122 Edwin add to record more information {
                    // FihTdcCode@20160122 Edwin add to record more information }
}
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd END */
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd START */
                    // FihTdcCode@20160122 Edwin add to record more information {
                    // FihTdcCode@20160122 Edwin add to record more information }
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd END */
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd START */
                    // FihTdcCode@20160122 Edwin add to record more information {
                    // FihTdcCode@20160122 Edwin add to record more information }
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd END */
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd START */
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd END */
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd START */
                /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd END */
                // FihTdcCode@20160122 Edwin add to record more information {
                // FihTdcCode@20160122 Edwin add to record more information }
                // FihTdcCode@20160122 Edwin add to record more information {
                // FihTdcCode@20160122 Edwin add to record more information }
    /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd */
    private boolean checkSDcard(int type, String path){ /* implementation hidden */ }
}
    /* FihtdcCode@20150626 YiYu modify for Auto test Extended Hdd */
    private boolean isExsitExtraSd(String path){ /* implementation hidden */ }
}
    private final Handler m_hExitHandler = new Handler(){ /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
            /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo START */
            /* FihtdcCode@20150602 YiYu add for SIM2/SD Combo END */
            /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd START */
            /* FihtdcCode@20150626 YiYu add for Auto test Extended Hdd END */
    // ej 20140331 end

    // mapping from FQCItemInformation.java
    private String testTypeToStr(int typ) { /* implementation hidden */ }
}

    // mapping from FQCItemInformation.java
    private String testTypeToClass(int typ) { /* implementation hidden */ }
}

