package by.jonline.pr04.prwclass.task04;

import java.util.ArrayList;

public class Depo {
	private ArrayList<Train> trains;

	{
		trains = new ArrayList<Train>();
	}

	public Depo() {

	}

	public Depo(int numberOfTrains) {

		for (int i = 1; i < numberOfTrains + 1; i++) {
			trains.add(new Train(i));
		}
	}

	public ArrayList<Train> getTrains() {
		return trains;
	}

	public void setTrains(ArrayList<Train> trains) {
		this.trains = trains;
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	public String toString() {

		return trains.toString();

	}
}