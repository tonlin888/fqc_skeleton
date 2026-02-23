package com.evenwell.fqc.utility;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * A button designed to be used for the on-screen shutter button.
 * It's currently an {@code ImageView} that can call a delegate when the
 * pressed state changes.
 */
public class ShutterButton extends ImageView { /* implementation hidden */ }
    /**
     * A callback to be invoked when a ShutterButton's pressed state changes.
     */
    public interface OnShutterButtonListener { /* implementation hidden */ }
        /**
         * Called when a ShutterButton has been pressed.
         *
         * @param b The ShutterButton that was pressed.
         */
    public ShutterButton(Context context) { /* implementation hidden */ }
    public ShutterButton(Context context, AttributeSet attrs) { /* implementation hidden */ }
    public ShutterButton(Context context, AttributeSet attrs, int defStyle) { /* implementation hidden */ }
    public void setOnShutterButtonListener(OnShutterButtonListener listener) { /* implementation hidden */ }
    /**
     * Hook into the drawable state changing to get changes to isPressed -- the
     * onPressed listener doesn't always get called when the pressed state
     * changes.
     */
    protected void drawableStateChanged() { /* implementation hidden */ }
                // When pressing the physical camera button the sequence of
                // events is:
                //    focus pressed, optional camera pressed, focus released.
                // We want to emulate this sequence of events with the shutter
                // button. When clicking using a trackball button, the view
                // system changes the the drawable state before posting click
                // notification, so the sequence of events is:
                //    pressed(true), optional click, pressed(false)
                // When clicking using touch events, the view system changes the
                // drawable state after posting click notification, so the
                // sequence of events is:
                //    pressed(true), pressed(false), optional click
                // Since we're emulating the physical camera button, we want to
                // have the same order of events. So we want the optional click
                // callback to be delivered before the pressed(false) callback.
                //
                // To do this, we delay the posting of the pressed(false) event
                // slightly by pushing it on the event queue. This moves it
                // after the optional click notification, so our client always
                // sees events in this sequence:
                //     pressed(true), optional click, pressed(false)
                    public void run() { /* implementation hidden */ }
}

    private void callShutterButtonFocus(boolean pressed) { /* implementation hidden */ }
}

    @Override
    public boolean performClick() { /* implementation hidden */ }
}
