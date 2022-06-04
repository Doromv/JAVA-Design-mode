package pattern.adapter.object_adapter;

/**
 * @author Doromv
 * @Description 适配者接口
 * @create 2022-06-04-14:56
 */
public interface TFCard {

    //从TF卡中读取数据
    String readTF();
    //往TF卡中写数据
    void writeTF(String msg);
}
