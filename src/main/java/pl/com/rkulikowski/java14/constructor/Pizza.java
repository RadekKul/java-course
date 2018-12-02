package pl.com.rkulikowski.java14.constructor;

public class Pizza extends Dish {

    {
        System.out.println("Pizza - instance block");
    }
    static{
        System.out.println("Pizza - static block");
    }

    public Pizza(){
        this("tiuna");
        System.out.println("Pizza() first Contructor");
    }

    public Pizza(String additions){
        super(5);       //Wywolanie konstruktora z nad klasy za pomocą super(5), beargumentowy wywolujemy super()

        System.out.println("Pizza with additions:" + additions);
    }

}
