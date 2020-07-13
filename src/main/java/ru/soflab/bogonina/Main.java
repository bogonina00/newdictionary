package ru.soflab.bogonina;

import ru.soflab.bogonina.dictionary.Dictionary;
import ru.soflab.bogonina.dictionary.DictionaryCreationFactory;
import ru.soflab.bogonina.dictionary.Word;

public class Main {
    public static void main(String [] args) throws Exception {
        Dictionary dictionary = DictionaryCreationFactory.getInstance().getDictionary();
        for(Word word: dictionary.getWords()) {
            System.out.println(word);
        }
    }
}