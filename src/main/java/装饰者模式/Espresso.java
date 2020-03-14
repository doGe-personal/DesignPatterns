package 装饰者模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
