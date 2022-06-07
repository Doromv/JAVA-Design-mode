package pattern.strategy;

/**
 * @author Doromv
 * @Description 具体策略类
 * @create 2022-06-07-19:26
 */
public class StrategyC implements Strategy{

    @Override
    public void show() {
        System.out.println("满一千加一元换购任意200元以下商品");
    }
}
