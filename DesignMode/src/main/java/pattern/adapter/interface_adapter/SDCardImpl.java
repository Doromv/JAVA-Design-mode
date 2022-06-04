package pattern.adapter.interface_adapter;

/**
 * @author Doromv
 * @Description 具体的SD卡
 * @create 2022-06-04-15:02
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg="SDCard read msg";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println(msg);
    }
}
