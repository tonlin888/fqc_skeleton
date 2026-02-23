package com.evenwell.fqc.activity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

import com.evenwell.fqc.FQCParamsByConfigHelper;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

public class ClickTest extends BaseActivity { /* implementation hidden */ }
    public void onResume() { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // delete all diff files
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
            // read check point
}
                // get center point
                // read diff point index (only "diff point" need to check diff)


    private boolean overDiff(String node, int threshold) { /* implementation hidden */ }
}


        public ClickView(Context context) { /* implementation hidden */ }
}

        @Override
        public boolean onTouchEvent(MotionEvent event) { /* implementation hidden */ }
                    // keep diff file
}

                    // touch event position should be in this area





        @Override
        public void onDraw(Canvas canvas) { /* implementation hidden */ }
            // set font size
}

            // draw hint


            // draw counter
