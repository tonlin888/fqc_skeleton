/* EJ 20150504
 *      for LMR
 */

package com.evenwell.fqc.activity;

import java.util.EnumSet;

import com.dsi.ant.plugins.antplus.pcc.MultiDeviceSearch;
import com.dsi.ant.plugins.antplus.pcc.MultiDeviceSearch.RssiSupport;
import com.dsi.ant.plugins.antplus.pcc.defines.DeviceType;
import com.dsi.ant.plugins.antplus.pcc.defines.RequestAccessResult;
import com.dsi.ant.plugins.antplus.pccbase.MultiDeviceSearch.MultiDeviceSearchResult;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ShowAntPlus extends BaseActivity { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        //
    private Handler.Callback Handler_CB = new Handler.Callback() { /* implementation hidden */ }
        public boolean handleMessage(Message msg) { /* implementation hidden */ }
}

    private void passText() { /* implementation hidden */ }
}

    private void appendText(String str) { /* implementation hidden */ }
}

    private MultiDeviceSearch.SearchCallbacks mCallback = new MultiDeviceSearch.SearchCallbacks() { /* implementation hidden */ }
        public void onDeviceFound(final MultiDeviceSearchResult deviceFound) { /* implementation hidden */ }
}

        public void onSearchStopped(RequestAccessResult reason) { /* implementation hidden */ }
}

        @Override
        public void onSearchStarted(RssiSupport supportsRssi) { /* implementation hidden */ }
}

    private MultiDeviceSearch.RssiCallback mRssiCallback = new MultiDeviceSearch.RssiCallback() { /* implementation hidden */ }
        public void onRssiUpdate(final int resultId, final int rssi) { /* implementation hidden */ }
}

    @Override
    protected void onResume() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
