package pattern.factory.static_factory;

import org.junit.Test;
import pattern.factory.simple_factory.Coffee;
import pattern.factory.simple_factory.CoffeeStore;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-16:43
 */
public class CoffeeStoreTest {

    @Test
    public void Test(){
        pattern.factory.simple_factory.CoffeeStore coffeeStore = new CoffeeStore();
        Coffee latte = coffeeStore.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
