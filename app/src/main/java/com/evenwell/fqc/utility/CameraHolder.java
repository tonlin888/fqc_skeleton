package com.evenwell.fqc.utility;

import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * The class is used to hold an {@code android.hardware.Camera} instance.
 *
 * <p>The {@code open()} and {@code release()} calls are similar to the ones
 * in {@code android.hardware.Camera}. The difference is if {@code keep()} is
 * called before {@code release()}, CameraHolder will try to hold the {@code
 * android.hardware.Camera} instance for a while, so if {@code open()} is
 * called soon after, we can avoid the cost of {@code open()} in {@code
 * android.hardware.Camera}.
 *
 * <p>This is used in switching between {@code Camera} and {@code VideoCamera}
 * activities.
 */
public class CameraHolder { /* implementation hidden */ }
    // We store the camera parameters when we actually open the device,
    // so we can restore them in the subsequent open() requests by the user.
    // This prevents the parameters set by the Camera activity used by
    // the VideoCamera activity inadvertently.
    // FihTdcCode@20160510 Edwin add: open camera with openLegacy for MMX JGR HAL3 issue {
    // FihTdcCode@20160510 Edwin add: open camera with openLegacy for MMX JGR HAL3 issue }
    // Use a singleton.
}

    private class MyHandler extends Handler { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
                        // In 'CameraHolder.open', the 'RELEASE_CAMERA' message
                        // will be removed if it is found in the queue. However,
                        // there is a chance that this message has been handled
                        // before being removed. So, we need to add a check
                        // here:
}

    private CameraHolder() { /* implementation hidden */ }
}

    public int getNumberOfCameras() { /* implementation hidden */ }
}

    public CameraInfo[] getCameraInfo() { /* implementation hidden */ }
}

    // FihTdcCode@20160510 Edwin add: open camera with openLegacy for MMX JGR HAL3 issue {
                    // Retry with open if openLegacy doesn't exist/fails
                    // ++mUsers; // don't increase, CameraHolder.open() will do

    // FihTdcCode@20160510 Edwin add: open camera with openLegacy for MMX JGR HAL3 issue }


    /**
     * Tries to open the hardware camera. If the camera is being used or
     * unavailable then return {@code null}.
     */
            // In eng build, we throw the exception so that test tool
            // can detect it and report it



        // We allow (mUsers == 0) for the convenience of the calling activity.
        // The activity may not have a chance to call open() before the user
        // choose the menu item to switch to another activity.
        // Keep the camera instance for 3 seconds.

    public void Assert(boolean cond) { /* implementation hidden */ }
}
