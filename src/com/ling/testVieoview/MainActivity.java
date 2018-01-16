package com.ling.testVieoview;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private adbtest mAdbExec;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	setContentView(R.layout.main);   
    	super.onCreate(savedInstanceState);
           
        mAdbExec = new adbtest(getApplicationContext(),this);
    }
    
    public void clickUp(View v)
    {
    	mAdbExec.runCommand("adb shell input keyevent 19");
   }
    public void clickDown(View v)
    {
    	//handle up event
    	// issue adb command to mock a down keyevent
    	mAdbExec.runCommand("adb shell input keyevent 20");
    }
    public void clickLeft(View v)
    {
    	//handle up event
    	// issue adb command to mock a left keyevent
    	mAdbExec.runCommand("adb shell input keyevent 21");
    }
    public void clickRight(View v)
    {
    	//handle up event
    	// issue adb command to mock a right keyevent
    	mAdbExec.runCommand("adb shell input keyevent 22");
    	
    }
    public void clickOK(View v)
    {
    	//handle up event
    	// issue adb command to mock a ok keyevent
    	mAdbExec.runCommand("adb shell input keyevent 23");
    }
    @SuppressLint("NewApi")
	public void clickConnect(View v)
    {
    	EditText et = (EditText)findViewById(R.id.editText1);
    	String ip = et.getText().toString();
    	//adb connect to the target ip
    	if(!ip.isEmpty())
    	{
    		String command="adb connect "+ip;
    		mAdbExec.runCommand(command);
    	}
    	
    }
}