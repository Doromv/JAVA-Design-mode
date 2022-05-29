package pattern.factory.simple_factory;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-15:46
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){

        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
