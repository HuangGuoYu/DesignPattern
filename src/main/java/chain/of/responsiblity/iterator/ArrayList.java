package chain.of.responsiblity.iterator;

/**
 * Created by AXT on 2017/10/25.
 */
public class ArrayList implements Collection,Iterator{
    private int currentIndex = 0;
    Object[] objects = new Object[10];
    int index = 0;
    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            //copy the old array to newArray
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
         objects[index] = o;
        index++;
    }


    public int size() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        return objects[currentIndex++   ];
    }

    @Override
    public boolean hasNext() {
        if( currentIndex >= index) return false;
        return true;
    }
}
