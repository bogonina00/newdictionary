package ru.soflab.bogonina.reader;

import org.xml.sax.SAXException;
import ru.soflab.bogonina.dictionary.Word;
import ru.soflab.bogonina.user.User;
import ru.soflab.bogonina.reader.Handler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReaderXML {
    public static void readerXML(String[] args) throws ParserConfigurationException, SAXException {
        //SAX - parser
        SAXParserFactory parserF = SAXParserFactory.newInstance();
        Handler handler = new Handler();
        try {
            SAXParser saxparser = parserF.newSAXParser();
            System.out.println("Отработала строчка 22 в ридере");
            saxparser.parse(new File("C:\\Users\\Violetta\\Desktop\\newdictionary\\newdictionary\\users.xml"),handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        /*List<Word> words = handler.getWords();
        for (Word agg : words){
            System.out.println(agg);
        }*/
        //System.out.println(User);
    }

    /*public void displayInfo(){
        System.out.println();
    }
    /*public String getUsers(){
        System.out.println(User.);
        return null;
    }*/

}