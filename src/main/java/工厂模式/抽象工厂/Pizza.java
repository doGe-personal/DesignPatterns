package 工厂模式.抽象工厂;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public abstract class Pizza {
     String cheese;
     String dough;
     String sauce;
     abstract void prepare();
}
