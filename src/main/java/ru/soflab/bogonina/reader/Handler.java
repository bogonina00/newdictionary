package ru.soflab.bogonina.reader;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import ru.soflab.bogonina.dictionary.Dictionary;
import ru.soflab.bogonina.dictionary.LanguageType;
import ru.soflab.bogonina.dictionary.Word;
import ru.soflab.bogonina.user.User;

import java.util.ArrayList;
import java.util.List;

public class Handler extends DefaultHandler {

    private int id;
    private String element;
    List<Word> words = new ArrayList();
    List<String> time = new ArrayList();
    private String str;
    private String value;
    Dictionary dictionary = new Dictionary();

    /*public Dictionary getDictionary(){
        return dictionary;
    }*/

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start parsing...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("end parsing.");
    }

    @Override
    public void startElement (String namespace, String localName, String qName, Attributes attr){
        element = qName;//запоминаем тег
        //System.out.println("Отработала строчка 40");
        if ( (element.equals("user")) | (element.equals("dictionary")) | (element.equals("word"))){
            id = (Integer.parseInt(attr.getValue(0)));
        }
    }

    @Override
    public void endElement (String namespace, String localName, String qName) throws SAXException {
        element = "";
        dictionary.setId((long) id);
        if (element.equals("login")) {
            dictionary.setUser(User.setLogin(value));
        }
        if (element.equals("password")) {
            dictionary.setUser(User.setPassword(value));
        }
        if (element.equals("surname")) {
            dictionary.setUser(User.setSurname(value));
        }
        if (element.equals("firstName")) {
            dictionary.setUser(new User());
        }
        if (element.equals("langyageType")) {
            if (value == "ENGLISH") {
                dictionary.setLanguageType(LanguageType.ENGLISH);
            }
            if (value == "DEUTSH") {
                dictionary.setLanguageType(LanguageType.DEUTSH);
            } else {
                System.out.println("Language type error.");
            }
        }
        if (element.equals("word")) {
            int i = id;
        }
        if (element.equals("natural")) {
            //dictionary.setWords(new Word());
            time.add(value);
        }
        if (element.equals("transcription")) {
            //dictionary.setWords(new Word());
            time.add(value);
        }

        if (element.equals("translation")) {
            //dictionary.setWords(new Word());
            time.add(value);
        }
    }

    @Override
    public void characters (char[]ch, int start, int end) throws SAXException{//взять значение между тегами
        //System.out.println(element);
        System.out.println("102");
        value = new String(ch, start, end);
        System.out.println(value);
        if (element.equals("login")){
            str = new String(ch, start, end);
        }
    }

    /*public List<Word> getDictionary(){
        for (Word agg : words){
            System.out.println(agg);
        }
        return null;
    }*/
}
