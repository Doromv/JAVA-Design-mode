package pattern.adapter.object_adapter;

import org.junit.Test;


/**
 * @author Doromv
 * @Description
 * @create 2022-06-04-15:06
 */
public class test {

    @Test
    public void Test(){
        //创建计算机对象
        Computer computer = new Computer();
        //读取SD卡的数据
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("==============================================");
        TFadapterSD tfadaptersd = new TFadapterSD(new TFCardImpl());
        String s1 = computer.readSD(tfadaptersd);
        System.out.println(s1);
    }
}
