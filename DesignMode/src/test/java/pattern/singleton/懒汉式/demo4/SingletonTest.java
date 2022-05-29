package pattern.singleton.懒汉式.demo4;

import org.junit.Test;
import pattern.singleton.懒汉式.demo4.Singleton;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-11:59
 */
public class SingletonTest {
    @Test
    public void Demo4Test(){
        //创建singleton类的对象
       Singleton instance = Singleton.getInstance();
       Singleton instance1 = Singleton.getInstance();
        //判断他们是否是同一个对象
        System.out.println(instance==instance1);
    }
}
