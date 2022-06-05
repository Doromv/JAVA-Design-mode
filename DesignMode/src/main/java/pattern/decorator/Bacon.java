package pattern.decorator;

/**
 * @author Doromv
 * @Description 具体的装饰者角色--培根
 * @create 2022-06-05-15:01
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
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
