package 代理模式.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import 代理模式.server.MyRemote;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = myRemote.sayHello();
            System.out.println(s);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }

}
