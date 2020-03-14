package 装饰者模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        Mocha mocha = new Mocha(beverage2);

        System.out.println(mocha.getDescription() + " $" + mocha.cost());
    }
}
