package 观察者模式;

/**
 * 主题
 *
 * @author Lynn
 * @since 2020/3/9
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
