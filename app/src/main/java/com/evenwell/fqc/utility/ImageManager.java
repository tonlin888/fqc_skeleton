//Use for CameraTest
package com.evenwell.fqc.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import android.content.ContentResolver;
import android.content.ContentValues;
//import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.location.Location;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
//import android.provider.MediaStore;
import android.provider.MediaStore.Images;
import android.util.Log;

public class ImageManager { /* implementation hidden */ }
    //private static final String FQC_CAMERA_IAMGE_STORAGE_PATH = "/data/data/com.evenwell.fqc/";
    private ImageManager() { /* implementation hidden */ }
    /**
     * {@code ImageListParam} specifies all the parameters we need to create an
     * image list (we also need a ContentResolver).
     */
    public static class ImageListParam implements Parcelable { /* implementation hidden */ }
        // This is only used if we are creating an empty image list.
        public ImageListParam() { /* implementation hidden */ }
        public void writeToParcel(Parcel out, int flags) { /* implementation hidden */ }
        private ImageListParam(Parcel in) { /* implementation hidden */ }
        public String toString() { /* implementation hidden */ }
            return String.format("ImageListParam{ /* implementation hidden */ }
            public ImageListParam createFromParcel(Parcel in) { /* implementation hidden */ }
            public ImageListParam[] newArray(int size) { /* implementation hidden */ }
        public int describeContents() { /* implementation hidden */ }
}

    // Location
    public enum DataLocation { /* implementation hidden */ }

    // Inclusion

    /*Discretix DRM change start*/

    // No "android.intent.action" beginning App-proprietary intent at Android O (CTS)
    // cannot find anyone need this intent.
    ///**
    // * Given to the ImageGallery as a boolean. Whether to include all DRM Image files.
    // */
    //public static final String EXTRA_IMAGE_SHOW_ALL_DRM_FILES =
    //        "android.intent.extra.image.INCLUDE_ALL_DRM_FILES";
    //
    ///**
    // * Given to the ImageGallery as a boolean. Whether to include only DRM Forwardable image files.
    // */
    //public static final String EXTRA_IMAGE_ONLY_FORWARDABLE =
    //        "android.intent.extra.image.ONLY_FORWARDABLE_IMAGES";
    //
    ///**
    // * Given to the ImageGallery as a boolean. Whether to include only DRM Wallpaper image files.
    // */
    //public static final String EXTRA_IMAGE_ONLY_WALLPAPERS =
    //        "android.intent.extra.image.EXTRA_IMAGE_ONLY_WALLPAPERS";
       /*Discretix DRM change end*/
    // Sort

//            Environment.getExternalStorageDirectory().toString()
//            + "/DCIM/Camera";
//    public static final String CAMERA_IMAGE_BUCKET_ID =
//            getBucketId(CAMERA_IMAGE_BUCKET_NAME);

    /**
     * Matches code in MediaProvider.computeBucketValues. Should be a common
     * function.
     */
//    public static String getBucketId(String path) {
//        return String.valueOf(path.toLowerCase().hashCode());
//    }

    /**
     * OSX requires plugged-in USB storage to have path /DCIM/NNNAAAAA to be
     * imported. This is a temporary fix for bug#1655552.
     */
//    public static void ensureOSXCompatibleFolder() {
//        File nnnAAAAA = new File(
//            Environment.getExternalStorageDirectory().toString()
//            + "/DCIM/100ANDRO");
//        if ((!nnnAAAAA.exists()) && (!nnnAAAAA.mkdir())) {
//            Log.e(TAG, "create NNNAAAAA file: " + nnnAAAAA.getPath()
//                    + " failed");
//        }
//    }

    //
    // Stores a bitmap or a jpeg byte array to a file (using the specified
    // directory and filename). Also add an entry to the media store for
    // this picture. The title, dateTaken, location are attributes for the
    // picture. The degree is a one element array which returns the orientation
    // of the picture.
    //
            Bitmap source, byte[] jpegData, int[] degree) { /* implementation hidden */ }
        // We should store image data earlier than insert it to ContentProvider,
        // otherwise we may not be able to generate thumbnail in time.
}

            //String[] cmdArray = new String[] {"chmod 777 "};

                // do nothing
            //Util.closeSilently(outputStream);

        // Read back the compressed file size.


        // That filename is what will be handed to Gmail when a user shares a
        // photo. Gmail gets the name of the picture attachment from the
        // "DISPLAY_NAME" field.


        // no need to add image into database, for E1M-5965
        //return cr.insert(STORAGE_URI, values);

    public static int getExifOrientation(String filepath) { /* implementation hidden */ }
}
                // We only recognize a subset of orientation tag values.


    private static boolean checkFsWritable() { /* implementation hidden */ }
        // Create a temporary file to see whether a volume is really writeable.
        // It's important not to put it in the root directory which may have a
        // limit on the number of files.
}

    public static boolean hasStorage() { /* implementation hidden */ }
}

    public static boolean hasStorage(boolean requireWriteAccess) { /* implementation hidden */ }
                //return true;//ICS will return false,don't know why
}
//
//    private static Cursor query(ContentResolver resolver, Uri uri,
//            String[] projection, String selection, String[] selectionArgs,
//            String sortOrder) {
//        try {
//            if (resolver == null) {
//                return null;
//            }
//            return resolver.query(
//                    uri, projection, selection, selectionArgs, sortOrder);
//         } catch (UnsupportedOperationException ex) {
//            return null;
//        }
//
//    }
//
//    public static boolean isMediaScannerScanning(ContentResolver cr) {
//        boolean result = false;
//        Cursor cursor = query(cr, MediaStore.getMediaScannerUri(),
//                new String [] {MediaStore.MEDIA_SCANNER_VOLUME},
//                null, null, null);
//        if (cursor != null) {
//            if (cursor.getCount() == 1) {
//                cursor.moveToFirst();
//                result = "external".equals(cursor.getString(0));
//            }
//            cursor.close();
//        }
//
//        return result;
//    }

//    public static String getLastImageThumbPath() {
//        return Environment.getExternalStorageDirectory().toString() +
//               "/DCIM/.thumbnails/image_last_thumb";
//    }
//
//    public static String getLastVideoThumbPath() {
//        return Environment.getExternalStorageDirectory().toString() +
//               "/DCIM/.thumbnails/video_last_thumb";
//    }
//
//    public static String getTempJpegPath() {
//        return Environment.getExternalStorageDirectory().toString() +
//               "/DCIM/.tempjpeg";
//    }

    public static void deletePhotos(){ /* implementation hidden */ }
}
