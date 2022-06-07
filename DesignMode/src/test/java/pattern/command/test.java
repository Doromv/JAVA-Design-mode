package pattern.command;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-07-20:54
 */
public class test {

    @Test
    public void Test(){

        //创建第订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("烤肠",2);
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("牛肉面",1);
        order2.setFood("可乐",1);
        Order order3 = new Order();
        order3.setDiningTable(2);
        order3.setFood("肉末茄子盖饭",1);
        order3.setFood("芬达",1);
        order3.setFood("卤蛋",1);
        //创建厨师对象
        SeniorChef seniorChef1 = new SeniorChef("厨师一号");
        SeniorChef seniorChef2 = new SeniorChef("厨师二号");
        //创建命令对象
        OrderCommand orderCommand1 = new OrderCommand(seniorChef1, order1);
        OrderCommand orderCommand2 = new OrderCommand(seniorChef1, order2);
        OrderCommand orderCommand3 = new OrderCommand(seniorChef2, order3);
        //创建服务员对象
        Waitor waitor = new Waitor();
        waitor.setCommands(orderCommand1);
        waitor.setCommands(orderCommand2);
        waitor.setCommands(orderCommand3);
        waitor.orderUp();
    }
}
