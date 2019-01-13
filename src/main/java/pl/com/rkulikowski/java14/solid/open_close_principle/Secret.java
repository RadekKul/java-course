package pl.com.rkulikowski.java14.solid.open_close_principle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Secret {

    private String mySecret;
    private String path;

    public Secret(String mySecret, String path) {
        this.mySecret = mySecret;
        this.path = path;
    }


    public void save(){
        // chcemy miec sekret w jakims pliku wiec musimy zbudowac strumien i wyslac dane do strumienia
        //Writer writer = new BufferedWriter(new FileWriter(path));
        System.out.println(String.format("Saving secret to file: [%s]",path));
    }

    public String getPath() {
        return path;
    }

    public String getMySecret() {
        return mySecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "mySecret='" + mySecret + '\'' +
                '}';
    }

}
