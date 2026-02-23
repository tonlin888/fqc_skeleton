package com.evenwell.fqc.script;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.evenwell.fqc.script.CommandQueue.Script;

// Move register
// ex. MOVE %R1%, NONE; @@@ clear R1

public class CommandMove extends Command { /* implementation hidden */ }
    // if keywords have the same prefix, let longer first.
    // for example, "USER CHECK ON RESUME" is in front of "USER CHECK"
    private static final LinkedHashMap<String, Integer> mKeys = new LinkedHashMap<String, Integer>() { /* implementation hidden */ }
}


    // test parameters

    public CommandMove() { /* implementation hidden */ }
}

    private int getKey(String line) { /* implementation hidden */ }
}

    public Command builder(Script script) { /* implementation hidden */ }
            //if (getKey(line) != KEY_NONE) Log.d(TAG, "[Script] \"" + line + "\"");
}


    public String tag() { /* implementation hidden */ }

    public void exec(onResultLisener listener, TestScript ts) { /* implementation hidden */ }
}

    public String toString() { /* implementation hidden */ }
}

    final String[] EVENT_NAME = { /* implementation hidden */ }

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
                    //Log.d(TAG, "EV_RUN, source = " + source + ", dest = " + dest + ", value = " + value);
                        //Log.d(TAG, "EV_RUN, mTs.mValue[source] = " + mTs.mValue[source]);
}
