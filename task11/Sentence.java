package by.jonline.pr04.prwclass.task11;

public class Sentence {

	private String sentence;

	public Sentence(char endPoint, Word... words) {
		if (words.length != 0) {
			StringBuilder tempSentence = new StringBuilder();
			for (Word word : words) {
				tempSentence.append(word).append(' ');
			}
			tempSentence.deleteCharAt(tempSentence.length() - 1);
			tempSentence.append(endPoint);
			sentence = tempSentence.toString();
		} else {
			sentence = "";
		}

	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		return sentence;
	}
}