package arraylist;
import java.util.*;
public class _0arraylist {
	public static void main(String[] args) {
		Collection<String> c2 = new ArrayList<>(); //实例化集合对象
		c2.add("a");//向集合里面添加对象元素
		c2.add("b");
		c2.add("c");
		Iterator<String> iterator = c2.iterator(); //创建迭代器
		while(iterator.hasNext()) {//判断是否有下一元素
			String string = iterator.next(); //获取集合内元素
			System.out.println(string);
		}
	}
	
	
	
}
