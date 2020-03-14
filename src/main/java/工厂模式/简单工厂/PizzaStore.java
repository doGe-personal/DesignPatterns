package 工厂模式.简单工厂;

import 工厂模式.Pizza;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore() {
        this.simplePizzaFactory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type) {
        return simplePizzaFactory.createPizza(type);
    }

}
