package pl.com.rkulikowski.homework;

import java.io.*;

public class homework_25_11_rozwiazanie {

        public static void main(String[] args) {
            File maybeFile = new File("C:\\Users\\Radek\\Desktop\\test java.txt");
            System.out.println("file exist: " + maybeFile.exists());
            System.out.println("is directory: " + maybeFile.isDirectory());

            File existingOneOrNot = new File("\\dfafafa\\tafafsaf");
            System.out.println("existingOneOrNot: " + existingOneOrNot);
            Reader reader = null;
            Writer writer = null;
            try {
                reader = new FileReader("C:\\Users\\Radek\\Desktop\\test java.txt");    // strumien czytajacy
                writer = new FileWriter("C:\\Users\\Radek\\Desktop\\test java1.txt");   // strumien piszacy

                int readChar;       // zmienna ktora bedzie przechowywac kolejne znaki, reader czyta jako czar, ale int bo nadaje im kolejny numerek.

                while ((readChar = reader.read()) != -1) {  // pętla do -1. Bo tak w bilbiotece zaznacza się koniec danych w pliku.
                    System.out.println("readChar: " + readChar);    //przeczytaj z pliku i zapisz w zmiennej readChar
                    writer.write(readChar);                         // zapisz w pliku przeczytany wyzej znak
                }
                // metoda fluszh to spluczka, jezeli cos pozostanie w buforku, ktory przerzucal znaki z read do write, to musimy reszte ich splukac zeby nic nie zostalo i zeby nic nie straic.
                writer.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // musimy zamykac readera bo moze dojsc do sytuacji ze juz wiecej pliku nie bedziemy mogli otworzyc, bo jest ich skonczona liczba
                if (null != writer) {   // lapiemy wyjatek, jezeli writer jest rozny od null to zamykamy, mozna dostac tu wyjatek przy zamykaniu wiec musimy lapac
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                // musimy zamykac readera bo moze dojsc do sytuacji ze juz wiecej pliku nie bedziemy mogli otworzyc, bo jest ich skonczona liczba
                if (reader != null) {   // to samo tutaj, mozna dostac wyjatek przy czytaniu pliku
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

