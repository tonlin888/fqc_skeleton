package com.evenwell.fqc.activity;

import java.io.InputStream;
import java.util.ArrayList;

import com.evenwell.fqc.R;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.text.StaticLayout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout.Alignment;
import android.util.Log;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.evenwell.fqc.utility.DataBaseConfig;
import com.evenwell.fqc.utility.FQCConfig;
import com.evenwell.fqc.utility.FQCLog;







    class Point { /* implementation hidden */ }
        Point(int _x, int _y) { /* implementation hidden */ }
}

    private void readConfig() { /* implementation hidden */ }
            // read config from fqc.xml
                // for HATO round display
}


            // background image
            // remove point. be careful, the order should be from smallest to largest. ex "1,3,5,7,9"
            // add point. ex. "100,300;400,500;470,600"
            // add line. ex.(0,0)-(1080,2280);(0,2280)-(1080,0)
            // offset check point (smaller then panel)




    private void drawBackground(int width, int height) { /* implementation hidden */ }
}
        // show text


    private void adjustCheckPoint(int width, int height) { /* implementation hidden */ }
            // remove point by index
}

            // add point by (x, y)
                    //Log.d(TAG, "checker_dbg pt = " + pt);
                        //Log.d(TAG, "checker_dbg index = " + index + ", " + pos[0]);
                            //Log.d(TAG, "checker_dbg add point [" + index + "] = " + r.toShortString());

            // add line. ex.(0,0)-(1080,2280);(0,2280)-(1080,0)


    public void Initialize(int width, int height, int p_off, int l_off, int r_off, int b_off) { /* implementation hidden */ }
        /* FihtdcCode@20150626 YiYu add for refine Touch Lens layout START */
            // ShowTouchPanel always hide navigation bar
}



        /* FihtdcCode@20150626 YiYu add for refine Touch Lens layout END */





    @Override
    public void onDraw(Canvas canvas) { /* implementation hidden */ }
}

    @Override











    public String complete() { /* implementation hidden */ }
}

    private String appendTrackStr(int x, int y) { /* implementation hidden */ }
            // new point is different from last point
}

    private class Checker { /* implementation hidden */ }
        //private int mWidth, mHeight;
        Checker(int radious, int tolerance) { /* implementation hidden */ }
}

        Checker(int width, int height, int tolerance) { /* implementation hidden */ }
}

        public void remove(int index) { /* implementation hidden */ }
}

        public void drawCheckPoint() { /* implementation hidden */ }
}

        public int size() { /* implementation hidden */ }
}

        public void insert(int index, Rect r) { /* implementation hidden */ }
}

        public void append(ArrayList<Rect> r) { /* implementation hidden */ }
}

        public ArrayList<Rect> generate(Rect r, int tolerance) { /* implementation hidden */ }
}


        public ArrayList<Rect> gen_line(int x1, int y1, int x2, int y2, int tolerance) { /* implementation hidden */ }
}

        public ArrayList<Rect> generate(int left, int top, int width, int height, int tolerance) { /* implementation hidden */ }
            // left side
            // bottom side
            // right side
            // top side
}

        public String completed() { /* implementation hidden */ }
                    //Log.d(TAG2, "completed, index = " + i + "  is not complete!");
}

        // translate (x, y) to flag index
        public int set(int x, int y) { /* implementation hidden */ }
}


                // draw check point
