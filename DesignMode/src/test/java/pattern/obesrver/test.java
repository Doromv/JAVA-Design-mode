package pattern.obesrver;

import org.junit.Test;
import pattern.observer.SubscriptionSubject;
import pattern.observer.VxUser;
import pattern.observer.jdk.Policemen;
import pattern.observer.jdk.Thief;

import java.util.Observer;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-08-17:17
 */
public class test {

    @Test
    public void Test(){
        //创建主题对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //订阅主题对象
        subject.attach(new VxUser("孙悟空"));
        subject.attach(new VxUser("猪悟能"));
        subject.attach(new VxUser("沙悟净"));
        //发送消息
        subject.notify("Doromv");
    }

    @Test
    public void Test1(){
        Thief thief = new Thief("小米");
        Policemen policemen = new Policemen("阿特");
        thief.addObserver(policemen);
        thief.steal();
    }
}
