package by.jonline.pr04.prwclass.task03;

import java.util.Arrays;

public class Student {
	private String fullName;
	private String groupNumber;
	private int[] perfomance;

	public Student() {

	}

	public Student(String fullName, String groupNumber, int... perfomance) {
		this.fullName = fullName;
		this.groupNumber = groupNumber;
		this.perfomance = perfomance;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setPerfomance(int... perfomance) {
		this.perfomance = perfomance;
	}

	public int[] getPerfomance() {
		return perfomance;
	}

	@Override
	public String toString() {
		return "ФИО: " + fullName + "; " + "Группа: " + groupNumber + "; " + "Успеваемость: "
				+ Arrays.toString(perfomance);
	}
}