package singleton;

public final class SingletonLazyLoading {

	private static volatile SingletonLazyLoading instance;
	public String value;

	private SingletonLazyLoading(String value) {
		this.value = value;
	}

	public static SingletonLazyLoading getInstance(String value) {

		SingletonLazyLoading result = instance;
		if (result != null) {
			return result;
		}
		synchronized (SingletonLazyLoading.class) {
			if (instance == null) {
				instance = new SingletonLazyLoading(value);
			}
			return instance;
		}
	}
}
