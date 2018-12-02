package pl.com.rkulikowski.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class homework_25_11 {

    public static void main(String[] args) {


        File myFile = new File("C:\\Users\\Radek\\Desktop\\test java.txt");

        List<Integer> fileArray = new ArrayList<>();


        Reader reader;

        {
            try {
                reader = new FileReader("C:\\Users\\Radek\\Desktop\\test java.txt");

                int readChar;
                while ((readChar = reader.read()) != -1) {
                    fileArray.add(readChar);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Writer writer;

        {
            try {
                writer = new FileWriter("C:\\Users\\Radek\\Desktop\\test java1.txt");
                for (int i = 0; i < fileArray.size(); i++) {    // mozna zmienic na for each

                    writer.write(" Next Letter: ");
                    writer.write(fileArray.get(i));

                    if (i==fileArray.size()-1){
                        writer.close();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

