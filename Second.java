package aaa;

public class Second { //此代码简单明了的阐述.......
	Neibu aNeibu =new Neibu();
	int a;
	class Neibu{
		int b;
	class Neibuneibune{
			//超级内部类
			int c;
		}
	}
	public static void main(String[] args) {
		Second aSecond= new Second();
		//aSecond.aNeibu.nei = 10;//如果不想通过这个语句；那么....下一句
		Second.Neibu bNeibu = aSecond.new Neibu(); //这个语句就是了
		bNeibu.b=10; //直接有调用 不需要aSecond.aNeibu......
		aSecond.a=100;
		
		Second.Neibu.Neibuneibune neibuneibune = aSecond.aNeibu.new Neibuneibune();//超级内部类的对象的创建
		neibuneibune.c= 10; //对超级内部类中成员变量的赋值
	}
}
/**
 * 内部类的继承：   public class 外部类 extends XXXA.XXXB{     }
 							
 							class XXXA{
 							class XXXB{ //xxxA的内部类
 							
 							}
 							}																								
 */
		

