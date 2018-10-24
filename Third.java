package aaa;

public class Third {
	int x;
	Test aTest =new Test();
	void function1() {
		aTest.y=0;
		x=10;
	}
	static int aa;
	static void function3() {
		System.out.println("static 型function3");
	}
	//静态内部类******************************
	static class Test{
		int y;
		void function2() {
			//x=10;  静态内部类无法使用外部类的非静态成员
			//function1();
			aa=100; //使用外部类的静态变量和方法
			function3();
		}
		public static void main(String[] args) {
			System.out.println("dashadiao");
			Third.Test bTest = new Test();
			bTest.y=100;
			Third aThird = new Third();
			aThird.aTest.y=1000;
			bTest.function2(); 
		}
	}
	//final型内部类****************
	final class Ab{
		//慢脑子的骚操作
	}
}
