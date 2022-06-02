package pattern.proxy.jdk_proxy;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-02-17:56
 */
public class test {
    @Test
    public void Test(){
      //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //2.使用工厂对象的方法生产代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //3.调用卖电脑的方法
        proxyObject.sell();
    }
}
