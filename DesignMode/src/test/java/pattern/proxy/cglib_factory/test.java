package pattern.proxy.cglib_factory;

import org.junit.Test;
import pattern.proxy.cglib_proxy.ProxyFactory;
import pattern.proxy.cglib_proxy.TrainStation;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-03-16:47
 */
public class test {

    @Test
    public void Test(){
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用sell方法进行卖票
        proxyObject.sell();
    }
}
