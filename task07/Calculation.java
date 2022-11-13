package by.jonline.pr04.prwclass.task07;

public class Calculation {

	public double area(Triangle triangle) {
		// По формуле Герона
		double p; // Полупериметр
		double sideA = triangle.getSideAB();
		double sideB = triangle.getSideBC();
		double sideC = triangle.getSideAC();

		p = (sideA + sideB + sideC) / 2L;

		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	public double perimetr(Triangle triangle) {

		double sideA = triangle.getSideAB();
		double sideB = triangle.getSideBC();
		double sideC = triangle.getSideAC();

		return sideA + sideB + sideC;
	}

	public Point triangleCentroid(Triangle triangle) {
		// Метод нахождения координат точки пересечения медиан
		Point a = (Point) triangle.getPointA().clone();
		Point b = (Point) triangle.getPointB().clone();
		Point c = (Point) triangle.getPointC().clone();

		Point m = new Point("M", 0, 0, 0);
		m.setX((a.getX() + b.getX() + c.getX()) / 3L);
		m.setY((a.getY() + b.getY() + c.getY()) / 3L);
		m.setZ((a.getZ() + b.getZ() + c.getZ()) / 3L);

		return (Point) m.clone();
	}
}