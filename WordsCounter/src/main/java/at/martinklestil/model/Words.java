package at.martinklestil.model;

import java.util.ArrayList;

public class Words {

    private ArrayList<String> words = new ArrayList<>();

    public Words() {

    }

    public ArrayList<String> getWordsList() {
        return words;
    }

    public void addWords(String word) {
        words.add(word);
    }

    @Override
    public String toString() {
        return "Words{" +
                "words=" + words +
                '}';
    }
}
