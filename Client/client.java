//package client_server;

import java.io.*;
import java.net.*;

 class client {

	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("localhost",8090);

                DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));


                System.out.println("Enter you name CLIENT?");
                String name=b.readLine();
                  System.out.println("********************************************************");
                  System.out.println("*** WELCOME" + "   " + name + " to ANONYMOUS SERVER ***");
                  System.out.println("********************************************************\n");
		
		
		
		String s1="",s2="";
		while(!s1.equals("stop"))
		{
			s1=b.readLine();
			dout.writeUTF(s1);
			dout.flush();
			
			s2=din.readUTF();
			System.out.println("SERVER:" + " " + s2 + " \n");
			
		}
		dout.close();
		s.close();
		
		

	}

}
