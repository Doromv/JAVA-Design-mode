package pattern.adapter.interface_adapter;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-04-16:20
 */
public abstract class TFadpterSD implements SDCard{
    @Override
    public String readSD() {
        return null;
    }

    @Override
    public void writeSD(String msg) {

    }
}
