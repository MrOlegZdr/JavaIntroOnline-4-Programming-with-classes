package by.jonline.pr04.prwclass.task05;

public class Counter {

	private long minValue;
	private long maxValue;
	private long currentValue;

	{
		minValue = Long.MIN_VALUE;
		maxValue = Long.MAX_VALUE;
	}

	public Counter() {
		currentValue = 0L;
	}

	public Counter(long initialValue) {
		currentValue = initialValue;
	}

	public Counter(long initialValue, long minValue, long maxValue) {
		currentValue = initialValue;
		if (minValue < maxValue && initialValue <= maxValue && initialValue >= minValue) {
			this.minValue = minValue;
			this.maxValue = maxValue;
		} else if (minValue > maxValue && initialValue >= maxValue && initialValue <= minValue) {
			System.out.println("Границы диапазона перепутаны местами, произойдет их перестановка");
			this.minValue = maxValue;
			this.maxValue = minValue;
		} else if ((initialValue < minValue && minValue < maxValue) || (initialValue < maxValue && maxValue < minValue)
				|| (initialValue > maxValue && minValue < maxValue)
				|| (initialValue > minValue && maxValue < minValue)) {
			System.out.println(
					"Начальное значение выходит за диапазон, произойдет расширение диапазона до максимальных значений");
		}
	}

	public void setMinValue(long minValue) {
		if (minValue < maxValue && minValue <= currentValue) {
			this.minValue = minValue;
		} else {
			System.out.println("Недопустимое значение границы диапазона");
		}
	}

	public long getMinValue() {
		return minValue;
	}

	public void setMaxValue(long maxValue) {
		if (maxValue > minValue && maxValue >= currentValue) {
			this.maxValue = maxValue;
		} else {
			System.out.println("Недопустимое значение границы диапазона");
		}
	}

	public long getMaxValue() {
		return maxValue;
	}

	public void setCurrentValue(long value) {
		this.currentValue = value;
	}

	public long getCurrentValue() {
		return currentValue;
	}

	@Override
	public String toString() {
		return "Текущее значение счетчика " + currentValue + "; Диапазон значений: [" + minValue + "; " + maxValue
				+ "]";
	}
}
