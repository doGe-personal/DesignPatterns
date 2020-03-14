package 命令模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public interface Command {

    void execute();

    void undo();
}
