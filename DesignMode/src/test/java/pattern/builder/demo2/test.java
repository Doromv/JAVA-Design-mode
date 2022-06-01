package pattern.builder.demo2;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-01-17:46
 */
public class test {
    @Test
    public void Test(){
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}
