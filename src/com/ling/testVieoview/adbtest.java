package com.ling.testVieoview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;

@SuppressLint("NewApi")
public class adbtest extends Activity
{
	private String TAG = "adbtest";
	private Context mContext;
	private MainActivity mActivity;

	public adbtest(Context c, MainActivity a)
	{
		mContext = c;
		mActivity = a;
	}
	
	public  String runCommand(final String command) {
        final String[] strarray=command.split(" ");
           new Thread(new Runnable(){        	   
        	    @Override
        	    public void run(){
                try {  
                    Process ps = Runtime.getRuntime().exec(strarray);  
                    ps.waitFor();  
          
                    BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));  
                    StringBuffer sb = new StringBuffer();  
                    String line;  
                    while ((line = br.readLine()) != null) {  
                        sb.append(line).append("\n");  
                    }  
                    String result = sb.toString();  
                    System.out.println(result);  
                    Log.i(TAG, "adb cmd result="+result);
                    }   
                catch (Exception e) {  
                    e.printStackTrace();  
                    }              
        	    }
           }).start();
           
           return "";
		}
		
}

        
        

