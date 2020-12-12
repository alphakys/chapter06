package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)throws IOException {
		
		ServerSocket serversocket = new ServerSocket();
		
		String hostAddress = InetAddress.getLocalHost().getHostAddress();
	
		
		serversocket.bind(new InetSocketAddress("192.168.100.15",10001));
		
		
		
		
		
		System.out.println("서버시작");
		System.out.println("============================");
		System.out.println("연결을 기다리고 있습니다");
		
		Socket socket = serversocket.accept();
		System.out.println("클라이언트가 연결되었습니다");
		
		//받기용
		InputStream is = socket.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		
		//보내기용
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
	
		//메세지 받기
		
		String str; 
		
		while(true) {
			str= br.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		
		
		//서버 종료
		
		br.close();
		bw.close();
		
		
		System.out.println("서버 종료");
		serversocket.close();
		
		
		
		
		
		
		
		
		
	}

}
