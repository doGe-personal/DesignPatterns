package 装饰者模式;

/**
 * 装饰者基类
 * @author Lynn
 * @since 2020/3/11
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
