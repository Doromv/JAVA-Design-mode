package pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doromv
 * @Description 菜单类：属于树枝节点
 * @create 2022-06-06-15:26
 */
public class Menu extends MenuComponent {

    //菜单可以有多个子菜单或者子菜单项目
    private List<MenuComponent> menuComponentList=new ArrayList<>();

    //构造方法
    public Menu(String name,int level) {
        this.name=name;
        this.level=level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        //打印菜单名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(getName());
        //打印子菜单或者子菜单项名称
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
