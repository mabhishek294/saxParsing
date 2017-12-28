/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
import java.io.*;
import java.lang.*;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Main {
    public static void main(String[]args){
        System.out.println("Sax parser");
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
    try {
        SAXParser saxParser = saxParserFactory.newSAXParser();
        MyHandler handler = new MyHandler();
        saxParser.parse(new File("Documents/sample.xml"), handler);
        List<Employee> empList = handler.getEmpList();
        for(Employee emp : empList)
            System.out.println(emp);
    } catch (ParserConfigurationException | SAXException | IOException e) {
        e.printStackTrace();
    }
    
        
        
    }
}
