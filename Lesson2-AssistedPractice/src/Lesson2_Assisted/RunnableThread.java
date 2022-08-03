package Lesson2_Assisted;

public class RunnableThread implements Runnable{
	public void run() 
	{
			for(int i=0;i<9;i++) 
			{
				System.out.println(i);
			}
	}	
}
class Threads{
		public static void main(String[] args) {
			RunnableThread numi=new RunnableThread();
			Thread t=new Thread(numi);
			t.start();
		}
}
