package pattern.singleton.懒汉式.demo3;

/**
 * @author Doromv
 * @Description 懒汉式：线程安全：双重检查锁模式
 * 对于 `getInstance()` 方法来说，只进行一次写操作（instance=new Singleton）
 * 绝大部分的操作都是读（return instance）操作，读操作是线程安全的，
 * 所以我们没必让每个线程必须持有锁才能调用该方法，我们需要调整加锁的时机
 * @create 2022-05-29-11:27
 */
public class Singleton {

    //1.创建私有构造方法
    private Singleton() {
    }
    //2.在本类中创建本类对象
    private static volatile Singleton instance;
    //3.提供一个公共的访问方式，让外界获取对象
    public static Singleton getInstance(){
       //第一次判断，如果instance不为null不需要抢占锁，直接返回对象
        if(instance==null){
            synchronized (Singleton.class){
                //第二次判断
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        //instance不为null则直接返回
        return instance;
    }
}
