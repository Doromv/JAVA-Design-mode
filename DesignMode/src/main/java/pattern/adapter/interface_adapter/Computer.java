package pattern.adapter.interface_adapter;

/**
 * @author Doromv
 * @Description 计算机类
 * @create 2022-06-04-15:04
 */
public class Computer {

    //从SD卡中读取数据
    public String readSD(SDCard sdCard){
        if(sdCard==null){
            throw new NullPointerException("sd card is not null!");
        }
        return sdCard.readSD();
    }
    //
}
