package week12;

public class Acronym {
    private String theWord;
    public Acronym(String theWord) { this.theWord = theWord; }
    public String get() {
        String acronym = "";
        theWord = theWord.replace("-", " ").replace("_", " ");
        while (theWord.contains("  ")) theWord = theWord.replace("  ", " ");
        String[] words = theWord.split(" ");
        for (int i = 0; i < words.length; i++) acronym += words[i].trim().substring(0, 1).toUpperCase();
        return acronym;
    }
}
