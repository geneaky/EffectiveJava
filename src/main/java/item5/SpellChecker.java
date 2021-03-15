package item5;

import java.util.Objects;

public class SpellChecker {
    private final EnglishDictionary dictionary;

    public SpellChecker(EnglishDictionary dictionary){
        Objects.requireNonNull(this.dictionary = dictionary);
    }

    public boolean isValid(String dictionaryName){
        return dictionaryName.equals(dictionary.dictionary);
    }
}
