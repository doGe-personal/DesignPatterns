package 代理模式.动态代理;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public class UserServiceImpl implements UserService {

    @Override
    public void select() {
        System.out.println("查询 selectById");
    }

    @Override
    public void update() {
        System.out.println("更新 update");
    }
}
