package 工厂模式.抽象工厂方法;

import 工厂模式.Pizza;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public abstract class PizzaStore {

    /**
     * 抽象工厂方法
     */
    public abstract Pizza orderPizza(String type);

}
