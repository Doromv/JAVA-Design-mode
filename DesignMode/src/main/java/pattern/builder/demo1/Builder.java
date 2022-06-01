package pattern.builder.demo1;

/**
 * @author Doromv
 * @Description 抽象建造者
 * @create 2022-06-01-15:54
 */
public abstract class Builder {

    //声明Bike类型的变量，并进行赋值
    protected Bike bike=new Bike();
    //构建车架
    public abstract void buildFrame();
    //构建车座
    public abstract void buildSeat();
    //构建自行车
    public abstract Bike createBike();
}
