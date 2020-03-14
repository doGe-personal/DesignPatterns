package 代理模式.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class MyRemoteTest {

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            Naming.rebind("//" + args[0] + "RemoteHello", myRemote);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
