package pattern.template;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-06-17:34
 */
public class test {

    @Test
    public void Test(){
        //炒包菜
        //创建对象
        ConcreteClass_BaoCai concreteClass_baoCai = new ConcreteClass_BaoCai();
        //调用炒菜的功能
        concreteClass_baoCai.cookProcess();
    }
}
