package 命令模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class A2Command implements Command {

    public void execute() {
        System.out.println("A2");
    }

    public void undo() {
        System.out.println("A2 undo");
    }
}
