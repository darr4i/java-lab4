import java.util.ArrayList;
import java.util.List;

/**
 * Клас для представлення речення, що складається зі слів та має знак пунктуації.
 */
public class Sentence {
    private List<Word> words; // Список слів у реченні.
    private char punctuation; // Знак пунктуації в кінці речення.

    /**
     * Конструктор, що приймає текст речення та знак пунктуації.
     * @param sentence Текст речення без знака пунктуації.
     * @param punctuation Знак пунктуації в кінці речення.
     */
    public Sentence(String sentence, char punctuation) {
        words = new ArrayList<>();
        this.punctuation = punctuation;
        String[] wordArray = sentence.trim().split("\\s+"); // Розбиваємо речення на слова.
        
        for (String word : wordArray) {
            words.add(new Word(word));
        }
    }

    public List<Word> getWords() {
        return words;
    }

    /**
     * Повертає кількість слів у реченні.
     * @return Кількість слів.
     */
    public int getWordCount() {
        return words.size();
    }

    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (Word word : words) {
            sentence.append(word.toString()).append(" ");
        }
        return sentence.toString().trim() + punctuation; // Додаємо знак пунктуації в кінці.
    }
}
