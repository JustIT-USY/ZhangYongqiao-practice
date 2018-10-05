package aaa;

public class FirstJC {
	

	public static void main(String[] args) {
	//自定义类中比较两个对象内容需要重写equal方法 
	//若不重写则比较的是两个对象的引用地址（并非内容（与==一样））
	Second aSecond = new Second("123");
	Second bSecond = new Second("123");
	System.out.println(aSecond.equals(bSecond)); //重写后 两个对象内容相同 返回true
	//equal 已经在Second中重写
	String aString=new String("abc");
	String bString=new String("abc");
	System.out.println(aString.equals(bString));
	//java 中的一些封装类已经重写，可直接比较
	}

}
