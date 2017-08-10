package prob6;

public class RectTriangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
				
	}
	@Override
	public double getArea( ) {
		return (width * height) * 0.5;
	}
	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt( Math.pow(width, 2) + Math.pow(height, 2));
	}
	@Override
	public void resize(double rate) {
		width *= rate;
		height *= rate;
				
	}
}