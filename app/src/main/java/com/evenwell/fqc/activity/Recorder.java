package com.evenwell.fqc.activity;

import java.io.File;
import java.io.IOException;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Bundle;
import android.os.Environment;

public class Recorder implements OnCompletionListener, OnErrorListener { /* implementation hidden */ }
    public interface OnStateChangedListener { /* implementation hidden */ }
    public Recorder() { /* implementation hidden */ }
}

    public void saveState(Bundle recorderState) { /* implementation hidden */ }
}

    public int getMaxAmplitude() { /* implementation hidden */ }
}

    public void restoreState(Bundle recorderState) { /* implementation hidden */ }
}

    public void setOnStateChangedListener(OnStateChangedListener listener) { /* implementation hidden */ }
}

    public int state() { /* implementation hidden */ }
}

    public int progress() { /* implementation hidden */ }
}

    public int sampleLength() { /* implementation hidden */ }
}

    public File sampleFile() { /* implementation hidden */ }
}

    /**
     * Resets the recorder state. If a sample was recorded, the file is deleted.
     */
    public void delete() { /* implementation hidden */ }
}

    /**
     * Resets the recorder state. If a sample was recorded, the file is left on disk and will
     * be reused for a new recording.
     */
    public void clear() { /* implementation hidden */ }
}

    public void startRecording(int outputfileformat, String extension, int audiosourcetype, int codectype) { /* implementation hidden */ }
}


        // Handle IOException


    public void stopRecording() { /* implementation hidden */ }
}

    public void startPlayback() { /* implementation hidden */ }
}


    public void stopPlayback() { /* implementation hidden */ }
}

    public void stop() { /* implementation hidden */ }
}

    public boolean onError(MediaPlayer mp, int what, int extra) { /* implementation hidden */ }
}

    public void onCompletion(MediaPlayer mp) { /* implementation hidden */ }
}

    private void setState(int state) { /* implementation hidden */ }
}
    public int getState(){ /* implementation hidden */ }
}
    private void signalStateChanged(int state) { /* implementation hidden */ }
}

    private void setError(int error) { /* implementation hidden */ }
}
