package aaa;

public  class Second {
	int a;
	int b;
	
	public Second(String string) {
		System.out.println("this is a 字符串");
		
	}
@Override // //重写equal方法和hashcode方法 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override //重写equal方法和hashcode方法  
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Second other = (Second) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
}
