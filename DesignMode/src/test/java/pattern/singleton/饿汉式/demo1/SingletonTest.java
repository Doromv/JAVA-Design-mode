package pattern.singleton.饿汉式.demo1;

import org.junit.Test;
import pattern.singleton.饿汉式.demo1.Singleton;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-28-18:34
 */
public class SingletonTest {
    @Test
    public void Demo1Test(){
        //创建singleton类的对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //判断他们是否是同一个对象
        System.out.println(instance==instance1);
    }
}
