package pattern.factory.factory_method;

/**
 * @author Doromv
 * @Description 咖啡类
 * @create 2022-05-29-15:40
 */
public abstract class Coffee {

    //获取咖啡的名字
    public abstract String getName();
    //加糖
    public void addSugar(){
        System.out.println("加糖");
    }
    //加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
