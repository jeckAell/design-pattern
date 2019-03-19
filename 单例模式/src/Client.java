import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args){
        HungerSingleton hs = HungerSingleton.getInstance();
        HungerSingleton hs2 = HungerSingleton.getInstance();

        System.out.println(hs);
        System.out.println(hs2);

        System.out.println(EnumerationSingleton.INSTANCE == EnumerationSingleton.INSTANCE);
    }

}
