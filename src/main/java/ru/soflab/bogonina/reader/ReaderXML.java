package ru.soflab.bogonina.reader;

import org.xml.sax.SAXException;
import ru.soflab.bogonina.dictionary.Dictionary;
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
    Handler handler = new Handler();
    public void readerXML() throws Exception {
        SAXParser saxparser = SAXParserFactory.newInstance().newSAXParser();
        saxparser.parse(new File("C:\\Users\\Violetta\\Desktop\\newdictionary\\newdictionary\\users.xml"), handler);
    }

    public Dictionary getDictionary(){
        return handler.dictionary;
    }

}