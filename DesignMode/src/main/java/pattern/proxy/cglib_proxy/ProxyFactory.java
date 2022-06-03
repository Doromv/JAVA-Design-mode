package pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Doromv
 * @Description 代理对象工厂，用来获取代理对象
 * @create 2022-06-03-16:27
 */
public class ProxyFactory implements MethodInterceptor {

    //声明火车站对象
    private TrainStation trainStation=new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation trainStation = (TrainStation) enhancer.create();
        return trainStation;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定的服务费用(cglib动态代理)");
        //调用目标对象的方法
        Object obj = method.invoke(trainStation, objects);
        return obj;
    }
}
