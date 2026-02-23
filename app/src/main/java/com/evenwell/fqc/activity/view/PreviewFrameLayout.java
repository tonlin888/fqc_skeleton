package com.evenwell.fqc.activity.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.evenwell.fqc.R;

public class PreviewFrameLayout extends ViewGroup { /* implementation hidden */ }
    /** A callback to be invoked when the preview frame's size changes. */
    public interface OnSizeChangedListener { /* implementation hidden */ }
//wiya 20110217 add for modify AF rect start {
    //private static int SIZE;
   // private FocusRectangle mFocus;
//wiya 20110217 add for modify AF rect end }
/* FihtdcCode@20110525 KenLin for DMP.B-359 begin */
/* FihtdcCode@20110525 KenLin for DMP.B-359 end */
    public PreviewFrameLayout(Context context, AttributeSet attrs) { /* implementation hidden */ }
    public void setOnSizeChangedListener(OnSizeChangedListener listener) { /* implementation hidden */ }
    protected void onFinishInflate() { /* implementation hidden */ }
//wiya 20110217 add for modify AF rect start {
//        mFocus = (FocusRectangle) findViewById(R.id.focus_rectangle);
//        if (mFocus == null) {
//             Log.v(TAG,"Cannot find resource");
//        }
//wiya 20110217 add for modify AF rect end }
}

    public void setAspectRatio(double ratio) { /* implementation hidden */ }
}
//wiya 20110217 add for modify AF rect start {
    public int getActualWidth() { /* implementation hidden */ }
}

    public int getActualHeight() { /* implementation hidden */ }
}
//wiya 20110217 add for modify AF rect end }

/* FihtdcCode@20110525 KenLin for DMP.B-359 begin */
// Following two functions will return the distance from (0,0) to the left-top
// corner of Preview frame, we need they to set correct focus Coordinate.
    public int getPreviewLeftPadding() { /* implementation hidden */ }
}

    public int getPreviewTopPadding() { /* implementation hidden */ }
}
/* FihtdcCode@20110525 KenLin for DMP.B-359 end */

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) { /* implementation hidden */ }
//wiya 20110217 add for modify AF rect start {
        //if ( FihConfig.getBooleanCust("CAMERA_ENLARGE_FOCUS_ICON") ){
        //   SIZE = 75;
       // }else{
       //     SIZE = 50;
       //}
//wiya 20110217 add for modify AF rect end }
//wiya 20110217 add for modify AF rect start {
        //int horizontalPadding = f.getPaddingLeft() + f.getPaddingRight();
        //int previewHeight = frameHeight - verticalPadding;
//wiya 20110217 add for modify AF rect end }
        // resize frame and preview for aspect ratio
}


//wiya 20110217 add for modify AF rect start {
//wiya 20110217 add for modify AF rect end }


        //Log.d(TAG, "onLayout: (" + l + ", " + t + ") - (" + r + ", " + b
        //    + "), frame = " + frameWidth+ " x " + frameHeight
        //    + ", display = " + mMetrics.widthPixels + " x " + mMetrics.heightPixels);
//        if(FihCameraConfig.isIron()){
                    MeasureSpec.makeMeasureSpec(mMetrics.widthPixels /*480*/, MeasureSpec.EXACTLY),
                    MeasureSpec.makeMeasureSpec(mMetrics.heightPixels /*320*/, MeasureSpec.EXACTLY));
//        }else
//        {
//            mFrame.measure(
//                    MeasureSpec.makeMeasureSpec(frameWidth, MeasureSpec.EXACTLY),
//                    MeasureSpec.makeMeasureSpec(frameHeight, MeasureSpec.EXACTLY));
//            mFrame.layout(l + hSpace, t + vSpace, r - hSpace, b - vSpace);
//        }
// FihtdcCode@20110525 KenLin for DMP.B-359 begin



