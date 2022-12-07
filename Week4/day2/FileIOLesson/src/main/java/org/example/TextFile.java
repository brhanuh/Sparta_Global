package org.example;

import java.io.*;

public class TextFile {
        public static void readFile (String fileName){
            try{
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String readValue;
                while((readValue = br.readLine()) != null){
                    System.out.println(readValue);
                }
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }


//    public static void readFile (String fileName){
//        FileReader fr = null;
//        try{
//            fr = new FileReader(fileName);
//            int readValue;
//            while((readValue = fr.read()) != -1){
//                System.out.print((char)readValue);
//            }
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }finally {
//            try {
//                fr.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
