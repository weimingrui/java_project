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

        //���� 

       // TextView myTextView=null; 

        //��ȡ��ҳ���õ���չ����? 

        Intent intent=this.getIntent(); 

        String mytext=intent.getStringExtra("testExtra"); 

   //     if(mytext!=null && mytext.length()<=0) 
///
    //    { 

    //        mytext="haha_1"; 

      //  } 

       // mytext+=",������������!"; 

        //�����ı�������� 

     //   myTextView=(TextView)this.findViewById(R.id.myTextView2); 

      //  myTextView.setText(mytext); 

         

        //btn_back ��ӻ��˰�ť���������¼� 

        Button disconnect=(Button)this.findViewById(R.id.disconnect); 

        disconnect.setOnClickListener(new BackClickListener()); 

    } 

    //������ӻ��˰�ť���������¼� 

    class BackClickListener implements android.view.View.OnClickListener 

    { 

        @Override 

        public  void onClick(View v) 

        { 

            Intent intent=new Intent(); 

            intent.setClass(disconnect.this,connect.class); 

           // intent.putExtra("testExtra", "haha�ҿ�ʼ����Ŷ��"); 

           disconnect.this.startActivity(intent); 

        } 

    } 

} 