package pattern.decorator;

/**
 * @author Doromv
 * @Description 具体构建角色--炒饭
 * @create 2022-06-05-14:50
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
