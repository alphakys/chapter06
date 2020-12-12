package echo.multi;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	

	public static void main(String[] args)throws IOException {
			Thread t = new DataServerThread();
		/*
		
		
		
		ServerSocket ss = new ServerSocket();
		
		ss.bind(new InetSocketAddress("192.168.100.15", 10001));
		System.out.println("waitting......");
		
		Socket s ;
		
		
		 */
		
		// 입력 스트림
		Socket s=null;
			
			t.start();
	
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
	
}
