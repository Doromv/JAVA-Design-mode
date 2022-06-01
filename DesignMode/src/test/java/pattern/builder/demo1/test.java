package pattern.builder.demo1;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-01-16:06
 */
public class test {
    @Test
    public void Test(){
        //创建指挥者类
        Director director = new Director(new MobileBuilder());
        //让指挥者组装自行车
        Bike construct = director.construct();

        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());
    }
}
