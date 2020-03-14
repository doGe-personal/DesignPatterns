package 模版方法;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hock();
    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
    final void concreteOperation() {

    }
    void hock() {

    }
}
