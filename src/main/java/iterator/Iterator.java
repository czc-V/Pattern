package iterator;

/**
 * @author ：程智超
 * @date ：Created in 2021/6/28
 * @description：迭代器模式关键接口，定义hasNext，next两个方法
 */
public interface Iterator {

    boolean hasNext();

    Object next();

}
