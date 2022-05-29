package pattern.singleton.懒汉式.demo4;

/**
 * @author Doromv
 * @Description 静态内部类方式
 * 静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的,
 * 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。静态属性由于被 `static` 修饰，
 * 保证只被实例化一次，并且严格保证实例化顺序。
 * 	静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。
 * 	在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 * @create 2022-05-29-11:44
 */
public class Singleton {

    private static boolean flag=false;

    //1.创建私有构造方法
    private Singleton() {
        //解决反射破坏单例模式
        synchronized (Singleton.class) {
            //判断flag的值是否为true，如果是true，说明不是第一次访问，直接抛出异常
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //将flag的值设置为true
            flag = true;
        }
    }
    //2.定义一个静态内部类
    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }
    //3.提供一个公共的访问方式，让外界获取对象
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
    //解决反序列化破坏单例模式
    //4.当进行反序列化时，会自动调用此方法，将该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
