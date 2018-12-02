package pl.com.rkulikowski.java14.input_output;

import java.io.*;

public class FileExample {

    public static void main(String[] args) {

        File maybeFile = new File("C:\\Users\\Radek\\Desktop\\test java.txt");  // dajemy sciezke jako String z podwojnymi sleszami \\
        System.out.println("file exist: " + maybeFile.exists());    // czy istnieje? tak
        System.out.println("is directory: " + maybeFile.isDirectory()); // czy jest katalogiem? nie jest
        System.out.println("is file: " +maybeFile.isFile());    // czy jest plikiem? tak

        File existingFile = new File("asdas\\adasdas");   // jezeli stworzymy randomowy, to sie program wywali, bo nie znajdzie takiego
        System.out.println("existingFile: " + existingFile);

        // File.separator - co to?

        try {
            Reader reader = new FileReader("C:\\Users\\Radek\\Desktop\\test java.txt"); // tworzymy reader do odczytywania plików
            try {
                int readChar;
                while((readChar = reader.read())!=-1){      // przeleci caly plik jako strumien danych, odczyta pokolei kazdy znak i zwroci kod kazdego znaku w typie int. jak będzie -1 to zakonczy.
                                                            // sa tez klasy ktore odczytuja pelne linijkia
                    System.out.println("readerChar: " + readChar);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
