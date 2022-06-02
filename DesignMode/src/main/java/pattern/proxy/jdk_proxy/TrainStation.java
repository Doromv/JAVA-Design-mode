package pattern.proxy.jdk_proxy;

/**
 * @author Doromv
 * @Description 火车站类
 * @create 2022-06-02-15:03
 */
public class TrainStation implements SellTickets {
   //火车站出售火车票

    @Override
    public void sell() {
        System.out.println("火车站出售火车票");
    }
}
