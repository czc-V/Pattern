package iterator;

/**
 * @author ：程智超
 * @date ：Created in 2021/6/28
 * @description：获取迭代器
 */

public class NameRepository implements Container{

    public String[] names={"A","B","C","D"};


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            if(index< names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}
