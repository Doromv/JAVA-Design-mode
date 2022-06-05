package pattern.bridge;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-05-16:23
 */
public class test {
    @Test
    public void Test(){

        //创建mac系统对象
        OpratingSystem mac = new Mac(new AviFile());
        //使用mac系统播放视频文件
        mac.play("你的名字");
        //创建windows系统对象
        OpratingSystem windows = new Windows(new RmvbFile());
        //使用windows系统播放视频文件
        windows.play("天气之子");
    }
}
