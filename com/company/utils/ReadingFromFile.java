package com.company.utils;

import java.io.*;

public class ReadingFromFile {

    public void readFromFile(String path) throws IOException {

        File file = new File(path);

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }

        fileReader.close();
    }

}


