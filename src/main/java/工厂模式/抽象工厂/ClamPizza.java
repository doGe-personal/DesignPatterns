package 工厂模式.抽象工厂;


/**
 * @author Lynn
 * @since 2020/3/11
 */
public class ClamPizza extends Pizza {
    AbstractPizzaFactory abstractPizzaFactory;
    public ClamPizza(AbstractPizzaFactory abstractPizzaFactory) {
        this.abstractPizzaFactory = abstractPizzaFactory;
    }

    @Override
    void prepare() {
        cheese = abstractPizzaFactory.createCheese();
        dough = abstractPizzaFactory.createDough();
    }

}
