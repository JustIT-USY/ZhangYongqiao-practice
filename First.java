package aaa;

public class First {//内部内的实例绑定在外部类实例上
	Second aSecond = new Second();//在外部类创建内部类对象
	int x; //外部类成员变量
	public void function1() {	
	}
//*******************************************
	class Second{ //内部类
		public Second() {
			// TODO Auto-generated constructor stub
		}
		public void function2() {
			
		}
	int y=0;
	
	}
	//**************************************
	public Second function3() {
		aSecond.y=10;//在外部类中通过在外部类创建的内部类对象调用内部类成员变量
		x=5;
		return new Second();
	}
	//***************************************************
	public static void main(String[] args) {
		First aFirst = new First();
		First.Second bSecond= aFirst.new Second(); //在外部类主方法中创建一个
		//内部类的对象
		/** 
		 *     page209********************
		 */
		//aFirst.aSecond.y=58;
		aFirst.function3();
		bSecond.y=10; //当在主方法直接创建了内部类的对象时，则可调用内部类的成员变量
		System.out.println(aFirst.x+" "+aFirst.aSecond.y);
	}
}
