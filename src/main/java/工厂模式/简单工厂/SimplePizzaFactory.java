package 工厂模式.简单工厂;

import 工厂模式.CheesePizza;
import 工厂模式.PepperoniPizza;
import 工厂模式.Pizza;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if ("peppreon".equals(type)) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
