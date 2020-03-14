package 状态模式;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class GumballMachine {

    HasQuarterState hasQuarterState;
    NoQuarterState noQuarterState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumball) {
        this.count = numberGumball;
        noQuarterState= new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        state = hasQuarterState;
    }

    public void setState(State state) {
        this.state = state;
    }

    void insertQuarter() {
        state.insertQuarter();
    }

    void ejectQuarter() {
        state.ejectQuarter();
    }

    void turnCrank() {
        state.turnCrank();
    }

    void dispence() {
        state.dispence();
    }
}
