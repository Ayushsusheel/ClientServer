//package client_server;

import java.io.*;
import java.net.*;


class server 
{

public static void main(String[] args) throws Exception
	
{

ServerSocket ss=new ServerSocket(8090);
Socket s=ss.accept();

System.out.println("CLIENT connected...");

DataInputStream din =new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String s1="",s2="";
while(!s1.equals("stop"))
{
	s1=din.readUTF();
	System.out.println("CLIENT:" + "  " + s1 + " \n");
	
	s2=br.readLine();
	dout.writeUTF(s2);
	
	dout.flush();
	
}
din.close();
s.close();
ss.close();


}

}
