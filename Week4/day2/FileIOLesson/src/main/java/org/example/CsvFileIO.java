package org.example;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CsvFileIO {
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

    public static void readWriteFile(String inFile, String outFile){
        try(BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {

            String line;
            while((line = br.readLine()) != null){
                System.out.println(Arrays.toString(line.split(",")));
                bw.write(Arrays.toString(line.split(",")) + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
