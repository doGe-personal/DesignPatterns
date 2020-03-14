package 状态模式;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    public void ejectQuarter() {

    }

    public void turnCrank() {

    }

    public void dispence() {

    }
}
