package exam;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class IODemo {
	
		
		public static void main(String[] args)
			{
			URLConnection urlcon=null;
			
			try
			{
				
			URL url=new URL("https://github.com/prasanth9653/prasanth/tree/master") ;
					urlcon=url.openConnection();
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			try
			(	BufferedInputStream bio=new BufferedInputStream(urlcon.getInputStream());
				FileOutputStream fio=new FileOutputStream("git.html");		
			)
			{
				byte [] b=new byte[128];
				 int bytes= 0;
			 while((bytes=bio.read(b))!=-1){
				
				
				
				 fio. write(b,0,bytes);
				
				
			 }
			}catch(Exception e
					)
			{
				e.printStackTrace();
			}
			}

}
