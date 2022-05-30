package pattern.factory.abstract_factory;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-30-10:37
 */
public class DesserFactoryTest {

    @Test
    public void Test(){
        //意大利风味
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Dessert dessert = italyDessertFactory.createDessert();
        Coffee coffee = italyDessertFactory.createCoffee();
        //美国🐕风味
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        Dessert dessert1 = americanDessertFactory.createDessert();
        Coffee coffee1 = americanDessertFactory.createCoffee();

        dessert.show();
        System.out.println(coffee.getName());
    }
}
