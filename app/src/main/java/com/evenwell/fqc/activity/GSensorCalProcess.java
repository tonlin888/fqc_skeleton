/*=========================================================================*
 * FIH Taiwan Design Center                                                *
 * FILENAME    :  GSensorCal.java                                          *
 * CREATED BY  :  Neo CFYen                                                *
 * CREATED DATE:  2009 Nov.                                                *
 * PURPOSE: Process of G-Sensor Calibration.                               *
 *=========================================================================*/
package com.evenwell.fqc.activity;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GSensorCalProcess { /* implementation hidden */ }
    // } FIH;Louis;2010/9/16
    public GSensorCalProcess(Context c){ /* implementation hidden */ }
            // } FIH;Louis;2010/9/21
}

        /* (130, 165)     (193, 165)       (256, 165)
         *   +-----------------|-----------------+
         *   |  plastic tube   O                 |
         *   +-----------------|-----------------+
                 * on the right of screen
         * */

        //Transfer px to dp for multiple screen support
//      String screenResoultion = FihConfig.getStringCust("SYS_SCREEN_RESOLUTION");
//      if(screenResoultion.equals("QVGA-Landscape")){ /*AL1S Project*/
//          aLowerBound  = (int)(202*(aXdpi/DEFAULT_DENSITY));
//          aUpperBound = (int)(278*(aXdpi/DEFAULT_DENSITY));
//          aCenterPosition = (int)(240*(aXdpi/DEFAULT_DENSITY));
//      }
//      /* B: FannyWan,2011/11/17,fix TNQ.B-24-DUT should shows landscape UI for GSensor Calibration */
//      else if(screenResoultion.equals("HVGA")){ /*TinQ Project*/
//          aLowerBound  = (int)(181*(aXdpi/DEFAULT_DENSITY));
//          aUpperBound = (int)(261*(aXdpi/DEFAULT_DENSITY));
//          aCenterPosition = (int)(221*(aXdpi/DEFAULT_DENSITY));
//      }
//      /* E: FannyWan,2011/11/17,fix TNQ.B-24-DUT should shows landscape UI for GSensor Calibration */
//      else /* IRM,TBP,ITV and soo on */
//      {
//      }
//      float tempX = 0;
//      tempX = (-roughX);
    /* FihtdcCode@20150626 YiYu add for refine calibrate layout START */
    public int getBubblePositionX(float roughX, float aXdpi, int tubeLeft, int tubeRight) { /* implementation hidden */ }
        /***
         *   (tubeLeft, bubbleY)  (tubeCenter, bubbleY)   (tubeRight, bubbleY)
         *            +----------------------|----------------------+
         *            |     plastic tube     O                      |
         *            +----------------------|----------------------+
         *
         ***/
}
    /* FihtdcCode@20150626 YiYu add for refine calibrate layout END */

        /* plastic tube
         *   +-----+ (35, 111)
         *   |     |
         *   -  O  - (35, 174)
         *   |     |
         *   +-----+ (35, 237)
                 * on the left of screen
         * */

        //Transfer px to dp for multiple screen support

//      String screenResoultion = FihConfig.getStringCust("SYS_SCREEN_RESOLUTION");
//      if(screenResoultion.equals("QVGA-Landscape")){ /* ALIS Project */
//          aLowerBound  = (int)(46*(aYdpi/DEFAULT_DENSITY));
//          aUpperBound = (int)(175*(aYdpi/DEFAULT_DENSITY));
//          aCenterPosition = (int)(88*(aYdpi/DEFAULT_DENSITY));
//      }
//      /* B: FannyWan,2011/11/17,fix TNQ.B-24-DUT should shows landscape UI for GSensor Calibration */
//      else if(screenResoultion.equals("HVGA")){ /* TinQ Project */
//          aLowerBound  = (int)(30*(aYdpi/DEFAULT_DENSITY));
//          aUpperBound = (int)(110*(aYdpi/DEFAULT_DENSITY));
//          aCenterPosition = (int)(70*(aYdpi/DEFAULT_DENSITY));
//      }
//      /* E: FannyWan,2011/11/17,fix TNQ.B-24-DUT should shows landscape UI for GSensor Calibration */
//      else  /* IRM,TBP,ITV and soo on */
//      {
//      }


//      float tempY = 0;
//      tempY = (-roughY);
    /* FihtdcCode@20150626 YiYu add for refine calibrate layout START */
    public int getBubblePositionY(float roughY, float aYdpi, int tubeTop, int tubeBottom) { /* implementation hidden */ }
        /*** plastic tube
         *      +---+ (bubbleX, tubeTop)
         *      |   |
         *      |   |
         *      - O - (bubbleX, tubeCenter)
         *      |   |
         *      |   |
         *      +---+ (bubbleX, tubeBottom)
         *
         ***/
}
    /* FihtdcCode@20150626 YiYu add for refine calibrate layout END */

    // } FIH;Louis;2010/9/16
    private String getDeviceModel() { /* implementation hidden */ }
                //devModelStr = Build.MODEL + '_';
}
                //Log.i("Rogerccyen-----------", "CameradevModelStr = " + devModelStr);
                    //Log.e(
                    //    "IO Exception when getting Build version for Device Info screen",
                //     e);
