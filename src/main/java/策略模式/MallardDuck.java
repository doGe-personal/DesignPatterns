package 策略模式;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyingWithWings();
    }

}
