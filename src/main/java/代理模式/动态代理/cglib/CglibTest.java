package 代理模式.动态代理.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class CglibTest {
    public static void main(String[] args) {
        LogInterceptor logInterceptor = new LogInterceptor();
        Enhancer enhancer = new Enhancer();
        // 设置超类，cglib是通过继承来实现的
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(logInterceptor);
        // 创建代理类
        UserDao dao = (UserDao)enhancer.create();
        dao.update();
        dao.select();
    }

}
