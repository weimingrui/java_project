package com.ling.testVieoview;
import res.layout.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import java.io.InputStream;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloCommand extends Activity {
    /** Called when the activity is first created. */
        private TextView tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //@#$$%%^&&tv = (TextView)findViewById(R.id.tv01);
        try {
                execCommand("./data/kenshin/x.sh");   
                } catch (IOException e) {
                       // TODO Auto-generated catch block
                        e.printStackTrace();
                } 
    } 
    public void execCommand(String command) throws IOException {
        // start the ls command running
            //String[] args =  new String[]{"sh", "-c", command};
        Runtime runtime = Runtime.getRuntime();  
        Process proc = runtime.exec(command);        //��仰����shell��߼����Լ�ĵ���
                                                     //����в����Ļ�����������һ�������ص�exec����
        //ʵ��������ִ��ʱ������һ���ӽ���,��û�и����̵Ŀ���̨
        //Ҳ�Ϳ��������,����������Ҫ����������õ�shellִ�к�����
        InputStream inputstream = proc.getInputStream();
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader); 
        // read the ls output
        String line = "";
        StringBuilder sb = new StringBuilder(line);
        while ((line = bufferedreader.readLine()) != null) {
            //System.out.println(line);
                sb.append(line);
                sb.append('\n');
        }
        tv.setText(sb.toString());
        //ʹ��execִ�в����ִ�гɹ��Ժ�ŷ���,������������
        //������ĳЩ������Ǻ�Ҫ����(���縴���ļ���ʱ��)
        //ʹ��wairFor()���Եȴ�����ִ������Ժ�ŷ���
        try {
            if (proc.waitFor() != 0) {
                System.err.println("exit value = " + proc.exitValue());
            } 
        }
        catch (InterruptedException e) {  
            System.err.println(e);
        }
    }
}


