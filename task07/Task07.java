package by.jonline.pr04.prwclass.task07;

/* Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Task07 {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(new Point("A", 0, 0, 0), new Point("B", 0, 3, 0), new Point("C", 4, 0, 0));

		Calculation calculation = new Calculation();

		System.out.println(triangle.toString());
		System.out.println("Площадь треугольника " + calculation.area(triangle) + " кв. ед.");
		System.out.println("Периметр треугольника " + calculation.perimetr(triangle) + " ед.");
		System.out.println("Точка пересечения медиан: " + calculation.triangleCentroid(triangle).toString());
	}

}