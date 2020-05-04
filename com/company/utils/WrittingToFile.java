package com.company.utils;

import java.io.*;
import java.util.Map;


public class WrittingToFile {

    public void writingToFile(String path, Map<String, String> map) throws IOException {

        FileWriter fileWriter = new FileWriter(path);

        BufferedWriter writer = new BufferedWriter(fileWriter);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            writer.write("Book type: " + entry.getValue() + "    " + "Book name: " + entry.getKey() + "\n");
        }

        writer.flush();
        fileWriter.close();
    }
}
