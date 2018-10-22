package aaa;

public class Third {
	
	public static void main(String[] args) {
		Demo aDemo = new Demo();
		aDemo.x=10;
		aDemo.function1();
		System.out.println(aDemo.x);
	}
}
final class Demo{ //定义一个静态类
	int x;			//类中所有的方法均被系统隐试的设置为final  成员变量可final 可非final
	void function1() {
		System.out.println("大沙雕哈");
	}
	
	
}