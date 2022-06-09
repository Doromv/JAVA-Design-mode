package pattern.mediator;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-09-15:08
 */
public class test {

    @Test
    public void Test(){

        MediatorStructure mediator = new MediatorStructure();
        Tenant tenant = new Tenant("小明", mediator);
        HouseOwner houseOwner = new HouseOwner("小红", mediator);
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        tenant.constact("我要租三室一厅");
        houseOwner.constact("我出租三室一厅");
    }
}
