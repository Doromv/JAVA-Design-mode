package pattern.adapter.interface_adapter;

/**
 * @author Doromv
 * @Description 适配器类
 * @create 2022-06-04-15:08
 */
public class TFadapterSDImpl extends TFadpterSD {

    //声明适配者类
    private TFCard tfCard;

    public TFadapterSDImpl(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read TF card");
        return tfCard.readTF();
    }
}
