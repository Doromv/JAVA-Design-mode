package pattern.factory.config_factory;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-30-11:20
 */
public class Test {
    @org.junit.Test
    public void Test(){
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
