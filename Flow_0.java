package com.InputAndOutput;
import java.io.File;

public class Flow_0 {
	//c:/Users/13488/Desktop
	public static void main(String[] args) {
	File file = new File("c:/Users/13488/Desktop/qiaoge.txt"); //指定路径创建文件
	if(file.exists()) { //判断文件是否存在
		file.delete();
		System.out.println("文件已删除");
	}else {
		try {
			file.createNewFile();
			System.out.println("文件已创建");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	}

	
}
