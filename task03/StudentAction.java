package by.jonline.pr04.prwclass.task03;

import java.util.ArrayList;
import java.util.Random;

public class StudentAction {

	public Student createRandomStudent(int studentNumber) {
		// Метод создает случайного студента со случайными фамилией вида
		// "Студент + studentNumber", номером группы и успеваемостью
		Student student = new Student();
		Random rnd = new Random();

		int[] perfomance = new int[5];

		for (int i = 0; i < perfomance.length; i++) {
			perfomance[i] = rnd.nextInt(11);
		}

		student.setFullName("Студент " + studentNumber);
		student.setGroupNumber("2022-" + rnd.nextInt(10));
		student.setPerfomance(perfomance);

		return student;
	}

	public void studentView(Student student) {
		System.out.println("Студент: " + student.toString());
	}

	public void studentGroupView(ArrayList<Student> studentList) {
		for (Student student : studentList) {
			studentView(student);
		}
	}
}
