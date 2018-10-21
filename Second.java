package aaa;

public class Second extends First{

		int c;
		
		public static void main(String[] args) {
			
			Second aFirst = new Second();
			aFirst.x=10;
			aFirst.c=12;
			First aFirst2 = new Second();
			// First aFirst2;
			//new Second();
			//aFirst2 = new Second();
			if(new Second() instanceof First) {
				System.out.println("aaaaa");
			}if(aFirst2 instanceof First) {
				System.out.println("bbbbbb");
			}
		}
}
