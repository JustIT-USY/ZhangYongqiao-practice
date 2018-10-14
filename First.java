package aaa;

public class First {
	private First[] test= new First[6]; //创建一个装First类的数组 //6个空间
	private int nextIndex = 0;
	
	public void draw(First q) {
		if(nextIndex < test.length) {
		test[nextIndex]=q;
		System.out.println(nextIndex);
		nextIndex++;
		}
	}
	 class Second extends First{
		
		public Second() {
			System.out.println("第二个");
		}
	}
	 class  Third extends First{
		
		public  Third() {
			System.out.println("第三个");
		}
	}
	
	public static void main(String[] args) {
		First qFirst = new First();
		
	}

}
