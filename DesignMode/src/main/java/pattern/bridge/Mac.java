package pattern.bridge;

/**
 * @author Doromv
 * @Description 扩展抽象化角色--mac
 * @create 2022-06-05-16:21
 */
public class Mac extends OpratingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("在Mac系统上播放");
        videoFile.decode(fileName);
    }
}
