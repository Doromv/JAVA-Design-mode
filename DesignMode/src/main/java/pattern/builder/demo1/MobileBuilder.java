package pattern.builder.demo1;

/**
 * @author Doromv
 * @Description 具体的构建者，用来构建摩拜单车
 * @create 2022-06-01-15:58
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
