package pattern.decorator;

/**
 * @author Doromv
 * @Description 抽象装饰角色
 * @create 2022-06-05-14:55
 */
public abstract class Garnish extends FastFood{

    //声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
