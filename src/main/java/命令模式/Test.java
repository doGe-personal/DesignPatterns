package 命令模式;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class Test {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, new A1Command());
        remoteControl.setCommand(1, new A2Command());
        remoteControl.onButtonPush(0);
        remoteControl.onButtonPush(1);
    }
}
