import java.util.ArrayList;
import java.util.List;

/**
 * Клас для представлення слова, що складається з літер.
 */
public class Word {
    private List<Letter> letters; // Список літер, що утворюють слово.

    /**
     * Конструктор, що приймає рядок та розбиває його на окремі літери.
     * @param word Слово у вигляді рядка.
     */
    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    public List<Letter> getLetters() {
        return letters;
    }

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.getCharacter());
        }
        return word.toString();
    }
}
