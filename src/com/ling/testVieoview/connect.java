package com.ling.testVieoview;
import android.app.Activity;  //��Activity���ڵİ� 

import android.content.DialogInterface; 

import android.content.DialogInterface.OnClickListener; 

import android.content.Intent; 

import android.os.Bundle;     //����ӳ���ַ�����ֵ 

import android.view.View; 

import android.widget.Button; 

import android.widget.TextView; 

 

public class connect extends Activity 

{ 

    Button myButton=null; 

    @Override 

    public void onCreate(Bundle savedInstanceState)  

    { 

        super.onCreate(savedInstanceState); 

        setContentView(R.layout.main); //���õ�ǰ��ͼΪmain�����沼��R.Layout.main 

        //����ť��ӵ����¼� 

         myButton=(Button)this.findViewById(R.id.IPconnect); 

        // myButton.setText("��ת����һ������Activity"); 

         myButton.setOnClickListener(new MyButtonListener()); 

    } 

    class MyButtonListener implements android.view.View.OnClickListener 

    { 

        @Override 

        public  void onClick(View v) 

        { 

             //����һ��Intent���� 

            //intent���ṩActivityֱ�ӽ����ĳ������������Ա�startActivty���С� 

            //intent�ṩ��һ��ý�飬�ṩ������໥���ã� 

            //ʵ�ֵ����ߺͱ�������֮��Ľ���. 

            Intent intent=new Intent(); 

            intent.setClass(connect.this,disconnect.class); 

          //  intent.putExtra("testExtra", "haha�ҿ�ʼ����Ŷ��"); 

            connect.this.startActivity(intent); 

        }        

    }    

} 

