package pattern.template;

/**
 * @author Doromv
 * @Description 炒包菜类
 * @create 2022-06-06-17:32
 */
public class ConcreteClass_BaoCai extends AbstractClass{

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
