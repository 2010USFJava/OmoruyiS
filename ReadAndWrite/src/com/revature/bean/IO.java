package com.revature.bean;

import java.io.OutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class IO {
	/* Write */
	public void writeOutputSteam(String content) {
		OutputStream os=null;
		File file = new File("outpu.txt");
		
		try {
		os = new FileOutputStream(file, false);
		os.write(content.getBytes());
		} catch(FileNotFoundException e) {
		e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
			}
		
		if(os != null) {
			try {
				os.close();
			} catch(IOException e) {
			e.printStackTrace();
			}	
		}
	}
	
	public String readInputStream() {
		InputStream is = null;
		File file = new File("inpute.txt");
		StringBuilder s = new StringBuilder();
		
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int b = 0;
		try {
			while((b = is.read()) != -1 ) {
				char c = (char)b;
				s.append(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}