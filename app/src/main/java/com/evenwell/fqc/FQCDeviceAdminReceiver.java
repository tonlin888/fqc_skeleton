package com.evenwell.fqc;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

public class FQCDeviceAdminReceiver extends DeviceAdminReceiver { /* implementation hidden */ }
    void showToast(Context context, String msg) { /* implementation hidden */ }
//        String status = context.getString("FQCDeviceAdminReceiver"s, msg);
//        Toast.makeText(context, status, Toast.LENGTH_SHORT).show();
    public void onEnabled(Context context, Intent intent) { /* implementation hidden */ }
       // showToast(context, context.getString(R.string.admin_receiver_status_enabled));
        //setResult(Activity.RESULT_OK);
//20130624 oliver VKY-11618 No need to show confirmation dialog
//    @Override
//    public CharSequence onDisableRequested(Context context, Intent intent) {
//        //return context.getString(R.string.admin_receiver_status_disable_warning);
//
//      return "onDisableRequested";
//    }
    public void onDisabled(Context context, Intent intent) { /* implementation hidden */ }
       // showToast(context, context.getString(R.string.admin_receiver_status_disabled));
    public void onPasswordChanged(Context context, Intent intent) { /* implementation hidden */ }
      //  showToast(context, context.getString(R.string.admin_receiver_status_pw_changed));
}
