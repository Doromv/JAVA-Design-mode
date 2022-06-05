package pattern.decorator;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-05-15:13
 */
public class test {

    @Test
    public void Test(){
        //点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc()+"  "+ food.cost()+"元");
        System.out.println("============================");
        //在炒饭中加一个鸡蛋
        food=new Egg(food);
        System.out.println(food.getDesc()+"  "+food.cost()+"元");
        System.out.println("============================");
        //再加一份培根
        food = new Bacon(food);
        System.out.println(food.getDesc()+"  "+food.cost()+"元");
    }
}
