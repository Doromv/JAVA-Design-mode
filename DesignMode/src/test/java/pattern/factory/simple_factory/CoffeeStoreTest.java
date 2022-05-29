package pattern.factory.simple_factory;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-16:43
 */
public class CoffeeStoreTest {

    @Test
    public void Test(){
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee latte = coffeeStore.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
