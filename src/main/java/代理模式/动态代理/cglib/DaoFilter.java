package 代理模式.动态代理.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.CallbackFilter;

/**
 * 回调过滤器: 在CGLib回调时可以设置对不同方法执行不同的回调逻辑，或者根本不执行回调。
 * @author Lynn
 * @since 2020/3/14
 */
public class DaoFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        if ("select".equals(method.getName())) {
            return 0;   // Callback 列表第1个拦截器
        }
        return 1;   // Callback 列表第2个拦截器，return 2 则为第3个，以此类推
    }
}
