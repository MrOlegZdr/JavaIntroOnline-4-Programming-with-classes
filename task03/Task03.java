package by.jonline.pr04.prwclass.task03;

import java.util.ArrayList;

/* Создайте класс с именем Student, содержащий поля: Фамилия и инициалы, номер группы,
 * успеваемость (массив из 5 элементов). Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные
 * только 9 или 10.
 */

public class Task03 {

	public static void main(String[] args) {
		StudentAction action = new StudentAction();
		StudentLogic logic = new StudentLogic();

		ArrayList<Student> studentList = new ArrayList<Student>();
		for (int i = 1; i < 9; i++) {
			studentList.add(action.createRandomStudent(i));
		}
		studentList.add(new Student("Иванов И.И.", "2022-4", 10, 9, 9, 10, 9));
		studentList.add(new Student("Петров П.П.", "2022-5", 9, 9, 9, 9, 9));

		System.out.println("Общий список студентов:");
		action.studentGroupView(studentList);

		ArrayList<Student> needStudent = new ArrayList<Student>();
		needStudent = logic.findByPerfomance(studentList, 9);

		System.out.println("Студенты с успеваемостью не ниже 9:");
		action.studentGroupView(needStudent);
	}

}