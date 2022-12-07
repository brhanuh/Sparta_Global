package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileIO {
    public static void readBinary(String inFile){
        try(FileInputStream fis = new FileInputStream(inFile)) {
            int theByte;
            while ((theByte = fis.read()) != -1){
                System.out.println(theByte);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyBinary(String inFile, String outFile){
        try(FileInputStream fis = new FileInputStream((inFile));
            FileOutputStream fos = new FileOutputStream(outFile)) {
            int thebyte;
            while ((thebyte = fis.read()) != -1){
                System.out.println(thebyte);
                fos.write(thebyte);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }{

        }
    }
}
