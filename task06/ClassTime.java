package by.jonline.pr04.prwclass.task06;

public class ClassTime {

	private int hour;
	private int minute;
	private int second;

	public ClassTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public ClassTime(int hour, int minute, int second) {
		this.hour = validateHour(hour);
		this.minute = validateMinute(minute);
		this.second = validateSecond(second);
	}

	public void setHour(int hour) {
		this.hour = validateHour(hour);
	}

	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {
		this.minute = validateMinute(minute);
	}

	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		this.second = validateSecond(second);
	}

	public int getSecond() {
		return second;
	}

	public void addHour(int hour) {
		this.hour = (this.hour + hour) % 24;
	}

	public void addMinute(int minute) {
		addHour((this.minute + minute) / 60);
		this.minute = (this.minute + minute) % 60;
	}

	public void addSecond(int second) {
		addMinute((this.second + second) / 60);
		this.second = (this.second + second) % 60;
	}

	@Override
	public String toString() {
		String resultTime = "Время: ";
		resultTime += hour < 10 ? "0" + hour + ":" : hour + ":";
		resultTime += minute < 10 ? "0" + minute + ":" : minute + ":";
		resultTime += second < 10 ? "0" + second : second;
		return resultTime;
	}

	private int validateHour(int hour) {
		if (hour >= 0 && hour < 24) {
			return hour;
		} else {
			return 0;
		}
	}

	private int validateMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			return minute;
		} else {
			return 0;
		}
	}

	private int validateSecond(int second) {
		if (second >= 0 && second < 60) {
			return second;
		} else {
			return 0;
		}
	}

}