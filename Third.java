package aaa;

public class Third extends First{
	public Third() {
		super(); //调用父类构造方法
		// TODO Auto-generated constructor stub
	}
	public void add() {
		System.out.println("新增方法");
	}
	public static void main(String[] args) {
		First aFirst =new Third();

		if(aFirst instanceof First) {
			Third aThird = (Third)aFirst;
			aThird.add();
		}
		
	}
}
