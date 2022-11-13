package by.jonline.pr04.prwclass.task11;

public class Text {

	private String header = "";
	private String text = "";

	public Text(Sentence... sentences) {
		if (sentences.length != 0) {
			StringBuilder tempText = new StringBuilder();
			for (Sentence sentence : sentences) {
				tempText.append(sentence).append(' ');
			}
			tempText.deleteCharAt(tempText.length() - 1);
			text = tempText.toString();
		} else {
			text = "";
		}
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getText() {
		return text;
	}

	public void addSentence(Sentence sentence) {
		StringBuilder tempText = new StringBuilder(text);
		if (!tempText.isEmpty()) {
			tempText.append(' ').append(sentence);
		} else {
			tempText.append(sentence);
		}
		text = tempText.toString();
	}

	public void PrintText() {
		if (!header.isBlank() && !text.isBlank()) {
			System.out.println(header + '\n');
			System.out.println(text);
		} else if (header.isBlank() && !text.isBlank()) {
			System.out.println("Заголовок отсутствует" + '\n');
			System.out.println(text);
		} else if (!header.isBlank() && text.isBlank()) {
			System.out.println(header + '\n');
			System.out.println("Текст отсутствует");
		} else {
			System.out.println("Заголовок и текст отсутствуют");
		}
	}
}