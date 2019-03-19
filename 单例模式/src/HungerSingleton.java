/**
 * 饿汉式
 */
public class HungerSingleton {
    //初始化时，立刻加载对象
    private static HungerSingleton hungerSingleton = new HungerSingleton();

    private  HungerSingleton(){

    }

    //此方法没同步，效率高
    public static HungerSingleton getInstance(){
        return hungerSingleton;
    }
}
