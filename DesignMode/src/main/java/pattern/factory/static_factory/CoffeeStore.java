package pattern.factory.static_factory;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-15:46
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
