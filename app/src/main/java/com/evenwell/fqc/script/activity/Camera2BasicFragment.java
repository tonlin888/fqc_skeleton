/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evenwell.fqc.script.activity;

import static android.view.OrientationEventListener.ORIENTATION_UNKNOWN;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.SensorManager;
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
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.evenwell.fqc.R;
import com.evenwell.fqc.utility.ShutterButton;
import com.evenwell.fqc.utility.Utility;

import vendor.logi.hardware.LogiHALPtz.V1_0.ILogiHALPtz;


    /**
     * Conversion from screen rotation to JPEG orientation.
     */

    private static final byte[] ZSL_MODE = new byte[]{ /* implementation hidden */ }

    static { /* implementation hidden */ }
}

    /**
     * Tag for the {@link Log}.
     */

    /**
     * Camera state: Showing camera preview.
     */

    /**
     * Camera state: Waiting for the focus to be locked.
     */

    /**
     * Camera state: Waiting for the exposure to be precapture state.
     */

    /**
     * Camera state: Waiting for the exposure state to be something other than precapture.
     */

    /**
     * Camera state: Picture was taken.
     */

    /**
     * Max preview width that is guaranteed by Camera2 API
     */

    /**
     * Max preview height that is guaranteed by Camera2 API
     */
    /**
     * {@link TextureView.SurfaceTextureListener} handles several lifecycle events on a
     * {@link TextureView}.
     */

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture texture, int width, int height) { /* implementation hidden */ }
}

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture texture, int width, int height) { /* implementation hidden */ }
}

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture texture) { /* implementation hidden */ }
}

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture texture) { /* implementation hidden */ }
}

    /**
     * ID of the current {@link CameraDevice}.
     */

    /**
     * An {@link AutoFitTextureView} for camera preview.
     */

    /**
     * A {@link CameraCaptureSession } for camera preview.
     */

    /**
     * A reference to the opened {@link CameraDevice}.
     */

    /**
     * The {@link android.util.Size} of camera preview.
     */


    /**
     * {@link CameraDevice.StateCallback} is called when {@link CameraDevice} changes its state.
     */
    private final CameraDevice.StateCallback mStateCallback = new CameraDevice.StateCallback() { /* implementation hidden */ }
        public void onOpened(@NonNull CameraDevice cameraDevice) { /* implementation hidden */ }
            // This method is called when the camera is opened. We start camera preview here.
                // We configure the size of default buffer to be the size of camera preview we want.
}

        @Override
        public void onDisconnected(@NonNull CameraDevice cameraDevice) { /* implementation hidden */ }
}

        @Override
        public void onError(@NonNull CameraDevice cameraDevice, int error) { /* implementation hidden */ }
}


    /**
     * An additional thread for running tasks that shouldn't block the UI.
     */

    /**
     * A {@link Handler} for running tasks in the background.
     */

    /**
     * An {@link ImageReader} that handles still image capture.
     */

    /**
     * This is the output file for our picture.
     */

    /**
     * This a callback object for the {@link ImageReader}. "onImageAvailable" will be called when a
     * still image is ready to be saved.
     */

        @Override
        public void onImageAvailable(ImageReader reader) { /* implementation hidden */ }
}


    /**
     * {@link CaptureRequest.Builder} for the camera preview
     */

    /**
     * {@link CaptureRequest} generated by {@link #mPreviewRequestBuilder}
     */

    /**
     * The current state of camera state for taking pictures.
     *
     * @see #mCaptureCallback
     */

    /**
     * A {@link Semaphore} to prevent the app from exiting before closing the camera.
     */

    /**
     * Whether the current camera device supports Flash or not.
     */

    /**
     * Orientation of the camera sensor
     */

    final String[] STATE_NAME = { /* implementation hidden */ }
}


        private void process(CaptureResult result) { /* implementation hidden */ }
}
                    // We have nothing to do when the camera preview is working normally.


                        // CONTROL_AE_STATE can be null on some devices
                    // CONTROL_AE_STATE can be null on some devices
                    // CONTROL_AE_STATE can be null on some devices

        @Override
                                        @NonNull CaptureRequest request,
                                        @NonNull CaptureResult partialResult) {

        @Override
                                       @NonNull CaptureRequest request,
                                       @NonNull TotalCaptureResult result) {

    /**
     * Shows a {@link Toast} on the UI thread.
     *
     * @param text The message to show
     */
    private void showToast(final String text) { /* implementation hidden */ }
                public void run() { /* implementation hidden */ }
}

    /**
     * Given {@code choices} of {@code Size}s supported by a camera, choose the smallest one that
     * is at least as large as the respective texture view size, and that is at most as large as the
     * respective max size, and whose aspect ratio matches with the specified value. If such size
     * doesn't exist, choose the largest one that is at most as large as the respective max size,
     * and whose aspect ratio matches with the specified value.
     *
     * @param choices           The list of sizes that the camera supports for the intended output
     *                          class
     * @param textureViewWidth  The width of the texture view relative to sensor coordinate
     * @param textureViewHeight The height of the texture view relative to sensor coordinate
     * @param maxWidth          The maximum width that can be chosen
     * @param maxHeight         The maximum height that can be chosen
     * @param aspectRatio       The aspect ratio
     * @return The optimal {@code Size}, or an arbitrary one if none were big enough
     */
            int textureViewHeight, int maxWidth, int maxHeight, Size aspectRatio) { /* implementation hidden */ }
        // Collect the supported resolutions that are at least as big as the preview Surface
        // Collect the supported resolutions that are smaller than the preview Surface
}

        // Pick the smallest of those big enough. If there is no one big enough, pick the
        // largest of those not big enough.

    public static Camera2BasicFragment newInstance() { /* implementation hidden */ }
}

    @Override

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) { /* implementation hidden */ }
            public void onOrientationChanged(int orientation) { /* implementation hidden */ }
}
                // Monitors orientation values to determine the target rotation value


            // Initialize shutter button.

    // EXTRA ptz delay,[p|t|z]value,...
    // for example: EXTRA ptz 3000,p25,3000,p-15;


    private final class MainHandler extends Handler { /* implementation hidden */ }
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

    private void sendPtzEvent() { /* implementation hidden */ }
        // mPtzControlStr format: [duration],[p|t|z][value],...
        // example: 3000,p25,3000,p-25,3000,p0
}

    private void LogiHALPtz_Ctrl(String ptz) { /* implementation hidden */ }
}


    private void getConfigFromIntent(Intent config) { /* implementation hidden */ }
}









        // get options


    @Override
    public void onActivityCreated(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    public void onResume() { /* implementation hidden */ }
        // When the screen is turned off and turned back on, the SurfaceTexture is already
        // available, and "onSurfaceTextureAvailable" will not be called. In that case, we can open
        // a camera and start preview from here (otherwise, we wait until the surface is ready in
        // the SurfaceTextureListener).
}

    @Override
    public void onPause() { /* implementation hidden */ }
        // restore PTZ
}

    private void requestCameraPermission() { /* implementation hidden */ }
            requestPermissions(new String[]{ /* implementation hidden */ }
}

    @Override
                                           @NonNull int[] grantResults) {

    // front, back, ext
    private String findCameraId(String id) { /* implementation hidden */ }
}
    /**
     * Sets up member variables related to camera.
     *
     * @param width  The width of available size for camera preview
     * @param height The height of available size for camera preview
     */
    @SuppressWarnings("SuspiciousNameCombination")
    private void setUpCameraOutputs(int width, int height) { /* implementation hidden */ }
}



            // For still image captures, we use the largest available size.
            //Size largest = Collections.max(
            //        Arrays.asList(map.getOutputSizes(ImageFormat.JPEG)),
            //        new CompareSizesByArea());
                    ImageFormat.JPEG, /*maxImages*/2);


            // Check if the flash is supported.


    /**
     * Opens the camera specified by {@link Camera2BasicFragment#mCameraId}.
     */
    private void openCamera(int width, int height) { /* implementation hidden */ }
}

    /**
     * Closes the current {@link CameraDevice}.
     */
    private void closeCamera() { /* implementation hidden */ }
}

    /**
     * Starts a background thread and its {@link Handler}.
     */
    private void startBackgroundThread() { /* implementation hidden */ }
}

    /**
     * Stops the background thread and its {@link Handler}.
     */
    private void stopBackgroundThread() { /* implementation hidden */ }
}

    /**
     * Creates a new {@link CameraCaptureSession} for camera preview.
     */
    private void createCameraPreviewSession() { /* implementation hidden */ }
            // tony: configure surface size twice to avoid it been changed at onSurfaceTextureSizeChanged()
            // We configure the size of default buffer to be the size of camera preview we want.
            // This is the output Surface we need to start preview.
            // We set up a CaptureRequest.Builder with the output Surface.
            // Here, we create a CameraCaptureSession for camera preview.
                        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) { /* implementation hidden */ }
                            // The camera is already closed
                            // When the session is ready, we start displaying the preview.
                                // Auto focus should be continuous for camera preview.
}
                                // Flash is automatically enabled when necessary.

                                // Finally, we start displaying the camera preview.

                        @Override
                                @NonNull CameraCaptureSession cameraCaptureSession) {

    /**
     * Configures the necessary {@link android.graphics.Matrix} transformation to `mTextureView`.
     * This method should be called after the camera preview size is determined in
     * setUpCameraOutputs and also the size of `mTextureView` is fixed.
     *
     * @param viewWidth  The width of `mTextureView`
     * @param viewHeight The height of `mTextureView`
     */
    private void configureTransform(int viewWidth, int viewHeight) { /* implementation hidden */ }
}


        //mTextureView.setTransform(matrix);

    /**
     * Initiate a still image capture.
     */
    private void takePicture() { /* implementation hidden */ }
}

    public void onShutterButtonFocus(ShutterButton button, boolean pressed) { /* implementation hidden */ }
}

    public void onShutterButtonClick(ShutterButton button) { /* implementation hidden */ }
}

    /**
     * Lock the focus as the first step for a still image capture.
     */
    private void lockFocus() { /* implementation hidden */ }
            // This is how to tell the camera to lock focus.
            // Tell #mCaptureCallback to wait for the lock.
}

    /**
     * Run the precapture sequence for capturing a still image. This method should be called when
     * we get a response in {@link #mCaptureCallback} from {@link #lockFocus()}.
     */
    private void runPrecaptureSequence() { /* implementation hidden */ }
            // This is how to tell the camera to trigger.
            // Tell #mCaptureCallback to wait for the precapture sequence to be set.
}

    /**
     * Capture a still picture. This method should be called when we get a response in
     * {@link #mCaptureCallback} from both {@link #lockFocus()}.
     */
    private void captureStillPicture() { /* implementation hidden */ }
}
            // This is the CaptureRequest.Builder that we use to take a picture.

            // Use the same AE and AF modes as the preview.

            // Orientation


                @Override
                                               @NonNull CaptureRequest request,
                                               @NonNull TotalCaptureResult result) {
                    //showToast("Saved: " + mFile);
                    //unlockFocus();
                    // let driver get more time to save picture
                    //getActivity().finish();

                    // Play the shutter click sound. SX1-1889


    /**
     * Retrieves the JPEG orientation from the specified screen rotation.
     *
     * @param rotation The screen rotation.
     * @return The JPEG orientation (one of 0, 90, 270, and 360)
     */
    private int getOrientation(int rotation) { /* implementation hidden */ }
        // Sensor orientation is 90 for most devices, or 270 for some devices (eg. Nexus 5X)
        // We have to take that into account and rotate JPEG properly.
        // For devices with orientation of 90, we simply return our mapping from ORIENTATIONS.
        // For devices with orientation of 270, we need to rotate the JPEG 180 degrees.
}

    /**
     * Unlock the focus. This method should be called when still image capture sequence is
     * finished.
     */
    private void unlockFocus() { /* implementation hidden */ }
            // Reset the auto-focus trigger
            // After this, the camera will go back to the normal state of preview.
}

    @Override
    public void onClick(View view) { /* implementation hidden */ }
}

    private void setAutoFlash(CaptureRequest.Builder requestBuilder) { /* implementation hidden */ }
}

    /**
     * Saves a JPEG {@link Image} into the specified {@link File}.
     */
    private static class ImageSaver implements Runnable { /* implementation hidden */ }
        /**
         * The JPEG image
         */
        /**
         * The file we save the image into.
         */
}

        @Override
        public void run() { /* implementation hidden */ }
}


    /**
     * Compares two {@code Size}s based on their areas.
     */
    static class CompareSizesByArea implements Comparator<Size> { /* implementation hidden */ }
        public int compare(Size lhs, Size rhs) { /* implementation hidden */ }
            // We cast here to ensure the multiplications won't overflow
}

    /**
     * Shows an error message dialog.
     */
    public static class ErrorDialog extends DialogFragment { /* implementation hidden */ }
        public static ErrorDialog newInstance(String message) { /* implementation hidden */ }
        public Dialog onCreateDialog(Bundle savedInstanceState) { /* implementation hidden */ }
                        public void onClick(DialogInterface dialogInterface, int i) { /* implementation hidden */ }
}


    /**
     * Shows OK/Cancel confirmation dialog about camera permission.
     */
    public static class ConfirmationDialog extends DialogFragment { /* implementation hidden */ }
        public Dialog onCreateDialog(Bundle savedInstanceState) { /* implementation hidden */ }
                        public void onClick(DialogInterface dialog, int which) { /* implementation hidden */ }
                            parent.requestPermissions(new String[]{ /* implementation hidden */ }
                                public void onClick(DialogInterface dialog, int which) { /* implementation hidden */ }
}

