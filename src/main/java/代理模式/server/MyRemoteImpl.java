package 代理模式.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {

    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

}
