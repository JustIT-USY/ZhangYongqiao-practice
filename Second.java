package aaa;

public class Second {
	
	//toString方法将数值（int 型）转换为 数值（字符串型） 456-->"456"
	
	public static void main(String[] args) {
		String string=Integer.toString(456);
		String string2=Integer.toBinaryString(456);
		String string3=Integer.toOctalString(456);
		String string4=Integer.toHexString(456);
		System.out.println("十进制 "+string);
		System.out.println("八进制 "+string3);
		System.out.println("二进制 "+string2);
		System.out.println("十六进制 "+string4);
		
}

}
