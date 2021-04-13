package prototype;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
	
	private Map<String, Shape> cache = new HashMap<>();
	
	public BundledShapeCache() {
		Circle circle = new Circle();
		circle.x = 2;
		circle.y = 3;
		circle.radius = 2;
		circle.color = "black";
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = 2;
		rectangle.height = 3;
		rectangle.color = "gray";
		
		cache.put("small black circle", circle);
		cache.put("small gray rectangle", rectangle);
	}
	
	public Shape put(String key, Shape shape) {
		cache.put(key, shape);
		return shape;
	}
	
	public Shape get(String key) {
		return cache.get(key).clone();
	}
}
