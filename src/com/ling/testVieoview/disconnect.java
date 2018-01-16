package com.ling.testVieoview;
import android.app.Activity; 

import android.content.Intent; 

import android.view.View; 

import android.os.Bundle; 

//import android.widget.TextView; 

import android.widget.Button; 

public class disconnect extends Activity { 

     

    @Override 

    protected void onCreate(Bundle savedInstanceState) 

    {        

        super.onCreate(savedInstanceState); 

        setContentView(R.layout.successconnect); 

        //设置 

       // TextView myTextView=null; 

        //获取上页设置的扩展参数? 

        Intent intent=this.getIntent(); 

        String mytext=intent.getStringExtra("testExtra"); 

   //     if(mytext!=null && mytext.length()<=0) 
///
    //    { 

    //        mytext="haha_1"; 

      //  } 

       // mytext+=",我已跳过来了!"; 

        //设置文本框的内容 

     //   myTextView=(TextView)this.findViewById(R.id.myTextView2); 

      //  myTextView.setText(mytext); 

         

        //btn_back 添加回退按钮单击处理事件 

        Button disconnect=(Button)this.findViewById(R.id.disconnect); 

        disconnect.setOnClickListener(new BackClickListener()); 

    } 

    //定义添加回退按钮单击处理事件 

    class BackClickListener implements android.view.View.OnClickListener 

    { 

        @Override 

        public  void onClick(View v) 

        { 

            Intent intent=new Intent(); 

            intent.setClass(disconnect.this,connect.class); 

           // intent.putExtra("testExtra", "haha我开始跳了哦！"); 

           disconnect.this.startActivity(intent); 

        } 

    } 

} 