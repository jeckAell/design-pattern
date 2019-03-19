

/**
 * 懒汉式，应对反射破解
 */
public class LazySingletonPojie {
    private static LazySingletonPojie lazySingleton;

    private LazySingletonPojie(){
        if(lazySingleton != null){   //解决反射机制破解
            throw new RuntimeException();
        }
    }

    //由于有序列化同步，要等前一个判断完了后，才能判断下一个，所以，效率低
    public static synchronized LazySingletonPojie getInstance(){
        if(lazySingleton == null ){
            lazySingleton = new LazySingletonPojie();
            return lazySingleton;
        }
        return lazySingleton;
    }
}
