package ru.soflab.bogonina.dictionary;

public class DictionaryCreationFactory {
    private static DictionaryCreationFactory instance;//статическое поле с одиночным объектом
    private DictionaryCreationFactory(){}//конструктор по умолчанию приватный

    public static DictionaryCreationFactory getInstance(){//объявляем статический метод для получения информации
        if (instance == null){//если объект еще не создан
            instance = new DictionaryCreationFactory();//создать новый объект
        }
        return instance;//вернуть созданный ранее
    }


}
