package pattern.strategy;

/**
 * @author Doromv
 * @Description 促销员
 * @create 2022-06-07-19:28
 */
public class SalesMan {

    //聚合策略类
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //有促销员展示促销活动给用户
    public void salesManShow(){
        strategy.show();
    }
}
