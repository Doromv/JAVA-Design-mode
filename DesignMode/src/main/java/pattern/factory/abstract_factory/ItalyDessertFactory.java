package pattern.factory.abstract_factory;

/**
 * @author Doromv
 * @Description 意大利风味的甜品工厂
 * @create 2022-05-30-10:35
 */
public class ItalyDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
