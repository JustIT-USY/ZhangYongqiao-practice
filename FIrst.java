package 注册系统;

import java.util.Scanner;

public class FIrst extends Functions{
	//写一个账号注册系统
	/**1.账号界面
	 * 	2.自己拟定一个账号（邮箱或手机号）
	 * 	3.系统通过账号发送验证码
	 * 	4.用户输入验证码系统进行验证
	 * 	5.自己输入一个密码
	 * 	6.再次输入密码进行确认
	 * 	7.系统判定 是否成功
	 * 	8.输出注册的账号密码
	 */
	// *********并没有些循环操作（返回上一级）**********程序按照正确的来 一次性流程 错了就废了
	int a;
	int b;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FIrst other = (FIrst) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("  *      1.账号注册                   *  ");
		System.out.println(" *        2.退出                         *  ");
		System.out.println("----------------------");
		System.out.println("请选择：");
		int i=0;
		FIrst aFIrst = new FIrst();
		Scanner aScanner =new Scanner(System.in);
		i = aScanner.nextInt();
		switch (i) {
		case 1:
			aFIrst.acount();
			aFIrst.identifyCode();
			aFIrst.testCode();
			aFIrst.inPut();
			aFIrst.outPut();
			break;
		case 2:
				System.out.println("程序退出!");
				
			break;
		default:
			System.out.println("你输入错误！");
			break;
		}
	}

	@Override
	String acount() {
		System.out.println("输入你的账号（邮箱或手机号）:");
		Scanner aScanner = new Scanner(System.in);
		String string=aScanner.next(); //用户输入的账号
		//aScanner.close(); //关闭
		System.out.println("账号："+string);
		return string;
	}

	@Override
	int identifyCode() {
	//	1000+(int)(Math.random()*9000); //系统产生的验证码并发送至手机
		
		return 1000+(int)(Math.random()*9000);
	}

	@Override
	void testCode() { //对用户输入的验证码与系统验证码进行对比
		Scanner aScanner = new Scanner(System.in);
		System.out.println("请输入验证码：");
		int Systemnum = identifyCode();//将系统产生验证码传入这里
		System.out.println("你收到的验证码:"+Systemnum);
		int userNum = aScanner.nextInt();//用户输入的验证码
		
		//aScanner.close();
		if(Systemnum==userNum) {
			System.out.println("验证正确！");
			
		}else {
			System.out.println("验证码输入错误！");
			System.exit(0);
		}	 
	}

	@Override
		String inPut() {
		System.out.println("接下来输入密码：");
		Scanner aScanner = new Scanner(System.in);
		String str = aScanner.next();
		System.out.println("请再次输入：");
		String str2 = aScanner.next();
		//aScanner.close();
		if(str.equals(str2)) {
			System.out.println("密码正确！");
			return str;
		}else {
			System.out.println("输入错误！");
			return "";
		}
	}

	@Override
	void outPut() {
		System.out.println("注册成功！");
	//	System.out.println("账号为："+acount() +"密码为："+inPut());
		
	}
}


//*************************************************************************************
abstract class Functions{ //定义抽象类
	abstract String acount();  //用于用户拟定账号
	abstract int identifyCode(); //系统发出验证码 
	abstract void testCode(); //验证 验证码
	abstract String inPut();  //输入密码并再次输入 系统判定
	abstract void outPut();  //系统对其输出你所注册的账号和密码
	
}
