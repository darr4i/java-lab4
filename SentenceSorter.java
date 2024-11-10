/**
 * Головний клас програми для сортування речень за кількістю слів.
 */
public class SentenceSorter {

    public static void main(String[] args) {
        // Створюємо початковий текст із кількома реченнями.
        StringBuilder textContent = new StringBuilder("My name is Daria. I am a student at KPI. " +
                                                      "3rd course! To be honest, I just want to sleep all day long.");

        // Створюємо об'єкт Text та викликаємо метод сортування речень.
        Text text = new Text(textContent.toString());
        text.sortSentencesByWordCount();

        // Виводимо відсортовані речення на екран.
        System.out.println("Sentences in ascending order of word count:");
        for (Sentence sentence : text.getSentences()) {
            System.out.println(sentence);
        }
    }
}
