package com.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer1 {
	public static void main(String[] args) {
		String filePath = "c:"+File.separator+"compile"+File.separator;
		String fileName = "myFile.txt";
		char[] cbuf = new char[50];
		int size = 0;
		boolean newFile = false;
		
		try{
			File file = new File(filePath + fileName);
			System.out.println("file.exists(): " + file.exists());
			newFile = file.createNewFile();
			System.out.println("newFile: " + newFile);
			System.out.println("file.exists(): " + file.exists());
			
			
			System.out.println("file.isFile(): " + file.isFile());
			System.out.println("file.isDirectory(): " + file.isDirectory());
			
			
			File file2 = new File(filePath);
			//File file2 = new File(filePath+File.separator+"newD1");
			System.out.println("file2.isFile(): " + file2.isFile());
			System.out.println("file2.isDirectory(): " + file2.isDirectory());
			//System.out.println("file2.mkdir(): " + file2.mkdir());
			
			String[] strArr = file2.list();
			System.out.print("strArr.length: " + strArr.length);
			for (String string : strArr) {
				System.out.print(string + ", ");
			}
			
			
			//
			FileWriter fw = new FileWriter(file, true);
			fw.write("hi\n");
			fw.flush();
			fw.close();
			
			PrintWriter pw = new PrintWriter(file);
			pw.printf("hala1 hala \n");
			//pw.write("hala1 hala1 \n");
			
			pw.flush();
			pw.close();
			//
			FileReader fr = new FileReader(file);
			size = fr.read(cbuf);
			for(char ch : cbuf){
				System.out.print(ch);
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}