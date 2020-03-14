package 装饰者模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }

}
