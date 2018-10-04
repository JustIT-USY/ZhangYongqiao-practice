package aaa;

public class Second extends First{
	
	public Second() {
		super();//调用父类构造方法 子类调用父类的构造函数
		//必须位于子类构造函数的第一句；
		super.function2(); //调用父类成员方法
	}
	public void hahha() {
		//新增方法
		super.function2(); //新增方法中调用父类成员方法
	}
	
	private void function() { //父类中private修饰的方法 无法再子类中调用
		//所以这是一个新方法
		System.out.println("我叫张张");
	}
	
	
@Override
	public void function2() {
		System.out.println("dadsdasda");
		super.function2();
	}
public static void main(String[] args) {
	Second aSecond=new Second();
	aSecond.hahha();
	aSecond.function();
	aSecond.function2();
	
}

}
