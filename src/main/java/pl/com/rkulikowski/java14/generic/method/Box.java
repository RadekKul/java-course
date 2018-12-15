package pl.com.rkulikowski.java14.generic.method;

public class Box {

    // Box ma przechowywac 4 zmienne ale zadna nie moze byc nullem wiec odrazu validator na konstruktor i seter
    // robimy 4 validatory (moga byc o tej samej nazwie bo i tak inne typy parametrow)

    private String string;
    private Object object;
    private Integer integer;
    private Double aDouble;

    public Box(String string, Object object, Integer integer, Double aDouble) {
        this.string = validateGeneric(string);
        this.object = validateGeneric(object);
        this.integer = validateGeneric(integer);
        this.aDouble = validateGeneric(aDouble);
    }

    // metoda generyczna do validacji, mozna traktowac ją ogolnie dla podstawowych rzeczy, bo w srodku niej mozemy tylko metody z Object uzywac, bo wejsc tutaj moze wszystko co tylko chcemy
    // i zamiast tych 4 dolnych validatorow mamy jeden ogolny, jak nacisniemy CTRL i najedzeimy na validateGeneric w konstruktorze to rzeczywiscie tam bedzie napisane za kazdym razem co innego
    // stworz generic <T> tylko dla tej metody, ktory zwraca wartosc typu T i przyjmuje wartość typu T

    private <T> T validateGeneric(T value){
        if(null == value){
            throw new IllegalArgumentException("cannot be null");
        }
        return value;
    }


    private String validate(String string){
        if(string == null){
            throw new IllegalArgumentException("String cannot be null");
        }
        return string;
    }

    private Object validate(Object object){
        if(object == null){
            throw new IllegalArgumentException("Object cannot be null");
        }
        return object;
    }

    private Integer validate(Integer integer){
        if(integer == null){
            throw new IllegalArgumentException("Integer cannot be null");
        }
        return integer;
    }

    private Double validate(Double aDouble){
        if(aDouble == null){
            throw new IllegalArgumentException("Double cannot be null");
        }
        return aDouble;
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = validate(string);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = validate(object);
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = validate(integer);
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = validate(aDouble);
    }

    @Override
    public String toString() {
        return "Box{" +
                "string='" + string + '\'' +
                ", object=" + object +
                ", integer=" + integer +
                ", aDouble=" + aDouble +
                '}';
    }



}
