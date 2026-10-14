class WordCounter {
static String language = "English";
void countWords(String sentence) {
    String trimmedSentence = sentence.trim();
    int wordCount;

    if (trimmedSentence.isEmpty()) {
        wordCount = 0;
    } else {
        String[] words = trimmedSentence.split("\\s+");
        wordCount = words.length;
    }

    System.out.println("Language: " + language);
    System.out.println("Sentence: " + sentence);
    System.out.println("Word Count: " + wordCount);
}

public static void main(String[] args) {
    WordCounter w = new WordCounter();

    w.countWords("Java is easy to learn");
 }
}
