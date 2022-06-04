package pattern.adapter.class_adapter;

/**
 * @author Doromv
 * @Description 目标接口
 * @create 2022-06-04-15:00
 */
public interface SDCard {

    //从SD卡中读取数据
    String readSD();
    //往SD卡中写数据
    void writeSD(String msg);
}
