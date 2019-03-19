import java.lang.reflect.Constructor;

/**
 * 使用反射和反序列化破解单例模式
 */
public class ClientPojie {
    public static void main(String[] args) throws Exception {
        LazySingletonPojie hs = LazySingletonPojie.getInstance();
        LazySingletonPojie hs2 = LazySingletonPojie.getInstance();

        System.out.println(hs);
        System.out.println(hs2);

        //通过反射机制破解单例
        Class<LazySingletonPojie> clazzz =  (Class<LazySingletonPojie>) Class.forName("LazySingletonPojie");
        Constructor<LazySingletonPojie> lsp = clazzz.getDeclaredConstructor(null);
        lsp.setAccessible(true);   //跳过权限检查
        LazySingletonPojie ls1 = lsp.newInstance();
        LazySingletonPojie ls2 = lsp.newInstance();

        System.out.println(ls1);
        System.out.println(ls2);


    }
}
