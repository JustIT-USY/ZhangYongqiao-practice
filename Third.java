package aaa;

public  class  Third {
	public static void main(String[] args) {
		Amountgoods amountgoods= new Amountgoods("王老吉", 2.5, 5);
		Gravitygoods aGravitygoods = new Gravitygoods("香蕉", 3.3, 2.1);
		System.out.println(amountgoods.toString()+"\t数量："+amountgoods.getamount()
		+"\t计价:"+amountgoods.totalPrice());
		System.out.println(aGravitygoods.toString()+"\t数量："+aGravitygoods.getgravity()
		+"\t计价:"+aGravitygoods.totalPrice());
		System.out.println("共计："+(aGravitygoods.totalPrice()+amountgoods.totalPrice()));
	}
	
}
abstract class T{
	String name;
	double price;
	double gravityoramount;
	
	abstract double totalPrice() ; //创建总价格抽象方法
	public abstract String toString(); //重写Object类中的toString方法 用来输出商品信息
	
	public T(String name,double price,double gravity) { //构造方法 并初始化
			this.name=name;
			this.price= price;
			this.gravityoramount=gravity;
		}
	String getName() {//返回商品名称
		return this.name;
	}
	double getPrice() {//返回商品价格
		return this.price;
	}
}
//--------------------------------------------------
class Amountgoods extends T{ //实现Third抽象类 以数量计算价格
	public Amountgoods(String name,double price,int amount) {
		super(name, price, amount);
	}
	public int getamount() { //Amountgoods中的特有方法
		return (int)this.gravityoramount; //返回商品数量
	}
	
	public double totalPrice() { //覆盖方法
		return price*gravityoramount; //返回总价格
	}
	public String toString() {//返回价格信息
		return this.getName()+"\t"+this.price+"\t$/个";
	}	
}
//---------------------------------------------------
class Gravitygoods extends T{ //以重量计算价格
	public Gravitygoods(String name,double price,double d) {
		super(name, price, d);
	}
	public double getgravity() {
		return gravityoramount;
	}
	public  double totalPrice() {
		return price*gravityoramount;
	}
	public String toString() {
		return this.getName()+"\t"+this.price+"\t$/Kg";
	}
}

