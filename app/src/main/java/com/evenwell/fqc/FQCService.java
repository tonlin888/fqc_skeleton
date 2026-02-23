/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evenwell.fqc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;

import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Utility;

public class FQCService extends Service { /* implementation hidden */ }
    public void onCreate() { /* implementation hidden */ }
        // TODO Auto-generated method stub
    public void onDestroy() { /* implementation hidden */ }
        // TODO Auto-generated method stub
    public int onStartCommand(Intent intent, int flags, int startId) { /* implementation hidden */ }
        // TODO Auto-generated method stub
            // Disable this feature for safety, request from TTM
            //String cmd = intent.getStringExtra("TurnOffHeater");
            //if (!TextUtils.isEmpty(cmd)) {
            //    Log.d(TAG, "onStartCommand, cmd = " + cmd);
            //    BaseActivity.do_exec(cmd, TAG);
            //}
}

    @Override
    public IBinder onBind(Intent arg0) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
