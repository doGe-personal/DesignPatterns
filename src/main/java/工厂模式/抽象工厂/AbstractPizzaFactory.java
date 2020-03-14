package 工厂模式.抽象工厂;

/**
 * 提供一个接口，用于创建相关或者依赖对象的家族，而不是明确指定具体类
 *
 * @author Lynn
 * @since 2020/3/11
 */
public interface AbstractPizzaFactory {

    String createDough();

    String createCheese();

    String createClam();
}
