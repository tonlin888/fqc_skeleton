package com.evenwell.fqc.activity.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;

public class MTView extends View { /* implementation hidden */ }
    public MTView(Context context) { /* implementation hidden */ }
        // SurfaceHolder holder = getHolder();
        // holder.addCallback(this);
        // setFocusable(true); // make sure we get key events
        // setFocusableInTouchMode(true); // make sure we get touch events
    private void init() { /* implementation hidden */ }
}




    @Override
    protected void onDraw(Canvas canvas) { /* implementation hidden */ }
        //
}

    class TouchStripMonitor { /* implementation hidden */ }
        TouchStripMonitor(int l, int t, int r, int b) { /* implementation hidden */ }
        void setSize(int l, int t, int r, int b) { /* implementation hidden */ }
        void clear() { /* implementation hidden */ }
        void setOffset(int w, int h) { /* implementation hidden */ }
        void gotEvent(MotionEvent event) { /* implementation hidden */ }
        void draw(Canvas c, Paint p) { /* implementation hidden */ }
        boolean inRange() { /* implementation hidden */ }
        boolean isOk() { /* implementation hidden */ }
}


    public void setupTouchStrip(int left, int top, int right, int bottom, int p) { /* implementation hidden */ }
}

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) { /* implementation hidden */ }
}

    private void drawTouchStrip(Canvas c) { /* implementation hidden */ }
}

    private void drawBezel(Canvas c) { /* implementation hidden */ }
        //
}
                // clear everything




                    //drawBezelCircle(x, y, touchPaints[id], c);
                            //

    public boolean onBzlEvent(MotionEvent event) { /* implementation hidden */ }
        //super.onBzlEvent(event);
}
        //update(null);

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent event) { /* implementation hidden */ }
}
