package com.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import  java.util.Scanner;

public class TextParser {
    String data ;
    public String readFile() {

        try {
            File filetext = new File("one_expression.txt");
            Scanner textReader = new Scanner(filetext);
            while (textReader.hasNextLine()) {
                 data = textReader.nextLine();
//                System.out.println(data+"Text parser");

            }
            textReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred with file in text parser .");
            e.printStackTrace();
        }
        return data;
    }
}