package pattern.factory.static_factory;

/**
 * @author Doromv
 * @Description 简单Coffee工厂类，用来生产Coffee
 * @create 2022-05-29-16:34
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type){
        Coffee coffee=null;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else {
            throw new RuntimeException("没有你所要的咖啡!");
        }
        return coffee;
    }
}
