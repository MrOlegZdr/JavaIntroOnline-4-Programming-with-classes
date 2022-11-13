package by.jonline.pr04.prwclass.task03;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentLogic {

	public ArrayList<Student> findByPerfomance(ArrayList<Student> students, int minPerfomance) {
		// Метод формирует из заданного списка студентов Student список тех, у которых
		// успеваемость не ниже заданной

		ArrayList<Student> selectionStudent = new ArrayList<Student>();
		ListIterator<Student> lIter = students.listIterator();
		Student currentStudent;

		while (lIter.hasNext()) {
			currentStudent = lIter.next();
			int[] studentPerfomance = currentStudent.getPerfomance();
			boolean isCondition = true;
			int i = 0;
			while (isCondition && i < studentPerfomance.length) {
				if (studentPerfomance[i] >= minPerfomance) {
					i++;
				} else {
					isCondition = false;
				}
			}
			if (isCondition) {
				selectionStudent.add(currentStudent);
			}
		}

		return selectionStudent;
	}
}