package aaa;
 
interface drawTest { //定义接口
	public abstract void draw(); //此处abstract 可以省略，因为所有接口的方法都是抽象方法
	//没有方法体  
}
public class First {
	void function1() {
		System.out.println("父类方法 能做些什么");
	}
	//内部类
	public class A extends First implements drawTest{ //继承父类实现接口
		public void draw() { //实现接口并对draw方法进行重写 使其有意义
			System.out.println("A实现了接口能做些什么");
		}
		
		void function1() {
			System.out.println("A继承父类能做些什么");
		}
		
	}
	//内部类
	public static class B extends First implements drawTest{//继承父类实现接口
		public void draw() {
			System.out.println("B实现了一个接口，能做些什么");
		}
		
		void function1() {
			System.out.println("B继承父类能做些什么");
		}
	}
	
	public static void main(String[] args) {
		First aFirst = new First(); //关于内部类的调用
		//非静态内部类的实例是寄生在外部类的实例中的，要访问非静态内部类，
		//前提是外部类的实例已经存在。
		drawTest[] aDrawTest= {aFirst.new A() ,new B()};//静态内部类与非静态内部类的调用区别
		for(int i = 0; i<aDrawTest.length;i++) {
		aDrawTest[i].draw();
		}
	}
}
