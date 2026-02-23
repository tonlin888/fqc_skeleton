package com.evenwell.fqc.activity.view;

import com.evenwell.fqc.R;
import com.evenwell.fqc.utility.FQCLog;

import android.content.Context;

import android.graphics.*;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
public class FCIView extends View{ /* implementation hidden */ }
//[IWP-issue] Display Total/Manual/Auto Rounds overlap by Gary fixed 20131113
    public FCIView(Context context) { /* implementation hidden */ }
    public FCIView(Context context, AttributeSet attrs){ /* implementation hidden */ }
    public FCIView(Context context, AttributeSet attrs, int defaultStyle){ /* implementation hidden */ }
    private void initPaint(){ /* implementation hidden */ }
}

    public void setTestPass(boolean isPass,int time){ /* implementation hidden */ }
        // ej 20140324 start - for M07 framework
        //mElapsedTime = mContext.getString(R.string.fci_elapsed_time,mTotalTime);
        //mPassResult = mContext.getString(R.string.fci_pass);
        //mFailResult = mContext.getString(R.string.fci_fail);
        // ej 20140324 end
}

    @Override
    protected void onDraw(Canvas canvas) { /* implementation hidden */ }
 //[IWP-issue] Display Total/Manual/Auto Rounds overlap by Gary fixed 20131113 START
  //[IWP-issue] Display Total/Manual/Auto Rounds overlap by Gary fixed 20131113 END
            //canvas.drawColor(0XA000FF00);//canvas.drawColor(Color.RED);
            //canvas.drawColor(0XA0FF0000);//
}

 //[IWP-issue] Display Total/Manual/Auto Rounds overlap by Gary fixed 20131113 START
//[IWP-issue] Display Total/Manual/Auto Rounds overlap by Gary fixed 20131113 END

    private int getRowY() { /* implementation hidden */ }
}

    private int getRowX(String str) { /* implementation hidden */ }
}

    public int getContentWidth(Paint p,String str) { /* implementation hidden */ }
}
