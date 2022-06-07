package pattern.strategy;

/**
 * @author Doromv
 * @Description 具体策略类
 * @create 2022-06-07-19:26
 */
public class StrategyA implements Strategy{

    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
