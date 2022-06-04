package pattern.adapter.class_adapter;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-04-16:02
 */
public class test {
    @Test
    public void Test(){

        //创建计算机对象
        Computer computer = new Computer();
        //读取SD卡的数据
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("=====================================");
        String s1 = computer.readSD(new TFadapterSD());
        System.out.println(s1);
    }
}
