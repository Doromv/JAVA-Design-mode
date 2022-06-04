package pattern.adapter.class_adapter;

/**
 * @author Doromv
 * @Description 适配器类
 * @create 2022-06-04-15:08
 */
public class TFadapterSD extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read TF card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TF card");
        writeTF(msg);
    }
}
