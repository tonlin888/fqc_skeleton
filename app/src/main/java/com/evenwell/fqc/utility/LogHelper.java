package com.evenwell.fqc.utility;

import android.util.Log;

/* THIS LogHelper is an agent which help handling log printing. */
public class LogHelper { /* implementation hidden */ }
/* 要輸出顯示的Debug層級 */
public static void d(String tag, String msg) { /* implementation hidden */ }
}

public static void i(String tag, String msg) { /* implementation hidden */ }
}

public static void e(String tag, String msg) { /* implementation hidden */ }
}

public static void v(String tag, String msg) { /* implementation hidden */ }
}

public static void w(String tag, String msg) { /* implementation hidden */ }
}

public static void o(String tag, String Category, String msg) { /* implementation hidden */ }
//USAGE:
//ORIGINAL: Log.i("oliver loadWeather", "onStart");
//REPLACE:  Log.i\(
//WITH:     \R //2013-JUL Logging Rules \R LogHelper.o(TAG,
}

