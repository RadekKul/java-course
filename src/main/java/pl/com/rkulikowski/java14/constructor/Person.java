package pl.com.rkulikowski.java14.constructor;

public class Person implements Nervous {  // aby implementowac jakis interfejs, musimy zaimplementowac z niego wszystkie metody!!! bo interfejs cos robi ale nie wiem jak a w klasie musimy to wlasnie opisac
    private String name;

    public Person(){
        this("Anonim");
        System.out.println("First Person Constructor");
    }

    public Person(String name){
        this.name = name;

    }

    @Override
    public void introduceYourself() {

    }
}
