package pattern.prototype.demo;

/**
 * @author Doromv
 * @Description 原型类
 * @create 2022-05-31-10:51
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("原型创建成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("克隆体克隆成功");
        return (Realizetype) super.clone();
    }
}
