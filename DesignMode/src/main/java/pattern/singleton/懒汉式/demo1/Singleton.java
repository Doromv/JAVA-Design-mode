package pattern.singleton.懒汉式.demo1;

/**
 * @author Doromv
 * @Description 懒汉式:线程不安全
 * @create 2022-05-29-11:13
 */
public class Singleton {

    //1.创建私有构造方法

    private Singleton() {
    }

    //2.在本类中创建本类对象
    private static Singleton instance;
    //3.提供一个公共的访问方式，让外界获取对象
    public static Singleton getInstance(){
        //为了确保创建的instance是同一引用地址，所以要进行判断
        //判断instance是否为null
        if(instance==null){
            //为null则创建一个Singleton对象并且返回
            instance=new Singleton();
        }
        //不为null则直接返回
        return instance;
    }
}
