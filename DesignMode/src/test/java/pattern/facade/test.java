package pattern.facade;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-05-17:12
 */
public class test {

    @Test
    public void Test(){
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开家电");
        System.out.println("=================================");
        smartAppliancesFacade.say("关闭家电");
    }
}
