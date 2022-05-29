package pattern.singleton.饿汉式.demo3;

/**
 * @author Doromv
 * @Description 饿汉式：枚举方式
 * 枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，
 * 并且只会装载一次，设计者充分的利用了枚举的这个特性来实现单例模式，
 * 枚举的写法非常简单，而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。
 * @create 2022-05-29-14:26
 */
public enum Singleton {
    INSTANCE;
}
