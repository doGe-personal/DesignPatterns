package 适配器模式;

/**
 * @author Lynn
 * @since 2020/3/13
 */
public class Test {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("------");
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println("======");
        duck.quack();
        duck.fly();
    }
}
