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
    private String value;
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

        if (qName.equals("dictionary")){
            dictionary = new Dictionary();
        }
        if (qName.equals("user")){
            dictionary.setUser(new User());
        }
        if (qName.equals("words")){
            dictionary.setWords(new ArrayList());
        }
        if (element.equals("word")){
            dictionary.getWords().add(new Word());
        }

    }

    @Override
    public void endElement (String namespace, String localName, String qName) throws SAXException {
        //System.out.println("Работает handler");
        if (qName.equals("user")){
            dictionary.setId(id);
        }

        if (qName.equals("login")) {
            dictionary.getUser().setId(id);
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

        if (qName.equals("languageType")) {
            if (value.equals("ENGLISH")) {
                dictionary.setLanguageType(LanguageType.ENGLISH);
            }
        }

        if (qName.equals("languageType")) {
            if (value.equals("DEUTSCH")) {
                dictionary.setLanguageType(LanguageType.DEUTSCH);
            }
        }

        if (qName.equals("languageType") & ((!value.equals("ENGLISH")) & (!value.equals("DEUTSCH")))) {
            //if ( (!value.equals("ENGLISH")) & (!value.equals("DEUTSCH"))){
                System.out.println("Language type error.");
            //}
        }

        /*if (qName.equals("words")){
            dictionary.setWords(new ArrayList());
        }*/

        /*if (element.equals("id")) {
            try{
                id = Long.parseLong(value);
            } catch (NumberFormatException e){
                System.err.println("Invalid string format!"); }
            //size = dictionary.getWords().size();
            dictionary.getWords().get(dictionary.getWords().size()).setId(id);////////////////
        }*/

        if (element.equals("natural")) {
            //size = dictionary.getWords().size();
            dictionary.getWords().get(dictionary.getWords().size()).setId(id);
            dictionary.getWords().get(dictionary.getWords().size()).setNatural(value);/////////////////
        }

        //if (element.equals("natural")) {
            //size = dictionary.getWords().size();
            //dictionary.getWords().get(dictionary.getWords().size()).setId(id);
            //dictionary.getWords().get(dictionary.getWords().size()).setNatural(value);/////////////////
        //}

        if (element.equals("transcription")) {
            //size = dictionary.getWords().size();
            dictionary.getWords().get(dictionary.getWords().size()).setTranscription(value);/////////////
        }

        if (element.equals("translation")) {
            //size = dictionary.getWords().size();
            dictionary.getWords().get(dictionary.getWords().size()).setTranslation(value);/////////////
        }

    }

    @Override
    public void characters (char[]ch, int start, int end) throws SAXException{//взять значение между тегами
        //System.out.println("Start read value");
        value = new String(ch, start, end);
        System.out.println(value);
        if (element.equals("id")){
            try{
                id = Long.parseLong(value);
            } catch (NumberFormatException e){
                System.err.println("Invalid string format!"); }
        }
        //System.out.println("End read value");
    }

    public Dictionary getDictionary(){
        return null;
    }
}
