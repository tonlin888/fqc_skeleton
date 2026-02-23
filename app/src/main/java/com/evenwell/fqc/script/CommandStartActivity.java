package com.evenwell.fqc.script;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.script.CommandQueue.Script;
import android.content.Context;

import static android.app.Activity.RESULT_OK;

// start activity
// example:
//    START ACTIVITY com.tyriansystems.spidemo/com.tyriansystems.spidemo.MainActivity;
//    EXTRA name camera0.jpg; EXTRA id 0;
//    REQUEST CODE 1;
//    EXPECTED RESULT -1;

public class CommandStartActivity extends Command { /* implementation hidden */ }
    // if keywords have the same prefix, let longer first.
    // for example, "USER CHECK ON RESUME" is in front of "USER CHECK"
    private static final LinkedHashMap<String, Integer> mKeys = new LinkedHashMap<String, Integer>() { /* implementation hidden */ }
}

    private LinkedHashMap<String, String> extra = new LinkedHashMap<String, String>() { /* implementation hidden */ }
}


    public CommandStartActivity() { /* implementation hidden */ }
}

    private int getKey(String line) { /* implementation hidden */ }
}

    public Command builder(Script script) { /* implementation hidden */ }
}








    public String tag() { /* implementation hidden */ }

    public void exec(onResultLisener listener, TestScript ts) { /* implementation hidden */ }
}

    public String toString() { /* implementation hidden */ }
}

    final String[] EVENT_NAME = { /* implementation hidden */ }

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
