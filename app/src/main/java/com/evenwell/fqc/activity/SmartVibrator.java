package com.evenwell.fqc.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.os.VibrationEffect;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * reference QC 7630  Emily add
 *
 */
public class SmartVibrator extends BaseActivity { /* implementation hidden */ }
    final long[][] mTimings = { /* implementation hidden */ }
    final int[][] mAmplitudes = { /* implementation hidden */ }
    final int[][] mMaxAmplitudes = { /* implementation hidden */ }
    final VibrationEffect[] mEffect = { /* implementation hidden */ }
    final VibrationEffect[] mMaxEffect = { /* implementation hidden */ }
    final long[][] mVibrateTime = { /* implementation hidden */ }
    private Runnable mShowResultViewRunnable = new Runnable() { /* implementation hidden */ }
        public void run() { /* implementation hidden */ }
    private long getDuration(int repeat) { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
    protected void onDestroy() { /* implementation hidden */ }
    protected void onPause() { /* implementation hidden */ }
    protected void onResume() { /* implementation hidden */ }
    private OnClickListener mVibrateBtnListener = new OnClickListener() { /* implementation hidden */ }
        public void onClick(View arg0) { /* implementation hidden */ }
                    // avoid to guess vibrate by duration
                    mShowResultViewHandler.postDelayed(mShowResultViewRunnable, getDuration(mVibrateTime.length - 1 /*mVibratRepeatFreq*/));
    private void initBtn() { /* implementation hidden */ }
    private void vibrating(boolean enable, int repeat) { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
}
