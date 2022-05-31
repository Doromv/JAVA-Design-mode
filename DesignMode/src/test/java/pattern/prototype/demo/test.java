package pattern.prototype.demo;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-31-10:53
 */
public class test {
    
    @Test
    public void Test(){
        //创建原型对象
        Realizetype realizetype = new Realizetype();
        Realizetype clone = null;
        try {
            //进行克隆
             clone= realizetype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(clone==realizetype);
    }
}
