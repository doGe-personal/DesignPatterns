package 工厂模式.抽象工厂;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        if ("clam".equals(type)) {
            pizza = new ClamPizza(new NYPizzaFactory());
        }
        return pizza;
    }

}
