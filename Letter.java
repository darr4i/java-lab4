/**
 * Клас для представлення однієї літери.
 */
public class Letter {
    private char character; // Символ літери.

    /**
     * Конструктор, який приймає символ літери.
     * @param character Символ літери.
     */
    public Letter(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return Character.toString(character);
    }
}
