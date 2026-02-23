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

package com.evenwell.fqc.script.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;

import vendor.fih.hardware.pir.V1_0.Ipir;
import vendor.fih.hardware.pir.V1_0.IpirCallback;

import com.evenwell.fqc.FQCApplication;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.Utility;

public class ScriptService extends Service { /* implementation hidden */ }
    public void onCreate() { /* implementation hidden */ }
        // TODO Auto-generated method stub
    public void onDestroy() { /* implementation hidden */ }
        // TODO Auto-generated method stub
}

    @Override
    public IBinder onBind(Intent intent) { /* implementation hidden */ }
}

    public class ServiceBinder extends Binder { /* implementation hidden */ }
        public ScriptService getService() { /* implementation hidden */ }
}



    private void pir_service(boolean start) { /* implementation hidden */ }
}
    private class PirCallback extends IpirCallback.Stub { /* implementation hidden */ }
        public void notifyPirSensorEvent(int var1, int var2, int var3) { /* implementation hidden */ }
}
