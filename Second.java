package 向上转型向下转型;

public class Second extends First {
	public Second() {
		super();
		System.out.println("调用父类构造方法");
	}

	/*@Override
	public void function1() {//重写了First中function1方法（更改了修饰权限）
		System.out.println("哈哈哈哈");
	}*/
	
	public static void main(String[] args) {
		First aaa= new Second(); //向上转型（隐试转换）
		aaa.function1();
		Second aFirst= (Second)aaa; //显式转换
		aFirst.function1();
		function2();//调用静态方法
	}
	
}
