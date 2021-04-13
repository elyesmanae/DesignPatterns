package prototype;

public class DemoCache {

	public static void main(String[] args) {

		BundledShapeCache cache = new BundledShapeCache();

		Shape shape1 = cache.get("small black circle");
		Shape shape2 = cache.get("small gray rectangle");
		Shape shape3 = cache.get("small gray rectangle");

		if (shape1 != shape2 && !shape1.equals(shape2)) {
			System.out.println("small black circle != small gray rectangle");
		} else {
			System.out.println("small black circle == small gray rectangle");
		}

		if (shape2 != shape3) {
			System.out.println("small gray rectangle are two different objects");
			if (shape2.equals(shape3)) {
				System.out.println("And they are identical");
			} else {
				System.out.println("But they are not identical");
			}
		} else {
			System.out.println("Rectangle objects are the same");
		}
	}

}
