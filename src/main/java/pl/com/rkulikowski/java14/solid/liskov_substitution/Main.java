package pl.com.rkulikowski.java14.solid.liskov_substitution;

public class Main {

    public static void main(String[] args) {
        final String samsung = "Samsung";
        FeaturePhone samsungFeaturePhone = new FeaturePhone(samsung);
        Smartphone samsungSmart = new Smartphone(samsung);

        System.out.println(samsungFeaturePhone.equals(samsungSmart)); // domyslnie wywolana metoda equals, lamie zasade p barbary liskov, o ktorej sie uczymy.
        System.out.println(samsungSmart.equals(samsungFeaturePhone)); // dlatego tutaj dostajemy 2x false
        // a jak nadpisalismy odpowiednio equals z metoda canBeEqual, to juz daje w pierwszy true w drugim false

        // wazne jest ze smartfon moze zastapic stary telefon, a odwrotnie sie nie da zrobic i wlasnie to pokazuje ta zasada ze dzieki equals dobrze napisanej mozemy sami sterowac tym
        // co jest takie same i jaka klasa moze zamienic obiekt innej klasy
;    }
}
