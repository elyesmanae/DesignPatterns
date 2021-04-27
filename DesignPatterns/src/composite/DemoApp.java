package composite;

import java.awt.Color;

public class DemoApp {

	public static void main(String[] args) {
		ImageEditor editor = new ImageEditor();

		editor.loadShapes(new Circle(20, 20, 20, Color.RED),

				new CompoundShape(new Circle(120, 120, 50, Color.DARK_GRAY), new Dot(170, 170, Color.BLACK)),
				new CompoundShape(new Rectangle(250, 250, 100, 100, Color.GREEN), new Dot(240, 240, Color.GREEN),
						new Dot(240, 360, Color.GREEN), new Dot(360, 360, Color.GREEN),
						new Dot(360, 240, Color.GREEN)));
	}

}