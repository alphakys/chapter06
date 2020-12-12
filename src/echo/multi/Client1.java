package echo.multi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
		public static void main(String[] args)throws IOException {
			
			Socket s = new Socket();
			
			System.out.println("server connecting~~~");
			s.connect(new InetSocketAddress("192.168.100.15", 10001));
			
			System.out.println("=========================");
			
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			
			
			String str;
		
			
			while(true) {
				str = sc.nextLine();
				if("/q".equals(str)) {
					break;
				}
				else {
					bw.write(str);
					bw.flush();
				}
			}
			
			System.out.println("메세지 전송 끝");
			
			

			bw.close();
			s.close();
		}
}
