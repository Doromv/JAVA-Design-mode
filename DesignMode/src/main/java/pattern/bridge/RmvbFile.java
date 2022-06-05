package pattern.bridge;

/**
 * @author Doromv
 * @Description 具体的实现化角色--rmvb视频文件
 * @create 2022-06-05-16:06
 */
public class RmvbFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件："+fileName);
    }
}
