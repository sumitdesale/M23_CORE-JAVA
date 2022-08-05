package com.cg.scannerANDbufferreader;

import java.io.*;
public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader b=new BufferedReader( new InputStreamReader(System.in));
		 String str=b.readLine();
		 System.out.println(str);
		

	
}
}
