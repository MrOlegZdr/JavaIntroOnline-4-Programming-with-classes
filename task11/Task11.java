package by.jonline.pr04.prwclass.task11;

/* Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Task11 {

	public static void main(String[] args) {

		Word word = new Word("Проверка");
		Sentence sentence = new Sentence('!', word, new Word("задачи"), new Word("может"), new Word("быть"),
				new Word("лучше"));
		Sentence sentence1 = new Sentence('.', new Word("Решение"), new Word("задачи"), new Word("номер"),
				new Word("11"));
		Sentence sentence2 = new Sentence('.', new Word("Создан"), new Word("объект"), new Word("класса"),
				new Word("Text"));
		Sentence sentence3 = new Sentence('?', new Word("Классы"), new Word("работают"));

		Text text = new Text(sentence, sentence1, sentence2);
		text.addSentence(sentence3);
		text.setHeader("Проверочный текст");

		text.PrintText();
	}

}