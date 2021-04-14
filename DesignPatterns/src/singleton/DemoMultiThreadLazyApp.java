package singleton;

public class DemoMultiThreadLazyApp {

	public static void main(String[] args) {
		System.out.println("Instance creation: \n");
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		
		threadFoo.start();
		threadBar.start();
	}

	static class ThreadFoo implements Runnable {

		@Override
		public void run() {
			SingletonLazyLoading singletonFoo = SingletonLazyLoading.getInstance("FOO");
			System.out.println("1st Thread : " + singletonFoo.value);
		}
		
	}
	
	static class ThreadBar implements Runnable {

		@Override
		public void run() {
			SingletonLazyLoading singletonBar = SingletonLazyLoading.getInstance("BAR");
			System.out.println("2nd Thread : " + singletonBar.value);
		}
		
	}
}
