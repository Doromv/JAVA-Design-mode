package pattern.decorator;

/**
 * @author Doromv
 * @Description 具体构建角色--炒面
 * @create 2022-06-05-14:53
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
