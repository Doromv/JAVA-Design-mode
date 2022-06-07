package pattern.command;

import java.util.Map;

/**
 * @author Doromv
 * @Description 具体命令类
 * @create 2022-06-07-20:40
 */
public class OrderCommand implements Command{

    //持有接受者对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(receiver.getName()+"制作"+order.getDiningTable()+"号订单:");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (String s : foodDir.keySet()) {
            receiver.makeFood(s,foodDir.get(s));
        }
        System.out.println(order.getDiningTable()+"号订单准备完毕!");
    }
}
