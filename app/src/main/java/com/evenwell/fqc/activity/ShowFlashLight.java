package com.evenwell.fqc.activity;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.activity.view.PreviewFrameLayout;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.CameraHardwareException;
import com.evenwell.fqc.utility.CameraHolder;
import com.evenwell.fqc.utility.FQCLog;
import com.evenwell.fqc.utility.ImageManager;
import com.evenwell.fqc.utility.ShutterButton;
import com.evenwell.fqc.utility.Utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;



    // The subset of parameters we need to update in setCameraParameters().

    //private static final int IDLE = 1;
    //private static final int SNAPSHOT_IN_PROGRESS = 2;

    // Use the ErrorCallback to capture the crash count on the mediaserver

    // The device orientation in degrees. Default is unknown.
    // The orientation compensation for icons and thumbnails.
    //FihTdcCode@20151029 DarkHou add for Camera AF Test begin
    //FihTdcCode@20151029 DarkHou add for Camera AF Test end

    // test case configure variable

    // event

    // camrea test state

    // camera focus state
    // User has released the focus key before focus completes. Do nothing.
    // User is half-pressing the focus key. Play the focus tone.
    // Do not take the picture now.
    // Take the picture no matter focus succeeds or fails. No need
    // to play the AF sound if we're about to play the shutter sound.

    // FihTdcCode@20160122 Edwin add to record more information {
    // FihTdcCode@20160122 Edwin add to record more information }

    @Override
    public void onCreate(Bundle icicle) { /* implementation hidden */ }
}

    private void enterFQCselfCamera(){ /* implementation hidden */ }
        //FihTdcCode@20151029 DarkHou add for Camera AF Test begin
        //FihTdcCode@20151029 DarkHou add for Camera AF Test end
        //Check the camera id valid Jinsheng modify for IRM.B-4153 2011/11/22
         // ej 20140217 start
}
        // ej 20140217 end


        /*
         * To reduce startup time, we start the preview in another thread.
         * We make sure the preview is started at the end of onCreate.
         */
            public void run() { /* implementation hidden */ }
                    // In eng build, we throw the exception so that test tool
                    // can detect it and report it
}
        // don't set mSurfaceHolder here. We have it set ONLY within
        // surfaceChanged / surfaceDestroyed, other parts of the code
        // assume that when it is set, the surface is also set.


        // Make sure preview is started.
            // ignore

    private void enterCameraAP(){ /* implementation hidden */ }
}

    private void LauncherCamera(int type) { /* implementation hidden */ }
        // 0 means main camera
        // 1 means VGA camera
}

    public void onShutterButtonFocus(ShutterButton button, boolean pressed) { /* implementation hidden */ }
}
                //resetFocusIndicator();

    public void onShutterButtonClick(ShutterButton button) { /* implementation hidden */ }
}

    private boolean restartPreview() { /* implementation hidden */ }
}

    private void setPreviewDisplay(SurfaceHolder holder) { /* implementation hidden */ }
}

    private void startPreview() throws CameraHardwareException { /* implementation hidden */ }
        // If we're previewing already, stop the preview first (this will blank
        // the screen).
}

    private void stopPreview() { /* implementation hidden */ }
}
            // If auto focus was in progress, it would have been canceled.

    private void setMonoOnly(boolean enable) { /* implementation hidden */ }
}

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) { /* implementation hidden */ }
}

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) { /* implementation hidden */ }
}

    private void doSnap() { /* implementation hidden */ }
}
        // snap after focus finish

    private void doFocus(boolean pressed) { /* implementation hidden */ }
}

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) { /* implementation hidden */ }
        // Make sure we have a surface in the holder before proceeding.
}
        // We need to save the holder for later use, even when the mCameraDevice
        // is null. This could happen if onResume() is invoked after this
        // function.
        // The mCameraDevice will be null if it fails to connect to the camera
        // hardware. In this case we will show a dialog and then finish the
        // activity, so it's OK to ignore it.
        // Sometimes surfaceChanged is called after onPause or before onResume.
        // Ignore it.
            // Set preview display if the surface is being created and preview
            // was already started. That means preview display was set to null
            // and we need to set it now.
            // 1. Restart the preview if the size of surface was changed. The
            // framework may not support changing preview display on the fly.
            // 2. Start the preview now if surface was destroyed and preview
            // stopped.
        // If first time initialization is not finished, send a message to do
        // it later. We want to finish surfaceChanged as soon as possible to let
        // user see preview first.
    public void surfaceCreated(SurfaceHolder holder) { /* implementation hidden */ }
}
    public void surfaceDestroyed(SurfaceHolder holder) { /* implementation hidden */ }
}
    private void closeCamera() { /* implementation hidden */ }
}
    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}
    @Override
    public int getTestMode() { /* implementation hidden */ }
}
    private void ensureCameraDevice() throws CameraHardwareException { /* implementation hidden */ }
            // FihTdcCode@20160510 Edwin add: open camera with openLegacy for MMX JGR HAL3 issue {
            //mCameraDevice = CameraHolder.instance().open(mCameraId);
                // Retry with open if openLegacy doesn't exist/fails
}
            // FihTdcCode@20160510 Edwin add: open camera with openLegacy for MMX JGR HAL3 issue }

            //FihTdcCode@20151029 DarkHou add for Camera AF Test begin
            //FihTdcCode@20151029 DarkHou add for Camera AF Test end

    private void showCameraErrorAndFinish() { /* implementation hidden */ }
}
            final Activity activity, String title, String message) { /* implementation hidden */ }
            public void onClick(DialogInterface dialog, int which) { /* implementation hidden */ }
}
    private final class MainHandler extends Handler { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    private void enter(int state) { /* implementation hidden */ }
}

    private void viewLastImage(){ /* implementation hidden */ }
}
    private void switchCameraId(int cameraId) { /* implementation hidden */ }
        // Remove the messages in the event queue.
        // Reset variables
        // Restart the preview.
}

    @Override
    protected void onResume() { /* implementation hidden */ }
            // Start the preview if it is not started.
}
                // If first time initialization is not finished, put it in the
                // message queue.

    @Override
    protected void onPause() { /* implementation hidden */ }
            // Remove the messages in the event queue.
            //2012/6/15 Jinsheng add for front camera view image inverse
            // Close the camera now because other activities may need to use it.
            // If we are in an image capture intent and has taken
            // a picture, we just clear it in onPause.
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    private void initializeFirstTime() { /* implementation hidden */ }
}
        //2012/6/15 Jinsheng add for front camera view image inverse
        // Initialize last picture button.
        // Initialize shutter button.

    private void setCameraParametersWhenIdle(int additionalUpdateSet) { /* implementation hidden */ }
            // We will update all the parameters when we open the device, so
            // we don't need to do anything now.
}

    private void setCameraParameters(int updateSet) { /* implementation hidden */ }
}

    private void updateCameraParametersPreference() { /* implementation hidden */ }
        //20130605 oliver APPG2-3586 Set Flash On only if using main camera, to prevent set param fail to front camera
}

        //20130711 oliver Set AntiBanding by Config. START
       //20130711 oliver Set AntiBanding by Config. END
        // Set the preview frame aspect ratio according to the picture size.
        // ej 20140512 start - get biggest picture size. Default size maybe the smallest
        //Size size = mParameters.getPictureSize();
        // ej 20140512 end
        // Set a preview size that is closest to the viewfinder height and has
        // the right aspect ratio.
        //20130604 oliver For view available FlashModes only.
        //List<String> FlashModeList = mParameters.getSupportedFlashModes();
        //for(String thisFlashMode:FlashModeList ){
        //  FQCLog.Logv("getSupportedFlashModes="+thisFlashMode);
        //}
            // ej 20140512 start - set the parameters because of picture size may be defaulted the worst resolution
            // ej 20140512 end
                // Zoom related settings will be changed for different preview
                // sizes, so set and read the parameters to get lastest values
                //20130604 oliver APPG2-3586 For VBJ sometimes fail to change preview size

    // Calculate the highest FPS range supported
    private int[] getPhotoPreviewFpsRange(List<int[]> frameRates) { /* implementation hidden */ }
}



    private static boolean isSupported(String value, List<String> supported) { /* implementation hidden */ }
}

        public void onShutter() { /* implementation hidden */ }
}

    private final class PostViewPictureCallback implements PictureCallback { /* implementation hidden */ }
        public void onPictureTaken(byte[] data, android.hardware.Camera camera) { /* implementation hidden */ }
}

    private final class RawPictureCallback implements PictureCallback { /* implementation hidden */ }
}

    private final class JpegPictureCallback implements PictureCallback { /* implementation hidden */ }
                    final android.hardware.Camera camera) { /* implementation hidden */ }
            // If postview callback has arrived, the captured image is displayed
            // in postview callback. If not, the captured image is displayed in
            // raw picture callback.
}
                //mHandler.sendEmptyMessageDelayed(RESTART_PREVIEW, delay);

    private boolean isCameraIdle() { /* implementation hidden */ }
}

    private boolean canTakePicture() { /* implementation hidden */ }
        // ej 20140811 start
        // ej 20140811 end
}

    private void autoFocus() { /* implementation hidden */ }
        // Initiate autofocus only when preview is started and snapshot is not
        // in progress.
}

    private void cancelAutoFocus() { /* implementation hidden */ }
        // User releases half-pressed focus key.
}


            int cameraId, Camera camera) { /* implementation hidden */ }
        // See android.hardware.Camera.setCameraDisplayOrientation for
        // documentation.
}


    public int getDisplayRotation(Activity activity) { /* implementation hidden */ }
}

        public void onAutoFocus(boolean focused, android.hardware.Camera camera) { /* implementation hidden */ }
}

                    //mImageCapture.onSnap();


        public void onError(int error, android.hardware.Camera camera) { /* implementation hidden */ }
}


    private int cmpImage(final String p1, final String p2) { /* implementation hidden */ }
}





    private class ImageCapture { /* implementation hidden */ }
        // Returns the rotation degree in the jpeg header.
        private int storeImage(byte[] data ) { /* implementation hidden */ }
}

        public void storeImage(final byte[] data,  android.hardware.Camera camera) { /* implementation hidden */ }
}
            //2012/6/15 Jinsheng modify for front camera view image inverse begin
            //Log.i(TAG,"orientation degree:"+orientation);
            //2012/6/15 Jinsheng modify for front camera view image inverse end

        private void createLastPicturebitmap(byte[] data, int degree) { /* implementation hidden */ }
}
            // ej 20140528 start
            // ej 20140528 end

            //2012/6/15 Jinsheng modify for front camera view image inverse begin


            // ej 20140512 start - flip the image when using front camera
            // ej 20140512 end

        // Rotates and/or mirrors the bitmap. If a new bitmap is created, the
        // original bitmap is recycled.
        public  Bitmap rotate(Bitmap b, int degrees, boolean mirror) { /* implementation hidden */ }
}
                    // We have no memory to rotate. Return the original bitmap.

        /**
         * Initiate the capture of an image.
         */
        public void initiate() { /* implementation hidden */ }
}

        private void capture() { /* implementation hidden */ }
            // See android.hardware.Camera.Parameters.setRotation for
            // documentation.
}


            //FIHNJdcCode@20121227 emily modified for force close when entry camera

        public void onSnap() { /* implementation hidden */ }
            // If we are already in the middle of taking a snapshot then ignore.
}
            // FihTdcCode@20160122 Edwin add to record more information {




        // for some camera, preview size is landscape.




    private Size getOptimalPreviewSize(List<Size> sizes, double targetRatio) { /* implementation hidden */ }
        // Because of bugs of overlay and layout, we sometimes will try to
        // layout the viewfinder in the portrait orientation and thus get the
        // wrong size of mSurfaceView. When we change the preview size, the
        // new overlay will be created before the old one closed, which causes
        // an exception. For now, just get the screen size
            // We don't know the size of SurefaceView, use screen height
}
        // Try to find an size match aspect ratio and size
        // Cannot find the one match the aspect ratio, ignore the requirement

    //2012/6/15 Jinsheng add for front camera view image inverse begin
    private  int getOrientation(byte[] jpeg) { /* implementation hidden */ }
}
        // ISO/IEC 10918-1:1993(E)
            // Check if the marker is a padding.
            // Check if the marker is SOI or TEM.
            // Check if the marker is EOI or SOS.
            // Get the length and check if it is reasonable.
            // Break if the marker is EXIF in APP1.
            // Skip other markers.
        // JEITA CP-3451 Exif Version 2.2
            // Identify the byte order.
            // Get the offset and check if it is reasonable.
            // Get the count and go through all the elements.
                // Get the tag and check if it is orientation.
                    // We do not really care about type and count, do we?

            boolean littleEndian) { /* implementation hidden */ }
}

    public static int roundOrientation(int orientation) { /* implementation hidden */ }
}

    private class MyOrientationEventListener extends OrientationEventListener { /* implementation hidden */ }
        public MyOrientationEventListener(Context context) { /* implementation hidden */ }
        public void onOrientationChanged(int orient) { /* implementation hidden */ }
            // We keep the last known orientation. So if the user first orient
            // the camera then point the camera to floor or sky, we still have
            // the correct orientation.
            // When the screen is unlocked, display rotation may change. Always
            // calculate the up-to-date orientationCompensation.
}

    //2012/6/15 Jinsheng add for front camera view image inverse end
    @Override
    protected void onDestroy() { /* implementation hidden */ }
        //ImageManager.deletePhotos();
}

    private void getGeneralConfig(FQCParamsByConfigHelper helper) { /* implementation hidden */ }
}

    private void getCameraConfig(FQCParamsByConfigHelper helper) { /* implementation hidden */ }
        // read each camera parameters
        // six camera type: Main(0, 10), Front(1, 20), IR(2, 30), Mono(3, 40), Ext1(4, 50), Ext2(5, 60)
        // camera extra property: device id, test order
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // reading order of config : ShowFlashLight -> ShowMainCameraTest -> ShowCameraTest
}

            // Set Params to Default if failed to Get from fqc.xml

    // camera default settings
    public enum Settings { /* implementation hidden */ }
        // camera name, id, order, facingFront
        //CAMERA_FRONT(TestCamera.CAMERA_FRONT, 1, 20, 1),
        //CAMERA_MONO(TestCamera.CAMERA_MONO, 3, 40, 0),
        //CAMERA_EXT1(TestCamera.CAMERA_EXT1, 4, 50, 0),
        //CAMERA_EXT2(TestCamera.CAMERA_EXT2, 5, 60, 0);
        Settings(String name, int id, int order, int facingFront) { /* implementation hidden */ }
        static Settings get(String name) { /* implementation hidden */ }
}

    // read test camera information from fqc.xml
    private static class TestCamera { /* implementation hidden */ }
        TestCamera(String n, int i, int o, int p, int v, int l, int f, String m) { /* implementation hidden */ }
}

        @Override
        public String toString() { /* implementation hidden */ }
            String ret = "TestCamera = { /* implementation hidden */ }
}

    private class TestStep { /* implementation hidden */ }
        // mapping test step to test step name
        public final HashMap<Integer, String> nameMap = new HashMap<Integer, String>() { /* implementation hidden */ }
}
        // mapping test step to camera
        public final HashMap<Integer, String> cameraMap = new HashMap<Integer, String>() { /* implementation hidden */ }
}
        // do camera test by step

        public int next() { /* implementation hidden */ }
}
        public int state() { /* implementation hidden */ }
        public int end() { /* implementation hidden */ }

        // get test step name
        public String name() { /* implementation hidden */ }
        // get camera name from test step
        public String camera() { /* implementation hidden */ }
        // get camera info from test step
        public TestCamera info() { /* implementation hidden */ }

        @Override
        public String toString() { /* implementation hidden */ }
}

        public void setup() { /* implementation hidden */ }
                // setup test order by TestCamera.order
}

