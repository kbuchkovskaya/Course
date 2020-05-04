package com.company.utils;

import com.company.book.Storage;

import java.io.*;

import java.util.Map;
import java.util.Properties;

public class RWFromProperties {

    Storage storage = new Storage();

    public void setMapToProperties(String path, Map<String,String> map) throws IOException {

        Properties properties = new Properties();

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        for (Map.Entry<String, String> entry : storage.getBookMap().entrySet()){
            properties.put(entry.getKey(), entry.getValue());
        }

        properties.store(fileOutputStream, String.valueOf(map));
        fileOutputStream.close();
        
    }

    public void getMapFromProperties(String path) throws IOException {

         Properties properties = new Properties();
         properties.load(new FileReader(path));

        for (String key : properties.stringPropertyNames()){
            System.out.println(properties.get(key));
        }
    }
}
