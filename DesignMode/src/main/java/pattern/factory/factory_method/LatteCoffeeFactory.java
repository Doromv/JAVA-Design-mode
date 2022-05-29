package pattern.factory.factory_method;

/**
 * @author Doromv
 * @Description 拿铁咖啡生产对象，专门用来生产拿铁咖啡
 * @create 2022-05-29-17:11
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
