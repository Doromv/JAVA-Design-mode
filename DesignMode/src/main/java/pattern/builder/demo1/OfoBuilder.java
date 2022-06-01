package pattern.builder.demo1;

/**
 * @author Doromv
 * @Description 具体的构建者，用来构建ofo单车
 * @create 2022-06-01-15:58
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
