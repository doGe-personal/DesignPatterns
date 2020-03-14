package 策略模式;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public class FlyingNoWay implements  FlyBehavior{

    public void fly() {
        System.out.println("T'm can't fly!");
    }

}
