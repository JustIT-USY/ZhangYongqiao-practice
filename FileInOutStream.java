package com.InputAndOutput;
import java.io.*;
public class FileInOutStream {
	public static void main(String[] args) throws IOException {
		File aFile = new File("c:/Users/13488/Desktop/桥哥.txt");
		if(aFile.exists()){
			FileOutputStream aFileOutputStream =new FileOutputStream(aFile);
			byte but[]="大风车转呀转不停，转呀转呀转不停".getBytes();
			aFileOutputStream.write(but);
			aFileOutputStream.close();
			FileInputStream aFileInputStream = new FileInputStream(aFile);
			byte but2[] = new byte[100];
			int len = aFileInputStream.read(but2);
			System.out.println("文件中的信息是："+new String(but2, 0, len)+"   "+len);
			aFileInputStream.close();
		}else {
			try {
				aFile.createNewFile();
				FileOutputStream aFileOutputStream =new FileOutputStream(aFile);
				byte but[]="大风车转呀转不停,怎么肥四 小老弟".getBytes();
				aFileOutputStream.write(but);
				aFileOutputStream.close();
				FileInputStream aFileInputStream = new FileInputStream(aFile);
				byte but2[] = new byte[100];
				int len = aFileInputStream.read(but2);
				System.out.println("文件中的信息是："+new String(but2, 0, len)+"   "+len);
				aFileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
