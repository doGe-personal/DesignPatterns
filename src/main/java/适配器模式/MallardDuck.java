package 适配器模式;

/**
 * @author Lynn
 * @since 2020/3/13
 */
public class MallardDuck implements Duck {

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("fly");
    }

}
