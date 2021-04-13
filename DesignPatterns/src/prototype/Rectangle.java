package prototype;

public class Rectangle extends Shape {

	public int width;
	public int height;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(Rectangle target) {
		super(target);
		if (target != null) {
			this.width = target.width;
			this.height = target.height;
		}
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle) || !super.equals(obj)) return false;
		Rectangle shape = (Rectangle) obj;
		return shape.width == width && shape.height == height;
	}

}
