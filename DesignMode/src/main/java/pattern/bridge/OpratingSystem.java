package pattern.bridge;

/**
 * @author Doromv
 * @Description 抽象化角色--抽象的操作系统类
 * @create 2022-06-05-16:07
 */
public abstract class OpratingSystem {

    //声明VideFile变量
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
