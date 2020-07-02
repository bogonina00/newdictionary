package ru.soflab.bogonina.reader;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Map;


public class ReaderXML {
    SAXParserFactory parserF = SAXParserFactory.newInstance();
    Handler handler = new Handler();
    {
        try {
            SAXParser saxparser = parserF.newSAXParser();
            saxparser.parse(new File("users.xml"), handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        Map<Integer, String> data = handler.getData();
        for (Map.Entry<Integer, String> dMap: data.entrySet()){
            System.out.println(dMap.getKey() + " - " + dMap.getValue());
        }
    }


}
