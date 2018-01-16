package com.ling.testVieoview;
import android.app.Activity;  //是Activity所在的包 

import android.content.DialogInterface; 

import android.content.DialogInterface.OnClickListener; 

import android.content.Intent; 

import android.os.Bundle;     //用于映射字符串的值 

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

        setContentView(R.layout.main); //设置当前视图为main主界面布局R.Layout.main 

        //给按钮添加单击事件 

         myButton=(Button)this.findViewById(R.id.IPconnect); 

        // myButton.setText("跳转到另一个界面Activity"); 

         myButton.setOnClickListener(new MyButtonListener()); 

    } 

    class MyButtonListener implements android.view.View.OnClickListener 

    { 

        @Override 

        public  void onClick(View v) 

        { 

             //生成一个Intent对象 

            //intent是提供Activity直接交互的抽象描述，可以被startActivty运行。 

            //intent提供了一个媒介，提供组件的相互调用， 

            //实现调用者和被调用者之间的解耦. 

            Intent intent=new Intent(); 

            intent.setClass(connect.this,disconnect.class); 

          //  intent.putExtra("testExtra", "haha我开始跳了哦！"); 

            connect.this.startActivity(intent); 

        }        

    }    

} 

