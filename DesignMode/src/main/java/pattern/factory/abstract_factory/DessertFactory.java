package pattern.factory.abstract_factory;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-30-10:28
 */
public interface DessertFactory {

    //生产咖啡的功能
    Coffee createCoffee();
    //生产甜品的功能
    Dessert createDessert();
}
