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

    private Long id;
    private String element;
    List<Word> words = new ArrayList();
    private String value;
    private Long lId;
    //Dictionary dictionary = new Dictionary();

    Dictionary dictionary;

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
        /*if ( (element.equals("user")) | (element.equals("dictionary")) | (element.equals("word"))){
            id = (Integer.parseInt(attr.getValue(0)));
        }*/
        if (qName.equals("dictionary")){
            dictionary = new Dictionary();
        }
        if (qName.equals("user")){
            dictionary.setUser(new User());
        }
        /*if (qName.equals("langyageType")){
            dictionary.setLanguageType(new LanguageType());
        }*/
        if (qName.equals("words")){
            dictionary.setWords(new ArrayList());
        }

    }

    @Override
    public void endElement (String namespace, String localName, String qName) throws SAXException {
        //System.out.println("Работает handler");
        /*if (qName.equals("id")){
            int nId = Integer.parseInt(value);
            //Long newId = (Long) id;
            //Long nValue = newValue;
            dictionary.getUser().setId((long)nId);
        }*/
        if (qName.equals("user")){
            dictionary.setId(lId);
        }

        if (qName.equals("login")) {
            dictionary.getUser().setId(lId);
        }

        if (qName.equals("login")) {
            dictionary.getUser().setLogin(value);
        }

        if (qName.equals("password")) {
            dictionary.getUser().setPassword(value);
        }

        if (qName.equals("surname")) {
            dictionary.getUser().setSurname(value);
        }

        if (qName.equals("firstName")) {
            dictionary.getUser().setFirstName(value);
        }

        if (qName.equals("langyageType")) {
            if (value.equals("ENGLISH")) {
                dictionary.setLanguageType(LanguageType.ENGLISH);
            }
        }

        if (qName.equals("langyageType")) {
            if (value.equals("DEUTSH")) {
                dictionary.setLanguageType(LanguageType.DEUTSH);
            }
        }

        if (qName.equals("langyageType")) {
            if ( (!value.equals("ENGLISH")) & (!value.equals("DEUTSH"))){
                System.out.println("Language type error.");
            }
        }

        if (element.equals("id")) {
            if (dictionary.getWords().size()>0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(size).setId(lId);
            }
            if (dictionary.getWords().size()==0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(0).setId(value);
            }
        }

        if (element.equals("natural")) {
            if (dictionary.getWords().size()>0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(size).setNatural(value);
            }

            if (dictionary.getWords().size()==0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(0).setNatural(value);
            }
        }

        if (element.equals("transcription")) {
            if (dictionary.getWords().size()>0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(size).setTranscription(value);
            }

            if (dictionary.getWords().size()==0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(size).setTranscription(value);
            }
        }

        if (element.equals("translation")) {
            if (dictionary.getWords().size()>0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(size).setTranslation(value);
            }

            if (dictionary.getWords().size()==0) {
                int size = dictionary.getWords().size() - 1;
                dictionary.getWords().get(size).setTranslation(value);
            }
        }
    }

    @Override
    public void characters (char[]ch, int start, int end) throws SAXException{//взять значение между тегами
        //System.out.println("Start read value");
        value = new String(ch, start, end);
        System.out.println(value);
        if (element.equals("id")){
            try{
                lId = Long.parseLong(value);
            } catch (NumberFormatException e){
                System.err.println("Invalid string format!"); }
        }
        //System.out.println("End read value");
    }

    public Dictionary getDictionary(){
        return null;
    }
}
