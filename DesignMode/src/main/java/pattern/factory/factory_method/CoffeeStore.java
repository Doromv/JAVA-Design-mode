package pattern.factory.factory_method;


/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-15:46
 */
public class CoffeeStore {

    //创建一个工厂对象
    private CoffeeFactory factory;

    //传入一个咖啡工厂对象
    public void setFactory(CoffeeFactory factory){
        this.factory=factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
