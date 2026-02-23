/*=========================================================================*
 * FIH Nanjing Design Center                                               *
 * FILENAME    :  ShowIntHeadTestSharp.java                                *
 * CREATED BY  :  @author JimmyChen                                        *
 * CREATED DATE:  2011/8/22                                                *
 *-------------------------------------------------------------------------*
 * PURPOSE: show Int head Test(QC).                                        *
 *                                                                         *
 *                                                                         *
 *=========================================================================*/

package com.evenwell.fqc.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.lang.Runtime;
import com.evenwell.fqc.FQCTestItemListActivity;
import com.evenwell.fqc.FQCXmlParseHandler;
import com.evenwell.fqc.R;
import com.evenwell.fqc.baseActivity.BaseActivity;
import com.evenwell.fqc.utility.FQCLog;

import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;


public class HandsetLoopbackTest extends BaseActivity{ /* implementation hidden */ }
    //private ArrayList<String> mCommandStrOn = new ArrayList<String>();
    //private ArrayList<String> mCommandStrOff = new ArrayList<String>();
    //private FQCConfig mConfig;
       // mConfig = new FQCConfig(this);
}




        @Override
        public void handleMessage(Message msg) { /* implementation hidden */ }
}

//    private void parseCommandAndOn(){
//
//        //1.parse file
//        //2.Command begin
//        //3.Command end
//        File file = new File("/system/etc/snd_soc_msm/LOOPBACK");
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//            StringBuilder sb = new StringBuilder();
//            String temp = null;
//            boolean haveChecked = false;
//            boolean haveCheckedOn = false;
//            boolean haveCheckedOff = false;
//            while ((temp = br.readLine()) != null) {
//                if(temp.contains("MIC1toSPK")){
//                    haveChecked = true;
//                    continue;
//                }
//
//                //save on command
//                if(haveChecked){
//                    if(temp.contains("EnableSequence")){
//                        haveCheckedOn = true;
//                        continue;
//                    }
//                    if(haveCheckedOn){
//                        if(temp.contains("amix")){
//                            mCommandStrOn.add(temp);
//                            continue;
//                        }
//                        if(temp.contains("EndSequence")){
//                            haveCheckedOn = false;
//                            continue;
//                        }
//                    }
//
//                }
//                //save off command
//                if(haveChecked){
//                    if(temp.contains("DisableSequence")){
//                        haveCheckedOff = true;
//                        continue;
//                    }
//                    if(haveCheckedOff){
//                        if(temp.contains("amix")){
//                            mCommandStrOff.add(temp);
//                            continue;
//                        }
//                        if(temp.contains("EndSequence")){
//                            haveCheckedOff = false;
//                            break;
//                        }
//                    }
//
//                }
//            }
//            for(String s:mCommandStrOn){
//                FQCLog.Logv("1",s);
//                IntHeadSetStart(s.trim());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//            FQCLog.Logv("1","Off");
//            for(String s:mCommandStrOff){
//                FQCLog.Logv("1",s);
//            }
//        }
//        catch (UnsupportedEncodingException e) {
//            FQCLog.Logv("UnsupportedEncodingException"+e.getMessage());
//        }
//        catch (FileNotFoundException e) {
//            FQCLog.Logv("FileNotFoundException"+e.getMessage());
//        }
//        catch (IOException e) {
//            FQCLog.Logv("IOException"+e.getMessage());
//        }finally{
//            try {
//                 if(br!=null){
//                     br.close();
//                 }
//            } catch (IOException e) {
//                FQCLog.Logv("IOException"+e.getMessage());
//            }
//        }
//
//    }

    public void IntHeadSetStart(String cmd){ /* implementation hidden */ }
}

    @Override
    protected void onStop() { /* implementation hidden */ }
          //parseCommandAndOn();
//            for(String s:mCommandStrOff){
//                IntHeadSetStart(s.trim());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
}

    @Override
    public void onBackPressed() { /* implementation hidden */ }
}

    private void lockedBackKey(){ /* implementation hidden */ }
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

