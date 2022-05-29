package pattern.factory.factory_method;

/**
 * @author Doromv
 * @Description 美国🐕咖啡生产对象，专门用来生产美国🐕咖啡
 * @create 2022-05-29-17:10
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
