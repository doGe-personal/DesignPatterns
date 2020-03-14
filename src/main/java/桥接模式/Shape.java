package 桥接模式;

/**
 * @author Lynn
 * @since 2020/3/14
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}
