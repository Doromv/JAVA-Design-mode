package pattern.bridge;

/**
 * @author Doromv
 * @Description 具体的实现化角色--avi视频文件
 * @create 2022-06-05-16:05
 */
public class AviFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件："+fileName);
    }
}
