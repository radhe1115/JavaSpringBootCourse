class Counter  {
int counter;
public synchronized void increment(){
	System.out.printf(Thread.currentThread().getName()+" is running %d times \n");
	counter++;
} 
}
class PrinterTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}
class ATread implements Runnable {

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("India");
    }
  }
}

class BTread implements Runnable {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("D");
    }
  }
}

public class LearnThreads {

  public static void main(String args[]) throws InterruptedException {
    // ATread obj = new ATread();
    // BTread obj1 = new BTread();

    // obj1.setPriority(Thread.MIN_PRIORITY);

    // obj.start();
    // obj1.start();

    Runnable obj1 = () -> {
      for (int i = 0; i < 1000; i++) {
        try{
          System.out.println("India");
          Thread.sleep(5);
        }catch(InterruptedException e){
          System.out.println(e.getMessage()+"\n"+ e.getStackTrace());
        }
      }
    };
    Runnable obj2 = () -> {
      for (int i = 0; i < 1000; i++) {
        try{
          System.out.println("Delhi");
          Thread.sleep(100);
        }catch(InterruptedException e){
          System.out.println(e.getMessage()+"\n"+ e.getStackTrace());
        }
      }
    };
    
    //Thread t1 = new Thread(obj1);
    //Thread t2 = new Thread(obj2);

    //t1.start();
    //t2.start();

 Counter count = new Counter();

 Runnable obj3 = () -> {
      for (int i = 0; i < 1000; i++) {
	System.out.printf("T1 is running %d times \n",i);
	count.increment();
      }
    };

 Runnable obj4 = () -> {
      for (int i = 0; i < 1000; i++) {
	System.out.printf("T2 is running %d times \n",i);
	count.increment();
      }
    };

    Thread t1 = new Thread(obj3,"T1"); // thread is Created - New State
    Thread t2 = new Thread(obj4,"T2"); // thread is Created - New State

    t1.start(); // R
    t2.start();

t1.join();
t2.join();
	
System.out.println(count.counter);
System.out.println("-------------------------------------");

Runnable task = new PrinterTask();

Thread t5 = new Thread(task, "Worker-1");
Thread t6= new Thread(task, "Worker-2");

t5.start();
t6.start();



t5.join();
t6.join();
	

  }
}
