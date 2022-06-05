package pattern.decorator;

/**
 * @author Doromv
 * @Description 具体的装饰者角色--鸡蛋
 * @create 2022-06-05-15:01
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice()+ getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
