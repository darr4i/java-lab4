# SentenceSorter

Проєкт `SentenceSorter` - це Java-додаток для сортування речень у тексті за кількістю слів. Кожне речення розбивається на окремі слова, які, у свою чергу, складаються з літер. Після сортування за кількістю слів результати виводяться у терміналі.

## Опис роботи програми

Програма зчитує текст, розбиває його на речення, потім на слова і літери. Речення сортуються за кількістю слів у кожному, і в кінці виводяться в порядку зростання кількості слів.

## Структура проєкту

Проєкт складається з наступних класів:

- **SentenceSorter** - Головний клас, що виконує ініціалізацію тексту, викликає сортування речень і виводить результат.
- **Text** - Клас для представлення тексту, що розбиває його на речення і забезпечує сортування.
- **Sentence** - Клас для представлення окремого речення, яке складається зі слів і має знак пунктуації.
- **Word** - Клас для представлення слова, що складається з літер.
- **Letter** - Клас для представлення окремої літери в слові.

## Використання
1. Завантажте або скопіюйте репозиторій на свій комп'ютер.
2. Переконайтеся, що у вас встановлено Java Development Kit (JDK).
3. Відкрийте командний рядок або термінал.
4. Перейдіть до каталогу проекту.
5. Скомпілюйте класи за допомогою команди:
   ```bash
javac SentenceSorter.java
   
6. Запустіть програму:
    ```bash
    java SentenceSorter

## Автор
Рабійчук Дар'я
Група: ІМ-21
Варіант: 18
