package 命令模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class RemoteControl {

    Command[] commands;

    public RemoteControl() {
        commands = new Command[7];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void onButtonPush(int slot) {
        commands[slot].execute();
    }
}
