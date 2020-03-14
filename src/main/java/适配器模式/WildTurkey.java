package 适配器模式;

/**
 * @author Lynn
 * @since 2020/3/13
 */
public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
