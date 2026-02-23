package com.evenwell.fqc.activity;

import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class JogballActivity extends BaseActivity { /* implementation hidden */ }
    protected void onCreate(Bundle savedInstanceState) { /* implementation hidden */ }
        // TODO Auto-generated method stub
    public class InternalSelectionView extends View { /* implementation hidden */ }
        public InternalSelectionView(Context context, int numRows) { /* implementation hidden */ }
        public InternalSelectionView(Context context, int numRows, String label) { /* implementation hidden */ }
        public InternalSelectionView(Context context, AttributeSet attrs) { /* implementation hidden */ }
        private void init() { /* implementation hidden */ }
        public int getNumRows() { /* implementation hidden */ }
        public int getSelectedRow() { /* implementation hidden */ }
        public void setDesiredHeight(int desiredHeight) { /* implementation hidden */ }
        public String getLabel() { /* implementation hidden */ }
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { /* implementation hidden */ }
        private int measureWidth(int measureSpec) { /* implementation hidden */ }
                // We were told how big to be
        private int measureHeight(int measureSpec) { /* implementation hidden */ }
                // We were told how big to be
}


        @Override
        protected void onDraw(Canvas canvas) { /* implementation hidden */ }
                // draw background rect
                // draw forground rect
}

                // draw text to help when visually inspecting


        private int getRowHeight() { /* implementation hidden */ }
}

        public void getRectForRow(Rect rect, int row) { /* implementation hidden */ }
}


        void ensureRectVisible() { /* implementation hidden */ }
}

        @Override
        public boolean onTrackballEvent(MotionEvent e) { /* implementation hidden */ }
}


        /* (non-Javadoc)
        * @see android.view.KeyEvent.Callback#onKeyDown(int, android.view.KeyEvent)
        */
        public boolean onKeyDown(int keyCode, KeyEvent event) { /* implementation hidden */ }
}

        @Override
        public void getFocusedRect(Rect r) { /* implementation hidden */ }
}

        @Override

                        // set the row that is closest to the rect
                        // can't gleam any useful information about what internal
                        // selection should be...

        @Override
        public String toString() { /* implementation hidden */ }
}

    @Override
    public int getTestElapsedTime() { /* implementation hidden */ }
        // ej 20140805 start
        //return COST_TIME;
        // ej 20140805 end
}

    @Override
    public int getTestMode() { /* implementation hidden */ }
}

  //JUL-2013 oliver For Params flexibility START
    @Override
    protected boolean setParamsByConfig(boolean Activate) { /* implementation hidden */ }
        // TODO Auto-generated method stub
}
    //JUL-2013 oliver For Params flexibility END

