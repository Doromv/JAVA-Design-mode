package pattern.singleton.饿汉式.demo2;

/**
 * @author Doromv
 * @Description 饿汉式：静态代码块
 * @create 2022-05-29-11:05
 */
public class Singleton {

    //1.私有构造方法
    private Singleton(){

    }
    //2.在本类中创建本类对象
    private static Singleton instance;
    //3.在静态代码块中赋值
    static{
        instance=new Singleton();
    }
    //4.提供一个公共的访问方式，让外界获取对象
    public static Singleton getInstance(){
        return instance;
    }
}
