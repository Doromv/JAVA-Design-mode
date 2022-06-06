package pattern.combination;

/**
 * @author Doromv
 * @Description 菜单组件：属于抽象根节点
 * @create 2022-06-06-15:13
 */
public abstract  class MenuComponent {

    protected String name;
    protected int level;

    //添加菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    //移除菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    //获取菜单名称
    public String getName(){
        return name;
    }

    //打印菜单名称(包含子菜单和子菜单项)
    public void print(){
        throw new UnsupportedOperationException();
    }
}
