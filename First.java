package aaa;

public class First {
	//parseInt方法将 数值（字符串型）转化为数值（int 型）  "456"-->456
	public static void main(String[] args) {
		String str[]= {"89","12","10","38","15"};
		int sum=0;
		for(int i=0;i<str.length;i++) {
			int  zhuanhuan=Integer.parseInt(str[i]);
			sum=sum+zhuanhuan;
		}
	System.out.println("数组和为："+sum);
	}

}
