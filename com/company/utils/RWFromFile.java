package com.company.utils;

import java.io.*;
import java.util.Map;

public class RWFromFile {

    public void writingToFile(String path, Map<String, String> map) {

        try {

            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Map.Entry<String, String> entry : map.entrySet()) {
                bufferedWriter.write("Book type: " + entry.getValue() + "    " + "Book name: " + entry.getKey() + "\n");
            }

            bufferedWriter.flush();
            fileWriter.close();

        } catch (IOException e){
            e.getMessage();
        }
    }

    public void readFromFile(String path) {

        try {

            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            fileReader.close();

        } catch (IOException e){
            e.getMessage();
        }
    }

}


