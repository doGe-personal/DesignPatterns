package 代理模式.动态代理.cglib;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class UserDao {

    public void select() {
        System.out.println("UserDao 查询 selectById");
    }

    public void update() {
        System.out.println("UserDao 更新 update");
    }

}
