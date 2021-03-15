package item5;

public class Main {
    public static void main(String[] args) {
        SpellChecker dictionary = new SpellChecker(new EnglishDictionary("english"));
        System.out.println(dictionary.isValid("korea"));
        System.out.println(dictionary.isValid("english"));
    }
}
