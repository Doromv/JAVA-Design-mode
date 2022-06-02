package pattern.proxy.jdk_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-02-17:32
 */
public class ProxyFactory {

    //声明目标对象

    private TrainStation station=new TrainStation();

    public SellTickets getProxyObject(){
        //返回代理对象
        /**
         * ClassLoader loader：类加载器，用于加载代理类。可以通过目标对象获取类加载器，因为他们都继承同一接口
         * Class<?>[] interfaces：代理类实现的接口的字节码对象
         * InvocationHandler h：代理对象的调用处理程序
         */
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /**
                         * Object proxy和sellTickets是同一个对象,在invoke方法中基本不用
                         * Method methodd对接口中的方法进行封装的method对象
                         * Object[] args调用发发的实际参数
                         *返回值：方法的返回值
                         */
                        //执行目标对象的方法
                        System.out.println("代售点收取一定的服务费用(jdk动态代理)");
                        Object object = method.invoke(station, args);
                        return object;
                    }
                }
        );
        return sellTickets;
    }
}
