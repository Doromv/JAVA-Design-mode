package pattern.flyweight;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-06-16:33
 */
public class test {
    @Test
    public void Test(){
        BoxFactory instance = BoxFactory.getInstance();
        instance.getShape("L").display("红色");
    }
}
