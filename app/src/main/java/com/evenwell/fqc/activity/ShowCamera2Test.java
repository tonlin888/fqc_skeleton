package com.evenwell.fqc.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Matrix;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.HashMap;

import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.activity.view.PreviewFrameLayout;
import com.evenwell.fqc.utility.ShutterButton;
import com.evenwell.fqc.R;

public class ShowCamera2Test extends BaseActivity implements ShutterButton.OnShutterButtonListener { /* implementation hidden */ }
    static { /* implementation hidden */ }
    // camrea test state
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // Initialize shutter button.
    protected void onResume() { /* implementation hidden */ }
}

    private void startCameraThread() { /* implementation hidden */ }
}

    private TextureView.SurfaceTextureListener mTextureListener = new TextureView.SurfaceTextureListener() { /* implementation hidden */ }
        public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) { /* implementation hidden */ }
        public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) { /* implementation hidden */ }
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) { /* implementation hidden */ }
        public void onSurfaceTextureUpdated(SurfaceTexture surface) { /* implementation hidden */ }
}

    private void setupCamera() { /* implementation hidden */ }
            // get biggest picture size and closet to display size
}


            // default preview layout is protrait




    private Size getOptimalPreviewSize(Size[] sizeMap, double targetRatio) { /* implementation hidden */ }
        // Try to find an size match aspect ratio and size
}
        // Cannot find the one match the aspect ratio, ignore the requirement

    private void openCamera() { /* implementation hidden */ }
}

    private CameraDevice.StateCallback mStateCallback = new CameraDevice.StateCallback() { /* implementation hidden */ }
        public void onOpened(CameraDevice camera) { /* implementation hidden */ }
        public void onDisconnected(CameraDevice camera) { /* implementation hidden */ }
        public void onError(CameraDevice camera, int error) { /* implementation hidden */ }
}

    private void startPreview() { /* implementation hidden */ }
                public void onConfigured(CameraCaptureSession session) { /* implementation hidden */ }
}

                @Override
                public void onConfigureFailed(CameraCaptureSession session) { /* implementation hidden */ }
}

    public void takePicture(View view) { /* implementation hidden */ }
}

    private void lockFocus() { /* implementation hidden */ }
}

    private CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() { /* implementation hidden */ }
        public void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) { /* implementation hidden */ }
        public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) { /* implementation hidden */ }
}

    private void capture() { /* implementation hidden */ }
                public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) { /* implementation hidden */ }
}

    private void unLockFocus() { /* implementation hidden */ }
}

    @Override
    protected void onPause() { /* implementation hidden */ }
}

    private void setupImageReader() { /* implementation hidden */ }
            public void onImageAvailable(ImageReader reader) { /* implementation hidden */ }
}

    public class imageSaver implements Runnable { /* implementation hidden */ }
        public imageSaver(Image image) { /* implementation hidden */ }
        public void run() { /* implementation hidden */ }
}

                // create last bitmap



    private Matrix setRotateMatrix(float x, float y) { /* implementation hidden */ }
}


    public void onShutterButtonFocus(ShutterButton button, boolean pressed) { /* implementation hidden */ }
        // no idea to implement camera focus checking
}

    public void onShutterButtonClick(ShutterButton button) { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // read each camera parameters
            // six camera type: Main(0, 10), Front(1, 20), IR(2, 30), Mono(3, 40), Ext1(4, 50), Ext2(5, 60)
            // camera extra property: device id, test order
                // get camera name by system language(ENG;SCH), ex. name="English Text;Chinese Text"
}



            // Set Params to Default if failed to Get from fqc.xml

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    private void openTestCamera() { /* implementation hidden */ }
}

    private void closeTestCamera() { /* implementation hidden */ }
}



    private void enter(int state) { /* implementation hidden */ }
}
                //mShotted = false;

    @Override
    public void onBackPressed() { /* implementation hidden */ }
                // view image after taked shot
}



    // camera default settings
    public enum Settings { /* implementation hidden */ }
        // camera name, id, order, facingFront
        Settings(String name, int id, int order, int facingFront, int title) { /* implementation hidden */ }
        static Settings get(String name) { /* implementation hidden */ }
}

    // read test camera information from fqc.xml
    private static class TestCamera { /* implementation hidden */ }
            int v, int l, int f, String m, String pa, String oc) { /* implementation hidden */ }
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

