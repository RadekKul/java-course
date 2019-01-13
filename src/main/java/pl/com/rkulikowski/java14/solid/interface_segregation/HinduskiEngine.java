package pl.com.rkulikowski.java14.solid.interface_segregation;

public class HinduskiEngine {

    // start w hinduskim nastepuje przez wywolanie metody h1 i h2, w sekwencji
    public void h1(){
        System.out.println("h1() first part of start in hinduski");
        //part of start
    }

    public void h2(){
        System.out.println("h2() second part of start in hinduski");
        //part of start
    }

    // stop zeby zrobic trzeba h5 i h7 wywolac
    public void h5(){
        System.out.println("h5() first part of stop in hinduski");
        //part of stop
    }

    public void h7(){
        System.out.println("h7() second part of stop in hinduski");
        //part of stop
    }
}
