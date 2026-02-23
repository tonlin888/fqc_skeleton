/*
 * Copyright 2014 The Android Open Source Project
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

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v13.app.FragmentCompat;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.evenwell.fqc.R;




    private static final String[] VIDEO_PERMISSIONS = { /* implementation hidden */ }
}

    static { /* implementation hidden */ }
}

    static { /* implementation hidden */ }
}

    /**
     * An {@link AutoFitTextureView} for camera preview.
     */

    /**
     * Button to record video
     */

    /**
     * A reference to the opened {@link android.hardware.camera2.CameraDevice}.
     */

    /**
     * A reference to the current {@link android.hardware.camera2.CameraCaptureSession} for
     * preview.
     */

    /**
     * {@link TextureView.SurfaceTextureListener} handles several lifecycle events on a
     * {@link TextureView}.
     */

        @Override
                                              int width, int height) { /* implementation hidden */ }
}

        @Override
                                                int width, int height) { /* implementation hidden */ }
}

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) { /* implementation hidden */ }
}

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) { /* implementation hidden */ }
}


    /**
     * The {@link android.util.Size} of camera preview.
     */

    /**
     * The {@link android.util.Size} of video recording.
     */

    /**
     * MediaRecorder
     */

    /**
     * Whether the app is recording video now
     */

    /**
     * An additional thread for running tasks that shouldn't block the UI.
     */

    /**
     * A {@link Handler} for running tasks in the background.
     */

    /**
     * A {@link Semaphore} to prevent the app from exiting before closing the camera.
     */


    /**
     * {@link CameraDevice.StateCallback} is called when {@link CameraDevice} changes its status.
     */
    private CameraDevice.StateCallback mStateCallback = new CameraDevice.StateCallback() { /* implementation hidden */ }
        public void onOpened(@NonNull CameraDevice cameraDevice) { /* implementation hidden */ }
}

        @Override
        public void onDisconnected(@NonNull CameraDevice cameraDevice) { /* implementation hidden */ }
}

        @Override
        public void onError(@NonNull CameraDevice cameraDevice, int error) { /* implementation hidden */ }
}


    public static Camera2VideoFragment newInstance() { /* implementation hidden */ }
}

    /**
     * In this sample, we choose a video size with 3x4 aspect ratio. Also, we don't use sizes
     * larger than 1080p, since MediaRecorder cannot handle such a high-resolution video.
     *
     * @param choices The list of available sizes
     * @return The video size
     */
    private static Size chooseVideoSize(Size[] choices) { /* implementation hidden */ }
}

    /**
     * Given {@code choices} of {@code Size}s supported by a camera, chooses the smallest one whose
     * width and height are at least as large as the respective requested values, and whose aspect
     * ratio matches with the specified value.
     *
     * @param choices     The list of sizes that the camera supports for the intended output class
     * @param width       The minimum desired width
     * @param height      The minimum desired height
     * @param aspectRatio The aspect ratio
     * @return The optimal {@code Size}, or an arbitrary one if none were big enough
     */
    private static Size chooseOptimalSize(Size[] choices, int width, int height, Size aspectRatio) { /* implementation hidden */ }
        // Collect the supported resolutions that are at least as big as the preview Surface
}

        // Pick the smallest of those, assuming we found any

    @Override


    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) { /* implementation hidden */ }
}

    // filename
    private void getConfigFromIntent(Intent config) { /* implementation hidden */ }
}



    @Override
    public void onActivityCreated(Bundle savedInstanceState) { /* implementation hidden */ }
}

    @Override
    public void onResume() { /* implementation hidden */ }
}

    @Override
    public void onPause() { /* implementation hidden */ }
}

    @Override
    public void onClick(View view) { /* implementation hidden */ }
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
     * Gets whether you should show UI with rationale for requesting permissions.
     *
     * @param permissions The permissions your app wants to request.
     * @return Whether you can show permission rationale UI.
     */
    private boolean shouldShowRequestPermissionRationale(String[] permissions) { /* implementation hidden */ }
}

    /**
     * Requests permissions needed for recording video.
     */
    private void requestVideoPermissions() { /* implementation hidden */ }
}

    @Override
                                           @NonNull int[] grantResults) {

    private boolean hasPermissionsGranted(String[] permissions) { /* implementation hidden */ }
}

    /**
     * Tries to open a {@link CameraDevice}. The result is listened by `mStateCallback`.
     */
    @SuppressWarnings("MissingPermission")
    private void openCamera(int width, int height) { /* implementation hidden */ }
}


            // Choose the sizes for camera preview and video recording


            //mVideoSize = chooseVideoSize(map.getOutputSizes(MediaRecorder.class));
            //mPreviewSize = chooseOptimalSize(map.getOutputSizes(SurfaceTexture.class),
            //        width, height, mVideoSize);
            //Log.d(TAG, "mTextureView, preview size = width = " + mTextureView.getWidth() + ", height =" + mTextureView.getHeight() );
            //int orientation = getResources().getConfiguration().orientation;
            //if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //    mTextureView.setAspectRatio(mPreviewSize.getWidth(), mPreviewSize.getHeight());
            //} else {
            //    mTextureView.setAspectRatio(mPreviewSize.getHeight(), mPreviewSize.getWidth());
            //}
            // Currently an NPE is thrown when the Camera2API is used but not supported on the
            // device this code runs.

    private void closeCamera() { /* implementation hidden */ }
}

    /**
     * Start the camera preview.
     */
    private void startPreview() { /* implementation hidden */ }
}




                        @Override
                        public void onConfigured(@NonNull CameraCaptureSession session) { /* implementation hidden */ }
}

                        @Override
                        public void onConfigureFailed(@NonNull CameraCaptureSession session) { /* implementation hidden */ }
}

    /**
     * Update the camera preview. {@link #startPreview()} needs to be called in advance.
     */
    private void updatePreview() { /* implementation hidden */ }
}

    private void setUpCaptureRequestBuilder(CaptureRequest.Builder builder) { /* implementation hidden */ }
}

    /**
     * Configures the necessary {@link android.graphics.Matrix} transformation to `mTextureView`.
     * This method should not to be called until the camera preview size is determined in
     * openCamera, or until the size of `mTextureView` is fixed.
     *
     * @param viewWidth  The width of `mTextureView`
     * @param viewHeight The height of `mTextureView`
     */
    private void configureTransform(int viewWidth, int viewHeight) { /* implementation hidden */ }
}

            //float scale = Math.max(
            //        (float) viewHeight / mPreviewSize.getHeight(),
            //        (float) viewWidth / mPreviewSize.getWidth());

    private void setUpMediaRecorder() throws IOException { /* implementation hidden */ }
}
        //int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        //switch (mSensorOrientation) {
        //    case SENSOR_ORIENTATION_DEFAULT_DEGREES:
        //        mMediaRecorder.setOrientationHint(DEFAULT_ORIENTATIONS.get(rotation));
        //        break;
        //    case SENSOR_ORIENTATION_INVERSE_DEGREES:
        //        mMediaRecorder.setOrientationHint(INVERSE_ORIENTATIONS.get(rotation));
        //        break;
        //}

    private String getVideoFilePath(Context context) { /* implementation hidden */ }
}

    private void startRecordingVideo() { /* implementation hidden */ }
}

            // Set up Surface for the camera preview

            // Set up Surface for the MediaRecorder

            // Start a capture session
            // Once the session starts, we can update the UI and start recording

                @Override
                public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) { /* implementation hidden */ }
                        public void run() { /* implementation hidden */ }
                            // UI
                            // Start recording
}

                @Override
                public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) { /* implementation hidden */ }
}


    private void closePreviewSession() { /* implementation hidden */ }
}

    private void stopRecordingVideo() { /* implementation hidden */ }
        // UI
            //mButtonVideo.setText(R.string.record);
            // Stop recording
}

            //startPreview();


    /**
     * Compares two {@code Size}s based on their areas.
     */
    static class CompareSizesByArea implements Comparator<Size> { /* implementation hidden */ }
        public int compare(Size lhs, Size rhs) { /* implementation hidden */ }
            // We cast here to ensure the multiplications won't overflow
}

    public static class ErrorDialog extends DialogFragment { /* implementation hidden */ }
        public static ErrorDialog newInstance(String message) { /* implementation hidden */ }
        public Dialog onCreateDialog(Bundle savedInstanceState) { /* implementation hidden */ }
                        public void onClick(DialogInterface dialogInterface, int i) { /* implementation hidden */ }
}


    public static class ConfirmationDialog extends DialogFragment { /* implementation hidden */ }
        public Dialog onCreateDialog(Bundle savedInstanceState) { /* implementation hidden */ }
                        public void onClick(DialogInterface dialog, int which) { /* implementation hidden */ }
                                public void onClick(DialogInterface dialog, int which) { /* implementation hidden */ }
}

        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}
    // KAD: HDMI camera id not fix
    private String getExternalCameraId() { /* implementation hidden */ }
}
