package pattern.decorator;

/**
 * @author Doromv
 * @Description 抽象构建角色--快餐类
 * @create 2022-06-05-14:47
 */
public abstract class FastFood {

    //价格
    private float price;
    //描述
    private String desc;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public abstract float cost();
}
