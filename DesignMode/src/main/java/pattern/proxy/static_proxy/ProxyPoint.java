package pattern.proxy.static_proxy;

/**
 * @author Doromv
 * @Description 
 * @create 2022-06-02-15:04
 */
public class ProxyPoint implements SellTickets{
    //声明火车站类对象

    private TrainStation trainstation;

    //代售点出售火车票

    @Override
    public void sell() {
        trainstation=new TrainStation();
        System.out.println("代售点收取代理费用");
        trainstation.sell();
    }
}
