/* EJ 20150506
 *
 */

package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ShowBatteryHotSwap extends BaseActivity { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //
    public boolean onKeyDown(int keyCode, KeyEvent event) { /* implementation hidden */ }
        // No "android.intent.action" beginning App-proprietary intent at Android O (CTS)
        // cannot find anyone need this intent.
        //if (keyCode == 262) {   // KeyEvent.KEYCODE_HOTSWAP
        //    Intent intent = new Intent();
        //    intent.setAction("android.intent.action.BATTERY_HOTSWAP");  //Intent.ACTION_BATTERY_HOTSWAP
        //    sendBroadcast(intent);
        //}
    protected void onResume() { /* implementation hidden */ }
    public int getTestMode() { /* implementation hidden */ }
    public int getTestElapsedTime() { /* implementation hidden */ }
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
