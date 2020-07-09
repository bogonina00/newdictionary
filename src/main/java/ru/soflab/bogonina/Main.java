package ru.soflab.bogonina;

import ru.soflab.bogonina.dictionary.Dictionary;
import ru.soflab.bogonina.dictionary.DictionaryCreationFactory;
import ru.soflab.bogonina.dictionary.Word;

public class Main {
    public static void main(String [] args) throws Exception {
        //System.out.println("Работает маин начало");
        Dictionary dictionary = DictionaryCreationFactory.getInstance().getDictionary();
        for(Word word: dictionary.getWords()) {
            System.out.println("======================");
            System.out.println(word);
        }
        //System.out.println("Отработала строчка 13 из main");

    }

}