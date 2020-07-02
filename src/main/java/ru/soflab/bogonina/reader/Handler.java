package ru.soflab.bogonina.reader;

import org.w3c.dom.Attr;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.management.Attribute;
import java.util.HashMap;
import java.util.Map;

public class Handler extends DefaultHandler {
    private Map<Integer, String> data = new HashMap<Integer, String>();
    private int id;
    private String element;
    public void startDocument() throws SAXException {//начинает работать когда начинаем парсить документ
        System.out.println("Start parsing...");
    }

    public void endDocument() throws SAXException{
        System.out.println("End parsing");
    }

    public void startElement(String namespace, String localName, String qName, Attributes attr){
        element = qName;
        if (element.equals("user")){
            id = Integer.parseInt(attr.getValue(0));
            //if (element.equals("login"){ element = qName;}
        }

        else if (element.equals("dictionary")){
            id = Integer.parseInt(attr.getValue(0));
        }

        else if (element.equals("word")){
            id = Integer.parseInt(attr.getValue(0));
        }

    }

    public void endElement(String namespace, String localName, String qName) throws SAXException{
        element = "";
        id = -1;
    }

    public void characters(char []ch, int start, int end){
        //для user
        if (element.equals("login")){
            String loginStr = new String(ch, start, end);
            data.put(id, loginStr);
        }
        else if (element.equals("password")){
            String passwordStr = new String(ch, start, end);
            data.put(id, passwordStr);
        }
        else if (element.equals("surname")){
            String surnameStr = new String(ch, start, end);
            data.put(id, surnameStr);
        }
        else if (element.equals("firstName")){
            String firstNameStr = new String(ch, start, end);
            data.put(id, firstNameStr);
        }
        //Для dictionary
        if (element.equals("user")){
            String userStr = new String(ch, start, end);
            data.put(id, userStr);
        }

        else if (element.equals("languageType")){
            String languageTypeStr = new String (ch, start, end);
            data.put(id, languageTypeStr);
        }

        else if (element.equals("word")){
            String wordStr = new String (ch, start, end);
            data.put(id, wordStr);
        }
        //Для word
        if (element.equals("transcriptions")){
            String transcriptionsStr = new String(ch, start, end);
            data.put(id, transcriptionsStr);
        }
        if (element.equals("translation")){
            String translationStr = new String(ch, start, end);
            data.put(id, translationStr);
        }
        //считает смиволы от start до end,преобразует все в string
        // и будет объект str
    }

    public Map<Integer, String> getData(){
        return data;
    }

}
