package pattern.bridge;

/**
 * @author Doromv
 * @Description 扩展抽象化角色--windows
 * @create 2022-06-05-16:18
 */
public class Windows extends OpratingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("在Windows系统上播放");
        videoFile.decode(fileName);
    }
}
