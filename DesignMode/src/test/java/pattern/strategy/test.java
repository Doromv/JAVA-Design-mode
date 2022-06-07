package pattern.strategy;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-07-19:30
 */
public class test {

    @Test
    public void Test(){
        StrategyA strategyA = new StrategyA();
        SalesMan salesMan = new SalesMan(strategyA);
        salesMan.salesManShow();
        System.out.println("==========");
        StrategyB strategyB = new StrategyB();
        salesMan.setStrategy(strategyB);
        salesMan.salesManShow();
    }
}
