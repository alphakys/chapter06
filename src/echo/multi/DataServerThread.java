package echo.multi;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class DataServerThread extends Thread {

	@Override
	public void run() {
		 ServerSocket ss;
		 Socket s ;
		try {
			
			while(true) {
				ss = new ServerSocket();
				
				ss.bind(new InetSocketAddress("192.168.100.15", 10001));
				System.out.println("waitting......");
				
				
			
				s= ss.accept();
				System.out.println("서버 연결 완료");
			}
			
			
			/*
			InputStreamReader isr = new InputStreamReader(s.getInputStream(), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String msg;
			
			
			while(true) {
				msg = br.readLine();
				if(msg==null) {
					break;
				}
				System.out.println(msg);
			}
			
			br.close();
			System.out.println("서버 종료");
			
			
		}
		
	
			*/
	}catch(IOException e) {
			e.printStackTrace();
		}
		
}
}
