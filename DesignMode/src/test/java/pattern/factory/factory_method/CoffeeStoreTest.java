package pattern.factory.factory_method;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-17:15
 */
public class CoffeeStoreTest {
    @Test
    public void Test(){
        CoffeeStore coffeeStore = new CoffeeStore();
        LatteCoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        coffeeStore.setFactory(latteCoffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
