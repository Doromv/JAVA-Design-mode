package pattern.factory.abstract_factory;

/**
 * @author Doromv
 * @Description 美国🐕风味的甜品工厂
 * @create 2022-05-30-10:34
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
