package 十一月1日;

public class First extends Thread{
	public First() {
		super();
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("这是一个线程，重写run方法");
		
	}
	/**
	   * 生产者生产出来的产品交给店员
	   */
	  public synchronized void produce()
	  {
	      if(this.product >= MAX_PRODUCT)
	      {
	          try
	          {
	              wait();  
	              System.out.println("产品已满,请稍候再生产");
	          }
	          catch(InterruptedException e)
	          {
	              e.printStackTrace();
	          }
	          return;
	      }

	      this.product++;
	      System.out.println("生产者生产第" + this.product + "个产品.");
	      notifyAll();   //通知等待区的消费者可以取出产品了
	  }

	  /**
	   * 消费者从店员取产品
	   */
	  public synchronized void consume()
	  {
	      if(this.product <= MIN_PRODUCT)
	      {
	          try 
	          {
	              wait(); 
	              System.out.println("缺货,稍候再取");
	          } 
	          catch (InterruptedException e) 
	          {
	              e.printStackTrace();
	          }
	          return;
	      }

	      System.out.println("消费者取走了第" + this.product + "个产品.");
	      this.product--;
	      notifyAll();   //通知等待去的生产者可以生产产品了
	  }
	public static void main(String[] args) {
		First aFirst = new First();
		aFirst.start();
		
	}
	
}
