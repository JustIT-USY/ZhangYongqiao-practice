package aa;

public class Shopping {
	
	public static void main(String[] args) {
	Product p1 = new Product();
	Product p2 = new Product();
	Product p3 = new Product();
	Product p4 = new Product();
	Product p5 = new Product();
	p1.setProName("电视机");
	p2.setProName("洗衣机");
	p3.setProName("豆浆机");
	p4.setProName("空调机");
	p5.setProName("吹风机");
	
	Market market = new Market();
	market.setMarketName("家乐福");
	market.getProductArr(new Product[] {p1,p2,p3,p4,p5});
	Person person = new Person();
	person.setName("小韩");
	Product result = Product.shopping(market,"豆浆机");
	if(result != null) {
		System.out.println(p1.getProName());
	}
	}
}

class Product{
	private String proName;
	public String getProName() {
		return proName;
	}
	public static Product shopping(Market market, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
}

class Market{
	private String marketName;
	private Product[] productArr;
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName= marketName;
	}
	public Product[] getProductArr(Product[] products) {
		return productArr;
	}
	Product sell(String name) {
		for(int i=0;i<productArr.length;i++) {
			if(productArr[i].getProName()==name) {
				return productArr[i];
			}
		}
		return null;
	}
 }

class Person{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Product shopping(Market market,String name) {
		return market.sell(name);
	}
	
}