package 策略模式;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }

}
