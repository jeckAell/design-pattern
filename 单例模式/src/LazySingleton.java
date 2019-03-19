

/**
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    //由于有序列化同步，要等前一个判断完了后，才能判断下一个，所以，效率低
    public static synchronized LazySingleton getInstance(){
        if(lazySingleton == null ){
            lazySingleton = new LazySingleton();
            return lazySingleton;
        }
        return lazySingleton;
    }
}
