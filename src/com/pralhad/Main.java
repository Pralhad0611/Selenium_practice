package com.pralhad;


import java.util.Enumeration;
import java.util.Properties;

public class Main {
        public static void main(String [] args){
            Properties properties = System.getProperties();
            Enumeration<Object> enumeration = properties.keys();
            for (int i = 0; i < properties.size(); i++) {
                Object obj = enumeration.nextElement();
                System.out.println("Key: "+obj+"\tOutPut= "+System.getProperty(obj.toString()));
            }

            String  filelocation = System.getProperty("user.dir");
            System.out.println(filelocation );
        }

}
