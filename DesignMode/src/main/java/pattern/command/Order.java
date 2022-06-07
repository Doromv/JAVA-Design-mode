package pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Doromv
 * @Description 订单
 * @create 2022-06-07-20:34
 */
public class Order {

    //餐桌号码
    private int diningTable;
    //所下的餐品及份数
    private Map<String,Integer> foodDir=new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,Integer num) {
        foodDir.put(name,num);
    }
}
