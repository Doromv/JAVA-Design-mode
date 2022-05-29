package pattern.singleton.饿汉式.demo2;

import org.junit.Test;
import pattern.singleton.饿汉式.demo2.Singleton;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-29-11:10
 */
public class SingletonTest {
    @Test
    public void Demo2Test(){
        //创建singleton类的对象
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //判断他们是否是同一个对象
        System.out.println(instance==instance2);
    }
}
