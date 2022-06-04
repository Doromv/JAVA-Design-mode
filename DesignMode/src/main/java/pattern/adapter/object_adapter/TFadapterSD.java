package pattern.adapter.object_adapter;

/**
 * @author Doromv
 * @Description 适配器类
 * @create 2022-06-04-15:08
 */
public class TFadapterSD implements SDCard {

    //声明适配者类
    private TFCard tfCard;

    public TFadapterSD(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read TF card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TF card");
        tfCard.writeTF(msg);
    }
}
