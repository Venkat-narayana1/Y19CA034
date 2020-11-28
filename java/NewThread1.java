class NewThread1 extends Thread
{
public void run()
{
 System.out.println("Thread is running");
 }
public static void main(String args[])
{
 NewThread1 ob1=new NewThread1();
 NewThread1 ob2=new NewThread1();
 Thread t1=new Thread(ob1);
 Thread t2=new Thread(ob2);
 System.out.println("t1="+t1.getState());
 System.out.println("t1="+t2.getState());
 t2.Start();
 System.out.println("t1="+t1.getState());
 System.out.println("t1="+t2.getState());
 }
}