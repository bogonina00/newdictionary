package ru.soflab.bogonina;

import ru.soflab.bogonina.dictionary.Dictionary;
import ru.soflab.bogonina.dictionary.DictionaryCreationFactory;
import ru.soflab.bogonina.dictionary.Word;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Dictionary dictionary = DictionaryCreationFactory.getInstance().getDictionary();
        for (Word word : dictionary.getWords()) {
            if (word.getId() == 1){
                System.out.println(dictionary.getUser().getLogin());
            }
            System.out.println(word.getId() + ". " + word.getNatural() + " - " + word.getTranscription() + " - " + word.getTranslation());
        }
    }
}