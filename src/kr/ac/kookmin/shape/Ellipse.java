package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	// Implement here
	int w;
	int h;
	
	public Ellipse(Point point, int w, int h) {
		super.center = point;
		this.w = w;
		this.h = h;
	}
	
	public int getSemiMajorAxis() {
		return w;
	}
	
	public int getSemiMinorAxis() {
		return h;
	}

	public Rectangle getBounds() {
		return new Rectangle(center, w * 2, h * 2);
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}

	@Override
	public String toString() {
		return "Ellipse";
	}

}