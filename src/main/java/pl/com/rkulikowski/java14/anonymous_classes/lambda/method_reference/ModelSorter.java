package pl.com.rkulikowski.java14.anonymous_classes.lambda.method_reference;

public class ModelSorter {

    public static int modelOrder (String model1,String model2){

        //return -1* model1.comapreTo(model2);

        return model2.compareTo(model1);
    }
}
