package iterator;

/**
 * @author ：程智超
 * @date ：Created in 2021/6/28
 * @description：迭代器简单应用
 */

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        Iterator iterator=nameRepository.getIterator();

        for(;iterator.hasNext();){
            String name=(String) iterator.next();
            System.out.println("Name："+name);
        }
    }

}
