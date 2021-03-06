package pattern.factory.before;

import pattern.factory.abstract_factory.AmericanCoffee;
import pattern.factory.abstract_factory.Coffee;
import pattern.factory.abstract_factory.LatteCoffee;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-15:46
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee=null;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else {
            throw new RuntimeException("没有你所要的咖啡!");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
