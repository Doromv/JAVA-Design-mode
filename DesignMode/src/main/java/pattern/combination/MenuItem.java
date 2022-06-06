package pattern.combination;

/**
 * @author Doromv
 * @Description 菜单项类：属于叶子节点
 * @create 2022-06-06-15:36
 */
public class MenuItem extends MenuComponent{

    //构造方法
    public MenuItem(String name,int level) {
        this.name=name;
        this.level=level;
    }

    @Override
    public void print() {
        //打印菜单项名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(getName());
    }
}
