package com.evenwell.fqc.utility;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.LinkAddress;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// for setIpConfiguration
import android.net.EthernetManager;
import android.net.IpConfiguration;
import android.net.LinkAddress;
import android.net.StaticIpConfiguration;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.List;

import com.fih.dirtydetector.DirtyDetector;
import com.fih.mtf.Mtf;
import com.fih.mtf.MtfResult;
import com.fih.mtf.MtfPos;
import com.fih.barcoderotation.BarcodeRotation;

import com.evenwell.fqc.FQCService;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;

public class Utility { /* implementation hidden */ }
    // change all font size in a view group
    public static void overrideTextSize(final Context context, final View v, final int size) { /* implementation hidden */ }
}


    // ej 20150416
    public static boolean isPlatform(String name, FQCConfig mConfig) { /* implementation hidden */ }
}

    // ej 20150420
    public static String[] readFileLines(String path, int lines) { /* implementation hidden */ }
}

    private static String getCaller(StackTraceElement[] callStack, int depth) { /* implementation hidden */ }
        // callStack[4] is the caller of the method that called getCallers()
}

    public static String getCallers(final int depth) { /* implementation hidden */ }
}

    public static void setProp(String key, String value) { /* implementation hidden */ }
}

    public static String getProp(String key) { /* implementation hidden */ }
}

    public static String getProp(String key, String def) { /* implementation hidden */ }
            value = (String) (get.invoke(null, new Object[]{ /* implementation hidden */ }
            //Log.d(TAG, "getProp, " + key + " = " + value + ", " + def);
}

    public static int getPropInt(String key, int def) { /* implementation hidden */ }
}


    public static void disableNavKeys(Context cxt) { /* implementation hidden */ }
}

    public static void restoreNavKeys(Context cxt) { /* implementation hidden */ }
}

    public static boolean isResumed(Activity act) { /* implementation hidden */ }
}

    public static void goToSleep(Context cxt, long time) { /* implementation hidden */ }
}

    public static void wakeUp(Context cxt, long time) { /* implementation hidden */ }
}

    public static void setBacklightBrightness(Context cxt, int brightness) { /* implementation hidden */ }
}

    public static void shutdown(Context cxt, String reason) { /* implementation hidden */ }
}

    public static boolean NfcAdapter_enable(NfcAdapter adapter) { /* implementation hidden */ }
}

    public static boolean NfcAdapter_disable(NfcAdapter adapter) { /* implementation hidden */ }
}

    public static String Sensor_getStringType(Sensor sensor) { /* implementation hidden */ }
}

    public static void Notification_setImportance(String pkg) { /* implementation hidden */ }
}

    public static String getExternalSdPath(Context cxt) { /* implementation hidden */ }
                //volumeInfoClazz vol = (volumeInfoClazz)obj;
                if ( 0 /* VolumeInfo.TYPE_PUBLIC*/ == (Integer)m_getType.invoke(obj))
}


    public static boolean isWiredHeadsetOn(AudioManager audioMgr) { /* implementation hidden */ }
}


    public static void setMaximumVolume(Context cxt) { /* implementation hidden */ }
}
        audioManager.setStreamVolume(/*AudioManager.STREAM_FM*/7,
                audioManager.getStreamMaxVolume(7/*AudioManager.STREAM_FM*/),

    public static String dumpStreamVolume(Context cxt) { /* implementation hidden */ }
        int fm = audioManager.getStreamVolume(/*AudioManager.STREAM_FM*/7);
}

    public static String Telephony_getBasebandVersionForPhone(TelephonyManager mgr, int phoneId) { /* implementation hidden */ }
            ret = (String)(getBasebandVersionForPhone.invoke(mgr, new Object[]{ /* implementation hidden */ }
}

    public static boolean isTopProcess(Context cxt) { /* implementation hidden */ }
}

    public static void setRecoverPowerKeyAlarm(Context cxt, boolean enable) { /* implementation hidden */ }
        //// get the command to turn off heater <--- Disable this feature for safety, request from TTM
        //FQCConfig cfg = new DataBaseConfig(cxt);
        //StringBuilder sb = new StringBuilder();
        //String str;
        //for (int i = 1; i < 10 /* MAX_NUMOF_HEATER */; i++) {
        //    str = cfg.getConfigDataString(FQCXmlParseHandler.FQCSETTING + "_HeaterTest_OffCmd" + i);
        //    if (!TextUtils.isEmpty(str)) sb.append(str + ";");
        //}
        //if (!TextUtils.isEmpty(sb.toString())) Log.d(TAG, "setRecoverPowerKeyAlarm, heater off command = " + sb.toString());
        //intent.putExtra("TurnOffHeater", sb.toString());
}

    public static void shortAlarmInterval(boolean enable) { /* implementation hidden */ }
        /*Log.d(TAG, "shortAlarmInterval(" + enable + ")");
        String cmd;
        cmd = (enable) ? "settings put global alarm_manager_constants min_interval=10"
                       : "settings delete global alarm_manager_constants";
        BaseActivity.do_exec(cmd, TAG);*/
}

    public static void setLocationProviderEnabled(ContentResolver resolver, boolean enabled) { /* implementation hidden */ }
        //String cmd = (enabled) ? "settings put secure location_mode 3"
        //                       : "settings put secure location_mode 0";
        //BaseActivity.do_exec(cmd, TAG);
}

    public static Bitmap TextToImageEncodeQRCode(String Value) throws WriterException { /* implementation hidden */ }
}



    public static String getAlgorithmVersion() { /* implementation hidden */ }
}

    public static String getAlgorithmLastError() { /* implementation hidden */ }
}

    public static boolean IsClearImage(String name, int id, String params) { /* implementation hidden */ }
}



        // rotation angle algorithm

        // dirty detector algorithm

        // MTF (clear) algorithm



        // backup failure image




            // output result image
    public static void setIpConfiguration(Context cxt, String ip) { /* implementation hidden */ }
            //staticIPBuilder.setIpAddress(new LinkAddress(staticIpAddress, 24));
}

    /**
    * @author JimmyChen at 2012/3/5
    * @return String 2 IMEIs
    * @Description: show DSDSWG IMEI(2 IMEIs)
    */
    private static String getDSDSWGIMEI(TelephonyManager telMgr, FQCConfig cfg, String seperator) { /* implementation hidden */ }
}


    public static String getIMEI(Context cxt, String seperator) { /* implementation hidden */ }
}

    public static String getSN() { /* implementation hidden */ }
                // after Android 8.0 (API 26)
                // before Android 7.1 (API 25)
}

