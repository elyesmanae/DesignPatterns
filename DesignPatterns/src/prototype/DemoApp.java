package prototype;

import java.util.ArrayList;
import java.util.List;

public class DemoApp {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		List<Shape> shapesCopy = new ArrayList<>();

		Circle circle = new Circle();
		circle.x = 20;
		circle.y = 30;
		circle.radius = 15;
		circle.color = "blue";
		shapes.add(circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = 20;
		rectangle.height = 30;
		rectangle.color = "green";
		shapes.add(rectangle);
		
		cloneAndCompare(shapes,shapesCopy);
	}

	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}
		
		for (int i = 0; i < shapes.size(); i++) {
			if(shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + " the 2 shapes are different objects!");
				if(shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + " the 2 shapes are identical!");
				} else {
					System.out.println(i + " the 2 shapes are not identical!");
				}
			} else {
				System.out.println(i + " the 2 shapes are the same objects!");
			}
		}
	}

}
