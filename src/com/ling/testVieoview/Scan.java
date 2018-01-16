package com.ling.testVieoview;

import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.PrintStream;  
import java.net.Socket;  
import java.net.SocketTimeoutException;  

import android.os.AsyncTask;
import android.util.Log;
public class Scan {
	//scan the local network for a service that will be running.
	private final String TAG = "Banner";
	private String banner = "";
	protected  void ScanAddress(String iIPv4_1,int port)throws IOException {
		//int port = 1338;	
    PrintWriter out = null;
    BufferedReader in = null;
    
 //Extraction of IP string, from ip to 255 of circular scanning
    String xiIPv4[] = null;
    final String[] iIPv4_2=iIPv4_1.split("\\.");//The IP string into a character array
    int iIPv4_3=Integer.parseInt(iIPv4_2[iIPv4_2.length-1]);//An array of IP characters change finally a string into an integer type
    for (int i = 1; i < 254; i++){

        try {

			System.out.println(iIPv4_3+i);
            //Socket kkSocket = null;
			//Socket client = new Socket("127.0.0.1", port);
           // Socket kkSocket = new Socket( "iIPv4", port );
			 iIPv4_3+=1;
			 
			String IPv4_4 = Integer.toString(iIPv4_3);
			for(int x=0;x<iIPv4_2.length;x++)
			{
				if(x==iIPv4_2.length-1.)
			{
					xiIPv4[x]=IPv4_4;}
			   else
			   {
				 xiIPv4[x]=iIPv4_2[x];
				 xiIPv4[x+1]=".";
			}
			}
			
			String IPv4="" ;
			for(int y = 0; y < xiIPv4.length; y++)
			{
				IPv4=IPv4+xiIPv4[y];
			}
            Socket kkSocket = new Socket();
            kkSocket.bind( null ); // bind socket to random local address, but you might not need to do this
            kkSocket.connect( new InetSocketAddress(IPv4, port), 500 ); //timeout is in milliseconds
           // kkSocket.setKeepAlive(false);
           // kkSocket.setSoTimeout(5);
           // kkSocket.setTcpNoDelay(false);  

           // out = new PrintWriter(kkSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(kkSocket.getInputStream()));
           // out.println("Scanning!");
            String fromServer;
            while ((fromServer = in.readLine()) != null) {
              //  System.out.println("Server: " + fromServer);
                //if (fromServer.equals("Server here!"))
                    break;
            }
            in.close();
            kkSocket.close();
            Log.v(TAG, banner);
            //return null;
        }
        //catch (UnknownHostException e) {

       // }
        //catch (IOException e) {

       // } 
    catch(IOException e)
        {
        	   e.printStackTrace();
        	  }
        	  
    }
    
    }
    public static void main (String[] args) {
    	//check the port open
        String host="put hostname here";
        int port=443;
        try{
            Socket s = new Socket(host,port);
            System.out.println("Can listen on port "+port+
                       " in host "+host+" is open");

        } //end try
        catch (IOException ex)
        {
            //remote host is not listening on port 443
            System.out.println("Can not listen on port "+port+
                       " of host "+host);
        } //end catch
    }
}
