package pattern.proxy.static_proxy;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-02-15:10
 */
public class test {

    @Test
    public void Test(){
        //创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用方法进行买票
        proxyPoint.sell();
    }
}
