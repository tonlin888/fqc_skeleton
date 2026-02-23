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

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.TextureView;
import android.view.WindowManager;
import android.widget.FrameLayout;

/**
 * A {@link TextureView} that can be adjusted to a specified aspect ratio.
 */
public class AutoFitTextureView extends TextureView { /* implementation hidden */ }
    public AutoFitTextureView(Context context) { /* implementation hidden */ }
    public AutoFitTextureView(Context context, AttributeSet attrs) { /* implementation hidden */ }
    public AutoFitTextureView(Context context, AttributeSet attrs, int defStyle) { /* implementation hidden */ }
    /**
     * Sets the aspect ratio for this view. The size of the view will be measured based on the ratio
     * calculated from the parameters. Note that the actual sizes of parameters don't matter, that
     * is, calling setAspectRatio(2, 3) and setAspectRatio(4, 6) make the same result.
     *
     * @param width  Relative horizontal size
     * @param height Relative vertical size
     */
    public void setAspectRatio(int width, int height) { /* implementation hidden */ }
}

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { /* implementation hidden */ }
        //setMeasuredDimension(width, height);// tony
}

