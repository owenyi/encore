package thread.step2.test;
/*
 * Runnable 인터페이스를 구현해서 Thread를 만들어본다.
 * Thread는 2개를 생성한다.
 * GoThread, ComeThread
 */
class GoThread implements Runnable {

	public void run() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 현재 실행 중인 쓰레드의 이름을 리턴하는 기능...Thread
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name : " + tname + ", " + i);
//			System.out.println("Go..." + i);
			i++;
			if (i == 20) break;
		}
	}
			
}

class ComeThread implements Runnable {
	
	public void run() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name : " + tname + ", " + i);
//			System.out.println("Come..." + i);
			i++;
			if (i == 20) break;
		}
	}
			
}

public class GoComeThread {

	public static void main(String[] args) {

		// GoComeThread라는 프로세스 안에서 2개의 쓰레드를 동작시켜보도록 하자
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();
		
		Thread t1 = new Thread(go, "GoThread");
		Thread t2 = new Thread(come, "ComeThread");
		
		t1.start();
		t2.start();

	}

}
