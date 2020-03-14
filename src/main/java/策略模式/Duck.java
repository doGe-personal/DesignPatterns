package 策略模式;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all....");
    }
}
