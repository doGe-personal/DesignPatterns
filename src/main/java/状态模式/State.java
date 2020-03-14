package 状态模式;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispence();
}
