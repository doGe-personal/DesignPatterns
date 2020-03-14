package 单例模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class Singleton {

    private static volatile  Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton != null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
