package Ch28;

public class C03Thread extends Thread {
	
	public void run() {
		while(true)
		{
			System.out.println("Thread ������");
			if(Thread.interrupted())
				break;
		}
		System.out.println("�ڿ������κ�~");
		System.out.println("��������");
	}

}