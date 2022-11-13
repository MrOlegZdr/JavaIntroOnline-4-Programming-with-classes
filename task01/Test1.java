package by.jonline.pr04.prwclass.task01;

public class Test1 {
	private int numberA;
	private int numberB;

	public Test1() {
		numberA = 0;
		numberB = 0;
	}
	
	public Test1(int numberA, int numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}
	
	public int getNumberA() {
		return numberA;
	}

	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}

	public int getNumberB() {
		return numberB;
	}

	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}

	public void printNumbers() {
		System.out.printf("Число А: %d\n", numberA);
		System.out.printf("Число B: %d\n", numberB);
	}

	public int sumAB() {
		return numberA + numberB;
	}

	public int maxAB() {
		return (numberA > numberB) ? numberA : numberB;
	}
}