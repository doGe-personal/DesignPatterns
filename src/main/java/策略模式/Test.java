package 策略模式;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public class Test {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }

}
