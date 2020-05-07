package com.company.utils;

import java.io.*;

import java.time.LocalDate;
import java.util.Properties;

public class RWFromProperties implements PathForProperties {

    public void setDate() {

        LocalDate localDate = LocalDate.now();

        Properties properties = new Properties();
        FileOutputStream fileOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(PATH_FOR_DATE);

            properties.setProperty("Last changes", localDate.toString());

            properties.store(fileOutputStream, "");
            fileOutputStream.close();

        } catch (IOException e){
            e.getMessage();
        }
        
    }

    public String getPath() {

         Properties properties = new Properties();
         FileInputStream fileinputStream;

         try {
             fileinputStream = new FileInputStream(PATH_FOR_PROPERTIES);
             properties.load(fileinputStream);

             fileinputStream.close();

             return properties.getProperty("path");

         } catch (IOException e) {
             e.getMessage();
         }

         return "default";
    }
}
