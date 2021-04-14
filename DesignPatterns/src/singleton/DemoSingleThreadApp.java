package singleton;

public class DemoSingleThreadApp {

	public static void main(String[] args) {
		
		System.out.println("Instance creation: \n");
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton singletonV2 = Singleton.getInstance("BAR");
		System.out.println("1st instance : " + singleton.value);
		System.out.println("2nd instance : " + singletonV2.value);
		
	}

}
