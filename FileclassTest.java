package com.InputAndOutput;
import java.io.File;

public class FileclassTest {
	public static void main(String[] args) {
		File aFile = new File("c:/Users/13488/Desktop/qiaoge.txt");
		if(aFile.exists()) {
			String aString= aFile.getName(); //获取文件名
			boolean a = aFile.canRead();	//文件属性：是否可读
			long b= aFile.lastModified();	//最后修改时间
			long c = aFile.length();        //文件长度（字节为单位）
			System.out.println(aString+"  "+a+"  "+b+"   "+c);
			/*
			 * 转行则多两个字节，标点符号也为两个字节
			 */
		}else {
			try {
				aFile.createNewFile();
				if(aFile.exists()) {
					String aString= aFile.getName(); //获取文件名
					boolean a = aFile.canRead();	//文件属性：是否可读
					long b= aFile.lastModified();	//最后修改时间
					long c = aFile.length();        //文件长度（字节为单位）
					System.out.println(aString+"  "+a+"  "+b+"   "+c);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
