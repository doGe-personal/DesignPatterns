package 工厂模式.抽象工厂;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class NYPizzaFactory implements AbstractPizzaFactory {

    public String createDough() {
        return "aa";
    }

    public String createCheese() {
        return "bb";
    }

    public String createClam() {
        return "cc";
    }
}
