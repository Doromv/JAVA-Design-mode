package pattern.factory.before;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-15:51
 */
public class CoffeeStoreTest {

    @Test
    public void Test(){
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
