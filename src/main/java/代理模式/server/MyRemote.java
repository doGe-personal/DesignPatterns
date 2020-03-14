package 代理模式.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public interface MyRemote extends Remote {

    String sayHello() throws RemoteException;

}
