/**
 * 静态内部类实现单例, 线程安全 效率高 延时加载
 */
public class InnerClass {
    private static final class InnerClassInstance{
        private static final InnerClass instance = new InnerClass();
    }

    private InnerClass(){

    }

    public static InnerClass getInstance(){
        return InnerClassInstance.instance;
    }
}
