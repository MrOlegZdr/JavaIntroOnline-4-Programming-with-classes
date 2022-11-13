package by.jonline.pr04.prwclass.task07;

public class Point {

	private String name;
	private double x;
	private double y;
	private double z;

	public Point() {
		name = "A";
		x = 0L;
		y = 0L;
		z = 0L;
	}

	public Point(String name, double x, double y, double z) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "Точка " + name + "(" + x + "; " + y + "; " + z + ")";
	}

	@Override
	public Object clone() {
		Point point = new Point();
		point.name = this.name;
		point.x = this.x;
		point.y = this.y;
		point.z = this.z;

		return point;
	}
}
