package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	public static void main(String[]args) {
		FileInputStream inStream=null;
		FileOutputStream outStream=null;
		try {
			inStream = new FileInputStream("./testFileInput.txt");
			outStream = new FileOutputStream("./testFileOutput.txt");
			int content;
			while((content=inStream.read())!=-1) {
				outStream.write((byte)content);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
