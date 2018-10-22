package aaa;

public class Second {
	public void function1() {
		System.out.println("111111111111");
	}	
	public Second() {
		System.out.println("222222222222");
	}
	public static final void function2() {
		System.out.println("3333333333333");
	}
	public static void main(String[] args) {
		
		{
			System.out.println("44444444444444");
		}
		Second aSecond =new Second();
		function2();
		aSecond.function1();
		
		
	}
}
