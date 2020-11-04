package com.revature.bean;

import java.io.File;

import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.InputStream;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;


/* [A] IO : OutputStream (Write)
 * [a1] Opening an "OutputStream" named (os) and assign null value
 * [a2] Creating a "FILE" named (file) = new File(output.txt)
 * [a3*] Using "os = FileOutputStream(file, boolean)" to:
 * - Pass "FILE" to "OutputStream" or
 * - Pass (file) to (os)
 * [a3.1] Overwrites content in file
 * [a3.2] Appends content in file
 * [a4] Write the contents in bytes to the "OutputStream" or (os)
 * [a5] If the stream is not empty close "OutputStream"!!!!
 * 
 * 
 * [B] IO : InputStream (Read)
 * [b1] Opening an "InputStream" named (is) and assign null value
 * [b2] Creating a "FILE" named (file) = new File(input.txt)
 * [b3] Using "is = FileInputStream(file)" to:
 * - Pass "FILE" to "InputStream" or
 * - Pass (file) to (is)
 * [b3] StringBuilder
 * [b4] -1 equal EOF
 * 		read() (is) object and assign each (char)value to char c
 * 		Append each value of char c to StringBuilder s
 * [b4.1] Cleans out the buffer
 * [b5] If the stream is not empty close "InStream"!!!!
 * [b6] Return StringBuilder --> s.toString();
 * 
 * [C] Exception
 * [c1] Need a try/catch for FILE_NOT_FOUND
 * [c2] Need a try/catch for IOException
 */


/* Notes: 
 * 1. Use "IO" Class to instantiate an instance/object 
 *    and call the class method --> public void writeOutputStream(String content)
 * 2. Write method is passing (String content) returns void
 * 3. Read method is passing () returns String
 * 4. When writing to a file, if the file is not there is will be created
 */

public class IO { //[Notes : 1]
	
	/* [A] Output/Write CODE  */
	public void writeOutputStream(String content) { //[Notes : 2]
		
		OutputStream os = null; //[a1]
		
		File file = new File("output.txt"); //[a2]
		
		try { //[C] Exceptions
			
			// [a3]
			// os = new FileOutputStream(file, false); //[a3.1]
			os = new FileOutputStream(file, true); //[a3.2]
			os.write(content.getBytes()); //[a4]
		
			} catch(FileNotFoundException e) { //[c1]
				
				e.printStackTrace();
			
			} catch(IOException e) { //[c2]
				
				e.printStackTrace();
			}
		
		
		if(os != null) { //[a5]
			try {
				os.close(); 
				
			} catch(IOException e) { //[c2]
				
			e.printStackTrace();
			}	
		}
	} // END OF METHOD
	

	
	/* [B] Input/Read CODE  */
	public String readInputStream(){ //[Notes : 3]
	
		InputStream is = null; //[b1]
		File file = new File("input.txt"); //[b2]
		StringBuilder s = new StringBuilder(); //[b3]
		
		try {
			
			is = new FileInputStream(file);
			
		} catch (FileNotFoundException e) { //[c1]
			
			e.printStackTrace();
		}
		
		
		//[b4] 
		
		int b = 0; //[b4.1] 
		try {
			while( (b = is.read()) != -1 ) {
				char c = (char)b;
				s.append(c);
			}
		}catch(IOException e) { //[c2]
			e.printStackTrace();
		}
		
		if(is != null) { //[b5]
			try {
				is.close(); 
				
			} catch(IOException e) { //[c2]
				
			e.printStackTrace();
			}	
		}
		
		return s.toString(); //[b6]
		
	}
}