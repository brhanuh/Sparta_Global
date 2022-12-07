package org.example;

public class FileDriver {
    public static void main(String[] args) {
        //TextFile.readFile("./sort-manager.txt");
        //TextFile.readFile("./EmployeeRecords.csv");
        //CsvFileIO.readWriteFile("./EmployeeRecords.csv", "./EmployeeRecords1.csv");

        //BinaryFileIO.readBinary("./Cheetah.webp");
        BinaryFileIO.copyBinary("./Cheetah.webp", "./CopyCheetah.webp");
    }
}
