package pattern.builder.demo1;

import java.lang.reflect.Constructor;

/**
 * @author Doromv
 * @Description 指挥者类
 * @create 2022-06-01-16:02
 */
public class Director {

    //声明builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装子线程的功能
   public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
   }
}
