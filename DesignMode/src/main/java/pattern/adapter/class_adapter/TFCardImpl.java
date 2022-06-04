package pattern.adapter.class_adapter;

/**
 * @author Doromv
 * @Description 具体的TF卡
 * @create 2022-06-04-14:58
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg="TFCard read msg";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println(msg);
    }
}
