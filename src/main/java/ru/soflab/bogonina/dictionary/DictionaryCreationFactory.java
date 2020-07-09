package ru.soflab.bogonina.dictionary;

import ru.soflab.bogonina.reader.ReaderXML;

import java.util.List;

public class DictionaryCreationFactory {
    private static DictionaryCreationFactory instance;//статическое поле с одиночным объектом
    private DictionaryCreationFactory(){}//конструктор по умолчанию приватный
    ReaderXML prime = new ReaderXML();

    public static DictionaryCreationFactory getInstance(){//объявляем статический метод для получения информации
        if (instance == null){//если объект еще не создан
            instance = new DictionaryCreationFactory();//создать новый объект
        }
        return instance;//вернуть созданный ранее

        /*public List<Word> getDictionary(){
            for (Word agg : words){
                System.out.println(agg);
            }
            return null;
        }*/

    }

    public Dictionary getDictionary() throws Exception {
        prime.readerXML();

       // System.out.println("Работает getDictionary из фабрики");
        return null;
    }
}
