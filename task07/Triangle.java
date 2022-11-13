package by.jonline.pr04.prwclass.task07;

public class Triangle {

	private double sideAB;
	private double sideBC;
	private double sideAC;

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(Point pointA, Point pointB, Point pointC) {
		this.pointA = (Point) pointA.clone();
		this.pointB = (Point) pointB.clone();
		this.pointC = (Point) pointC.clone();
	}

	public void setPointA(Point pointA) {
		this.pointA = (Point) pointA.clone();
	}

	public Point getPointA() {
		return (Point) pointA.clone();
	}

	public void setPointB(Point pointB) {
		this.pointB = (Point) pointB.clone();
	}

	public Point getPointB() {
		return (Point) pointB.clone();
	}

	public void setPointC(Point pointC) {
		this.pointC = (Point) pointC.clone();
	}

	public Point getPointC() {
		return (Point) pointC.clone();
	}

	public double getSideAB() {
		sideAB = Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2)
				+ Math.pow(pointB.getZ() - pointA.getZ(), 2));
		return sideAB;
	}

	public double getSideBC() {
		sideBC = Math.sqrt(Math.pow(pointC.getX() - pointB.getX(), 2) + Math.pow(pointC.getY() - pointB.getY(), 2)
				+ Math.pow(pointC.getZ() - pointB.getZ(), 2));
		return sideBC;
	}

	public double getSideAC() {
		sideAC = Math.sqrt(Math.pow(pointC.getX() - pointA.getX(), 2) + Math.pow(pointC.getY() - pointA.getY(), 2)
				+ Math.pow(pointC.getZ() - pointA.getZ(), 2));
		return sideAC;
	}

	@Override
	public String toString() {
		return "Треугольник " + pointA.getName() + pointB.getName() + pointC.getName() + "(" + pointA.toString() + "; "
				+ pointB.toString() + "; " + pointC.toString() + ")";
	}
}