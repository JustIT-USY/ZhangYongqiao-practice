package aaa;

import java.util.Random;

public class First {
	 static Random random = new Random();
	  private final int VALUE_1=9;
	  private static final int VALUE_2=10;
	  private final  Test test = new Test();//定义为final型的应用只能指向唯一对象
	  private final int i4=random.nextInt(20);//输出0-19随机整数
	  private static final int i5=random.nextInt(20); //静态final型 随机数 数值不会改变（运行可知）
	  
	  public String toString() {
		return i4+" "+i5+" ";		 
	  }
	  
	  public static void main(String[] args) {
		First aFirst= new First();
		//aFirst.test=new Test(); 此时再次指向其他引用出现错误
		System.out.println(aFirst.toString());
		aFirst.test.i=10; //虽然test为静态引用，但是修改对象的属性（内容）并不会报错
		//只要不修改对象本身即可；
		System.out.println(aFirst); //输出随机数（一个非静态 一个静态）
		System.out.println(new First());//这一句没看懂！！！！
		System.out.println(VALUE_2);  //静态常量
		System.out.println(aFirst.VALUE_1); //非静态常量
	}
}   
/**
 * 由运行结果可知 每次运行的用静态变量接受的随机数值 不会改变
 * 但是由非静态变量接受的会改变
 * 要做到真正的对象不改变 需要使用final +static
 *page 204-205（java从入门到精通）
 */
class Test{
	int i=0;
}