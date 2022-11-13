package by.jonline.pr04.prwclass.task05;

public class CounterAction {

	public void increaseCounter(Counter counter, boolean isOverwrite) {

		long minValue = counter.getMinValue();
		long maxValue = counter.getMaxValue();
		long currentValue = counter.getCurrentValue();

		if (isOverwrite) {
			if (maxValue != Long.MAX_VALUE) {
				currentValue = (currentValue + 1L > maxValue) ? minValue : ++currentValue;
			} else {
				currentValue = (currentValue == maxValue) ? minValue : ++currentValue;
			}
		} else {
			if (maxValue != Long.MAX_VALUE) {
				currentValue = (currentValue + 1L > maxValue) ? maxValue : ++currentValue;
			} else {
				currentValue = (currentValue == maxValue) ? maxValue : ++currentValue;
			}
		}
		counter.setCurrentValue(currentValue);
	}

	public void decreaseCounter(Counter counter, boolean isOverwrite) {

		long minValue = counter.getMinValue();
		long maxValue = counter.getMaxValue();
		long currentValue = counter.getCurrentValue();

		if (isOverwrite) {
			if (minValue != Long.MIN_VALUE) {
				currentValue = (currentValue - 1L < minValue) ? maxValue : --currentValue;
			} else {
				currentValue = (currentValue == minValue) ? maxValue : --currentValue;
			}
		} else {
			if (minValue != Long.MIN_VALUE) {
				currentValue = (currentValue - 1L < minValue) ? minValue : --currentValue;
			} else {
				currentValue = (currentValue == minValue) ? minValue : --currentValue;
			}
		}
		counter.setCurrentValue(currentValue);
	}

}
