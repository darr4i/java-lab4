import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Клас для представлення тексту, що складається з речень.
 */
public class Text {
    private List<Sentence> sentences; // Список речень у тексті.

    /**
     * Конструктор, що приймає текст і розбиває його на речення.
     * @param text Вхідний текст.
     */
    public Text(String text) {
        sentences = new ArrayList<>();
        Pattern pattern = Pattern.compile("([^.!?]+)([.!?])"); // Шаблон для розбиття тексту на речення.
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            String sentenceText = matcher.group(1).trim(); // Текст речення без знака пунктуації.
            char punctuation = matcher.group(2).charAt(0); // Знак пунктуації в кінці речення.
            sentences.add(new Sentence(sentenceText, punctuation));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    /**
     * Метод для сортування речень за кількістю слів у кожному реченні.
     */
    public void sortSentencesByWordCount() {
        sentences.sort((s1, s2) -> Integer.compare(s1.getWordCount(), s2.getWordCount()));
    }
}
